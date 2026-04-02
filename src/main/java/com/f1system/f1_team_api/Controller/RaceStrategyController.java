package com.f1system.f1_team_api.Controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.f1system.f1_team_api.Service.RaceStrategyService;
import com.f1system.f1_team_api.model.RaceStrategy;
import org.springframework.beans.factory.annotation.Autowired;
@RestController
public class RaceStrategyController {
      @Autowired
      private RaceStrategyService raceStrategyService;

      @GetMapping("/api/racestrategies")
      public List<RaceStrategy>getAllRaceStrategies(){
        return raceStrategyService.getAllRaceStrategies();
      }

      @GetMapping("/api/racestrategies/{id}")
     public RaceStrategy getRaceStrategy(@PathVariable int id){
        return raceStrategyService.getRaceStrategy(id);
     }
     @PostMapping("/api/racestrategies")
     public RaceStrategy insertRaceStrategy(@RequestBody RaceStrategy raceStrategy){
        return raceStrategyService.insertRaceStrategy(raceStrategy);
     }
     @PutMapping("/api/racestrategies/{id}")
     public RaceStrategy updateRaceStragegy(@PathVariable int id,@RequestBody RaceStrategy raceStrategy){
             return raceStrategyService.updateRaceStrategy(raceStrategy);
     }
     @DeleteMapping("/api/racestrategies/{id}")
     public void deleteRaceStrategy(@PathVariable int id){
        raceStrategyService.deleteRaceStrategy(id);
     }

}
