package com.f1system.f1_team_api.Service;

import com.f1system.f1_team_api.model.Driver;
import com.f1system.f1_team_api.Repository.DriverRepository;
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
        return driverRepository.findById(id).orElse(null);
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