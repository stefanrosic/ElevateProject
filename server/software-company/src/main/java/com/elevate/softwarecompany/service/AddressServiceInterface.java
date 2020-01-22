package com.elevate.softwarecompany.service;

import com.elevate.softwarecompany.model.Address;

import java.util.List;

public interface AddressServiceInterface {

    List<Address> findAll();

    Address getOne(Integer id);

    void save(Address address);

    void delete(Address address);
}
