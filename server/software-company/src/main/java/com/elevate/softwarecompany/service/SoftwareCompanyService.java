package com.elevate.softwarecompany.service;

import com.elevate.softwarecompany.model.SoftwareCompany;
import com.elevate.softwarecompany.repository.SoftwareCompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SoftwareCompanyService implements SoftwareCompanyInterface {

    /**
     * Inject SoftwareCompanyRepository dependency
     */
    @Autowired
    SoftwareCompanyRepository softwareCompanyRepository;

    /**
     * Get all (find all) SoftwareCompanies from repository
     * @return list of SoftwareCompany objects
     */
    @Override
    public List<SoftwareCompany> findAll() {
        return softwareCompanyRepository.findAll();
    }

    /**
     * Get one softwareCompany from repository
     * @param id softwareCompany object identifier
     * @return found softwareCompany if exist, otherwise return null
     */
    @Override
    public SoftwareCompany getOne(Integer id) {
        return softwareCompanyRepository.findById(id).isPresent() ? softwareCompanyRepository.findById(id).get(): null;
    }

    /**
     * Save passed object into a repository
     * @param softwareCompany is new softwareCompany to save
     */
    @Override
    public void save(SoftwareCompany softwareCompany) {
        softwareCompanyRepository.save(softwareCompany);
    }


    /**
     * Delete passed object from a repository
     * @param softwareCompany is softwareCompany object ready to being deleted
     */
    @Override
    public void delete(SoftwareCompany softwareCompany) {
        softwareCompanyRepository.delete(softwareCompany);
    }
}
