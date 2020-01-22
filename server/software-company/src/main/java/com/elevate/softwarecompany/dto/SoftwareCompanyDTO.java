package com.elevate.softwarecompany.dto;

import com.elevate.softwarecompany.model.CompanyType;
import com.elevate.softwarecompany.model.SoftwareCompany;

import java.io.Serializable;

public class SoftwareCompanyDTO implements Serializable {

    private Integer locationId;
    private String companyName;
    private CompanyType companyType;

    public SoftwareCompanyDTO(){}

    public SoftwareCompanyDTO(SoftwareCompany softwareCompany)
    {
        this.locationId = softwareCompany.getCompanyLocation().getId();
        this.companyName = softwareCompany.getCompanyName();
        this.companyType = softwareCompany.getCompanyType();
    }

    public Integer getLocationId() {
        return locationId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public CompanyType getCompanyType() {
        return companyType;
    }
}
