package com.f1system.f1_team_api.Service;

import com.f1system.f1_team_api.model.Driver;
import com.f1system.f1_team_api.Repository.DriverRepository;
import com.f1system.f1_team_api.exception.ResourceNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverService {

    @Autowired
    private DriverRepository driverRepository;

    public List<Driver> getAllDrivers() {
        return driverRepository.findAll();
    }

    public Driver getDriver(int id) {
        return driverRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Driver with ID " + id + " not found"));
    }

    public Driver insertDriver(Driver driver) {
        return driverRepository.save(driver);
    }

    public Driver updateDriver(Driver driver) {
        return driverRepository.save(driver);
    }

    public void deleteDriver(int id) {
        driverRepository.deleteById(id);
    }
}