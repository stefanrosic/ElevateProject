package com.elevate.softwarecompany.service;

import com.elevate.softwarecompany.model.SoftwareCompany;

import java.util.List;

public interface SoftwareCompanyInterface {

    List<SoftwareCompany> findAll();

    SoftwareCompany getOne(Integer id);

    void save(SoftwareCompany softwareCompany);

    void delete(SoftwareCompany softwareCompany);
}
