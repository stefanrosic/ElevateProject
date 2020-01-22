package com.elevate.softwarecompany.model;

import javax.persistence.*;

@Entity
@Table(name = "locations")
public class Location extends AbstractEntity{

    @Column(nullable = false)
    private Double latitude;

    @Column(nullable = false)
    private Double longitude;

    @OneToOne
    @JoinColumn(name = "address_id", referencedColumnName = "_id")
    private Address address;

    public Location(){}

    public Location(Double latitude,
                    Double longitude,
                    Address address) throws IllegalArgumentException
    {
        super();
        parameterValidation(latitude,longitude,address);
        this.latitude = latitude;
        this.longitude = longitude;
        this.address = address;
    }

    public Location(Integer id,
                    Double latitude,
                    Double longitude,
                    Address address) throws IllegalArgumentException
    {
        super(id);
        parameterValidation(latitude,longitude,address);
        this.latitude = latitude;
        this.longitude = longitude;
        this.address = address;
    }

    /**
     * Constructor parameters method validation
     *
     * @param latitude of location to validate
     * @param longitude of location to validate
     * @param address of location to validate
     * @throws IllegalArgumentException if one of these is incorrect
     */
    public void parameterValidation(Double latitude, Double longitude, Address address) throws IllegalArgumentException {

        if(latitude == null)
            throw new IllegalArgumentException("Parameter latitude cannot be null!");

        if(longitude == null)
            throw new IllegalArgumentException("Parameter longitude cannot be null!");

        if(address == null)
            throw new IllegalArgumentException("Parameter address cannot be null!");
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public Address getAddress() {
        return address;
    }
}
