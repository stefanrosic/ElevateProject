package com.elevate.softwarecompany.service;

import com.elevate.softwarecompany.model.Location;
import com.elevate.softwarecompany.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationService implements LocationServiceInterface {

    /**
     * Inject LocationRepository dependency
     */
    @Autowired
    LocationRepository locationRepository;

    /**
     * Get all (find all) locations from repository
     * @return list of Location objects
     */
    @Override
    public List<Location> findAll() {
        return locationRepository.findAll();
    }

    /**
     * Get one address from repository
     * @param id Location object identifier
     * @return found location if exist, otherwise return null
     */
    @Override
    public Location getOne(Integer id) {
        return locationRepository.findById(id).isPresent() ? locationRepository.findById(id).get(): null;
    }

    /**
     * Save passed object into a repository
     * @param location is new location to save
     */
    @Override
    public void save(Location location) {
        locationRepository.save(location);
    }

    /**
     * Delete passed object from a repository
     * @param location is location object ready to being deleted
     */
    @Override
    public void delete(Location location) {
        locationRepository.delete(location);
    }
}
