package com.f1system.f1_team_api.model;

import jakarta.persistence.*;

@Entity
@Table(name = "f1_cars")
public class F1Car {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "car_id")
    private Integer carId;
    @Column(name ="car_model")
    private String carModel;
    @Column(name ="team_id")
    private Integer teamId;
    @Column(name ="engine_power")
    private Integer enginePower;
    @Column(name ="fuel_capacity")
    private float fuelCapacity;
    @Column(name ="weight")
    private Integer weight;

    public F1Car(){}

    public F1Car(Integer carId,String carModel,Integer teamId,Integer enginePower,float fuelCapacity,Integer weight){
        this.carId=carId;
        this.carModel=carModel;
        this.teamId=teamId;
        this.enginePower=enginePower;
        this.fuelCapacity=fuelCapacity;
        this.weight=weight;
    }

    public Integer getCarId(){
        return carId;
    }
    public void setCarId(Integer carId){
        this.carId=carId;
    }
    public String getCarModel(){
        return carModel;
    }
    public  void setCarModel(String carModel){
        this.carModel=carModel;
    }
    public Integer getTeamId(){
        return teamId;
    }
    public void setTeamId(Integer teamId){
        this.teamId=teamId;
    }
    public Integer getEnginePower(){
        return enginePower;
    }
    public void setEnginePower(Integer enginePower){
        this.enginePower=enginePower;
    }
    public float getFuelCapacity(){
        return fuelCapacity;
    }
    public void setFuelCapacity(float fuelCapacity){
        this.fuelCapacity=fuelCapacity;
    }
    public Integer getWeight(){
        return weight;
    }
    public void setWeight(Integer weight){
        this.weight=weight;
    }


}
