package com.f1system.f1_team_api.Controller;

import com.f1system.f1_team_api.Service.PitStopService;
import com.f1system.f1_team_api.model.PitStop;
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;



@RestController 
public class PitStopController {
    @Autowired
    private PitStopService pitStopService;

    @GetMapping("/api/PitStop")
    public List<PitStop> getAllPitStops(){
        return pitStopService.getAllPitStops();
    }   
    @GetMapping("/api/PitStop/{id}")
    public PitStop getPitStop(@PathVariable int id){
        return pitStopService.getPitStop(id);
    }
    @PostMapping("/api/PitStop")
    public PitStop postPitStop(@RequestBody PitStop pitStop) {
        return pitStopService.insertPitStop(pitStop);
    }
    @PutMapping("/api/PitStop/{id}")
    public PitStop updatePitStop(@PathVariable int id, @RequestBody PitStop pitStop) {
        return pitStopService.updatePitStop(pitStop);
    }
    @DeleteMapping("/api/PitStop/{id}")
    public void deletePitStop(@PathVariable int id) {
        pitStopService.deletePitStop(id);
    }
    
}
