package com.elevate.softwarecompany.repository;

import com.elevate.softwarecompany.model.SoftwareCompany;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SoftwareCompanyRepository extends JpaRepository<SoftwareCompany, Integer> {
}
