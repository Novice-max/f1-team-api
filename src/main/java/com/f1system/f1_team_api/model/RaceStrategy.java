package com.f1system.f1_team_api.model;
import jakarta.persistence.*;

@Entity
@Table(name ="race_strategies")
public class RaceStrategy {
     
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "strategy_id ")
    private Integer strategyId;
    @Column(name = "strategy_name")
    private String strategyName;
    @Column(name = "tire_choice")
    private String tireChoice;
    @Column(name = "pit_lap")
    private Integer pitLap;
    @Column(name = "fuel_strategy ")
    private String fuelStrategy;
    @Column(name = "driver_id")
    private Integer driverId;

    public RaceStrategy(){}

    public RaceStrategy(Integer strategyId,String strategyName,String tireChoice,Integer pitLap,String fuelStrategy,Integer driverId){
        this.strategyId=strategyId;
        this.strategyName=strategyName;
        this.tireChoice=tireChoice;
        this.pitLap=pitLap;
        this.fuelStrategy=fuelStrategy;
        this.driverId=driverId;
    }

   public Integer getStrategyId(){
    return strategyId;
   }
   public void setStrategyId(Integer strategyId){
    this.strategyId=strategyId;
   }
   public String getStrategyName(){
    return strategyName;
   }
   public void setStrategyName(String strategyName){
    this.strategyName=strategyName;
   }
   public String getTireChoice(){
    return tireChoice;
   }
   public void setTireChoice(String tireChoice){
    this.tireChoice=tireChoice;
   }
   public Integer getPitLap(){
    return pitLap;
   }
   public void setPitLap(Integer pitLap){
    this.pitLap=pitLap;
   }
   public String getFuelStrategy(){
    return fuelStrategy;
   }
   public void setFuelStrategy(String fuelStrategy){
    this.fuelStrategy=fuelStrategy;
   }
   public Integer getDriverId(){
    return driverId;
   }
   public void setDriverId(Integer driverId){
    this.driverId=driverId;
   }

}
