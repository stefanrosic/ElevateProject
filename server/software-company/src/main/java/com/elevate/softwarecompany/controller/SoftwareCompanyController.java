package com.elevate.softwarecompany.controller;

import com.elevate.softwarecompany.dto.SoftwareCompanyDTO;
import com.elevate.softwarecompany.model.SoftwareCompany;
import com.elevate.softwarecompany.service.LocationService;
import com.elevate.softwarecompany.service.SoftwareCompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class SoftwareCompanyController {

    @Autowired
    SoftwareCompanyService softwareCompanyService;

    @Autowired
    LocationService locationService;

    @RequestMapping(value = "/software-company", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<SoftwareCompanyDTO>> getSoftwareCompanies() {

        List<SoftwareCompanyDTO> softwareCompanyDTOs = softwareCompanyService.findAll().stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
        return new ResponseEntity<>(softwareCompanyDTOs, HttpStatus.OK);
    }

    @RequestMapping(value = "/software-company/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<SoftwareCompanyDTO> getSoftwareCompany(@PathVariable("id") int id) {
        SoftwareCompany softwareCompany = softwareCompanyService.getOne(id);

        if(softwareCompany == null)
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        SoftwareCompanyDTO softwareCompanyDTO = this.convertToDto(softwareCompany);
        return new ResponseEntity<>(softwareCompanyDTO, HttpStatus.OK);
    }

    public SoftwareCompanyDTO convertToDto(SoftwareCompany softwareCompany) {
        SoftwareCompanyDTO softwareCompanyDTO = new SoftwareCompanyDTO(softwareCompany);
        return softwareCompanyDTO;
    }

}
