package com.f1system.f1_team_api.model;

import jakarta.persistence.*;

@Entity
@Table(name = "pit_stops")
public class PitStop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pit_stop_id")
    private Integer pitStopId;
    @Column(name = "driver_id")
    private Integer driverId;
    @Column(name = "lap_number")
    private Integer lapNumber;
    @Column(name = "pit_duration")
    private Double pitDuration;
    @Column(name = "tire_change")   
    private boolean tireChange;
    @Column(name = "fuel_added")    
    private Double fuelAdded;
    @Column(name = "status")
    private String status;

    public PitStop(){}   
    
    public PitStop(Integer pitStopId,Integer driverId,Integer lapNumber,Double pitDuration,boolean tireChange,Double fuelAdded,String status){
        this.pitStopId=pitStopId;
        this.driverId=driverId;
        this.lapNumber=lapNumber;
        this.pitDuration=pitDuration;
        this.tireChange=tireChange;
        this.fuelAdded=fuelAdded;
        this.status=status;
    }       

    public Integer getPitStopId(){
        return pitStopId;
    }               
    public void setPitStopId(Integer pitStopId){
        this.pitStopId=pitStopId;
    }   
    public Integer getDriverId(){
        return driverId;
    }
    public void setDriverId(Integer driverId){
        this.driverId=driverId;
    }
    public Integer getLapNumber(){
        return lapNumber;
    }
    public void setLapNumber(Integer lapNumber){
        this.lapNumber=lapNumber;
    }
    public Double getPitDuration(){
        return pitDuration;
    }
    public void setPitDuration(Double pitDuration){
        this.pitDuration=pitDuration;
    }
    public boolean isTireChange(){
        return tireChange;
    }
    public void setTireChange(boolean tireChange){
        this.tireChange=tireChange;
    }
    public Double getFuelAdded(){
        return fuelAdded;
    }
    public void setFuelAdded(Double fuelAdded){
        this.fuelAdded=fuelAdded;
    }       
    public String getStatus(){
        return status;
    }
    public void setStatus(String status){
        this.status=status;
    }
}
