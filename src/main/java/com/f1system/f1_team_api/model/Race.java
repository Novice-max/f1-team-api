package com.f1system.f1_team_api.model;

import java.time.LocalDate;

import jakarta.persistence.*;
@Entity 
@Table(name = "races")

public class Race {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "race_id")
    private Integer id;
    @Column(name = "race_name")
    private String raceName;
    @Column(name = "circuit")
    private String circuit;
    @Column(name = "race_date")
    private java.sql.Date raceDate;
    @Column(name = "total_laps")
    private Integer totalLaps;
    @Column(name = "winner_driver_id")
    private Integer winnerDriverId;

    public Race(){}

    public Race (String raceName, String circuit, java.sql.Date raceDate, Integer totalLaps, Integer winnerDriverId){
        this.raceName = raceName;
        this.circuit = circuit;
        this.raceDate = raceDate;
        this.totalLaps = totalLaps;
        this.winnerDriverId = winnerDriverId;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }   
    public String getRaceName() {
        return raceName;
    }
    public void setRaceName(String raceName) {
        this.raceName = raceName;
    }
    public String getCircuit() {
        return circuit;
    }
    public void setCircuit(String circuit) {
        this.circuit = circuit;
    }
    public java.sql.Date getRaceDate() {
        return raceDate;
    }
    public void setRaceDate(java.sql.Date raceDate) {
        this.raceDate = raceDate;
    }
    public Integer getTotalLaps() {
        return totalLaps;
    }
    public void setTotalLaps(Integer totalLaps) {
        this.totalLaps = totalLaps;
    }
    public Integer getWinnerDriverId() {
        return winnerDriverId;
    }
    public void setWinnerDriverId(Integer winnerDriverId) {
        this.winnerDriverId = winnerDriverId;
    }
}
