package com.elevate.softwarecompany.service;

import com.elevate.softwarecompany.model.Address;
import com.elevate.softwarecompany.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService implements AddressServiceInterface {

    /**
     * Inject AddressRepository dependency
     */
    @Autowired
    AddressRepository addressRepository;

    /**
     * Get all (find all) addresses from repository
     * @return list of Address objects
     */
    @Override
    public List<Address> findAll() {
        return addressRepository.findAll();
    }

    /**
     * Get one address from repository
     * @param id Address object identifier
     * @return found address if exist, otherwise return null
     */
    @Override
    public Address getOne(Integer id) {
        return addressRepository.findById(id).isPresent() ? addressRepository.findById(id).get(): null;
    }

    /**
     * Save passed object into a repository
     * @param address is new address to save
     */
    @Override
    public void save(Address address) {
        addressRepository.save(address);
    }

    /**
     * Delete passed object from a repository
     * @param address is address object ready to being deleted
     */
    @Override
    public void delete(Address address) {
        addressRepository.delete(address);
    }
}
