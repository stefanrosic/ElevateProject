package com.elevate.softwarecompany.service;

import com.elevate.softwarecompany.model.Location;

import java.util.List;

public interface LocationServiceInterface {

    List<Location> findAll();

    Location getOne(Integer id);

    void save(Location location);

    void delete(Location location);
}
