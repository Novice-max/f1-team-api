package com.f1system.f1_team_api.model;

import jakarta.persistence.*;

@Entity
@Table(name = "drivers")
public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "driver_id")
    private Integer driverId;

    @Column(name = "name")
    private String name;

    @Column(name = "nationality")
    private String nationality;

    @Column(name = "driver_number")
    private Integer driverNumber;

    @Column(name = "team_id")
    private Integer teamId;

    @Column(name = "experience_years")
    private Integer experienceYears;

    public Driver() {}

    public Driver(Integer driverId, String name, String nationality, Integer driverNumber, Integer teamId, Integer experienceYears) {
        this.driverId = driverId;
        this.name = name;
        this.nationality = nationality;
        this.driverNumber = driverNumber;
        this.teamId = teamId;
        this.experienceYears = experienceYears;
    }

    public Integer getDriverId() { return driverId; }
    public void setDriverId(Integer driverId) { this.driverId = driverId; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getNationality() { return nationality; }
    public void setNationality(String nationality) { this.nationality = nationality; }
    public Integer getDriverNumber() { return driverNumber; }
    public void setDriverNumber(Integer driverNumber) { this.driverNumber = driverNumber; }
    public Integer getTeamId() { return teamId; }
    public void setTeamId(Integer teamId) { this.teamId = teamId; }
    public Integer getExperienceYears() { return experienceYears; }
    public void setExperienceYears(Integer experienceYears) { this.experienceYears = experienceYears; }
}