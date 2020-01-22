package com.elevate.softwarecompany.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "software_companies")
public class SoftwareCompany extends AbstractEntity{

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "location_id", referencedColumnName = "_id", nullable = false)
    private Location companyLocation;

    @Column(nullable = false)
    private String companyName;

    @Enumerated
    @Column(nullable = false)
    private CompanyType companyType;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<ProgrammingLanguage> technologies;

    public SoftwareCompany(){}

    public SoftwareCompany(Location companyLocation,
                           String companyName,
                           CompanyType companyType,
                           List<ProgrammingLanguage> technologies)
    {
        this.companyLocation = companyLocation;
        this.companyName = companyName;
        this.companyType = companyType;
        this.technologies = technologies;
    }

    public SoftwareCompany(Integer id,
                           Location companyLocation,
                           String companyName,
                           CompanyType companyType,
                           List<ProgrammingLanguage> technologies) throws IllegalArgumentException
    {
        super(id);
        this.companyLocation = companyLocation;
        this.companyName = companyName;
        this.companyType = companyType;
        this.technologies = technologies;
    }

    /**
     * Method which validate constructor parameters
     *
     * @param companyLocation Validate companyLocation parameter
     * @param companyName Validate companyName parameter
     * @param companyType Validate companyType parameter
     * @param technologies Validate technologies parameter
     * @throws IllegalArgumentException if one of these parameters is incorrect
     */
    public void parameterValidation(Location companyLocation, String companyName, CompanyType companyType, List<ProgrammingLanguage> technologies) throws IllegalArgumentException {

        if(companyLocation == null)
            throw new IllegalArgumentException("Parameter companyLocation cannot be null!");

        if(companyName == null)
            throw new IllegalArgumentException("Parameter companyName cannot be null!");

        if(companyType == null)
            throw new IllegalArgumentException("Parameter companyType cannot be null!");

        if(technologies == null)
            throw new IllegalArgumentException("Parameter technologies cannot be null!");

    }

    public Location getCompanyLocation() {
        return companyLocation;
    }

    public String getCompanyName() {
        return companyName;
    }

    public CompanyType getCompanyType() {
        return companyType;
    }

    public List<ProgrammingLanguage> getTechnologies() {
        return technologies;
    }
}
