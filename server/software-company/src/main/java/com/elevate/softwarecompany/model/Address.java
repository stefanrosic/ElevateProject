package com.elevate.softwarecompany.model;

import com.elevate.softwarecompany.util.RegularExpressions;

import javax.persistence.*;

@Entity
@Table(name = "addresses")
public class Address extends AbstractEntity{

    @Column(nullable = false)
    private String street;

    @Column(name = "_number", nullable = false)
    private String number;

    @Enumerated
    @Column(nullable = false)
    private City city;

    @Column(name = "zip_code", nullable = false)
    private String zipCode;

    public Address(){}

    public Address(String street,
                   String number,
                   City city,
                   String zipCode) throws IllegalArgumentException
    {
        super();
        parameterValidation(street,number,city,zipCode);
        this.street = street;
        this.number = number;
        this.city = city;
        this.zipCode = zipCode;
    }

    public Address(Integer id,
                   String street,
                   String number,
                   City city,
                   String zipCode) throws IllegalArgumentException
    {
        super(id);
        parameterValidation(street,number,city,zipCode);
        this.street = street;
        this.number = number;
        this.city = city;
        this.zipCode = zipCode;
    }
    
    /**
     * Method which validate constructor parameters
     *
     * @param street Validate street parameter
     * @param number Validate number parameter
     * @param city Validate city parameter
     * @param zipCode Validate zipCode parameter
     * @throws IllegalArgumentException if one of these parameters is incorrect
     */
    public void parameterValidation(String street, String number, City city, String zipCode) throws IllegalArgumentException {

        if(street == null)
            throw new IllegalArgumentException("Parameter street cannot be null!");
        else if (!street.matches(RegularExpressions.name))
            throw new IllegalArgumentException("Parameter street can only contains a characters!");

        if(number == null)
            throw new IllegalArgumentException("Parameter number cannot be null!");

        if(city == null)
            throw new IllegalArgumentException("Parameter city cannot be null!");

        if(zipCode == null)
            throw new IllegalArgumentException("Parameter zipCode cannot be null!");
        else if (!street.matches(RegularExpressions.zipCode))
            throw new IllegalArgumentException("Parameter zipCode can only contains a digits!");
    }

    public String getStreet() {
        return street;
    }

    public String getNumber() {
        return number;
    }

    public City getCity() {
        return city;
    }

    public String getZipCode() {
        return zipCode;
    }
}
