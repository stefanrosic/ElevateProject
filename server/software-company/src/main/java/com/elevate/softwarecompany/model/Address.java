package com.elevate.softwarecompany.model;

public class Address {

    private String street;
    private String number;
    private City city;
    private String zipCode;

    public Address(){}

    public Address(String street, String number, City city, String zipCode) {
        this.street = street;
        this.number = number;
        this.city = city;
        this.zipCode = zipCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
