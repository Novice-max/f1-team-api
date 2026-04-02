package com.f1system.f1_team_api.Controller;

import com.f1system.f1_team_api.Service.DriverService;
import com.f1system.f1_team_api.model.Driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DriverController {

    @Autowired
    private DriverService driverService;

    @GetMapping("/api/drivers")
    public List<Driver> getAllDrivers() {
        return driverService.getAllDrivers();
    }

    @GetMapping("/api/drivers/{id}")
    public Driver getDriver(@PathVariable int id) {
        return driverService.getDriver(id);
    }

    @PostMapping("/api/drivers")
    public Driver insertDriver(@RequestBody Driver driver) {
        return driverService.insertDriver(driver);
    }

    @PutMapping("/api/drivers/{id}")
    public Driver updateDriver(@RequestBody Driver driver) {
        return driverService.updateDriver(driver);
    }

    @DeleteMapping("/api/drivers/{id}")
    public void deleteDriver(@PathVariable int id) {
        driverService.deleteDriver(id);
    }
}