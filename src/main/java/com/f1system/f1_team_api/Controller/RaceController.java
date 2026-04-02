package com.f1system.f1_team_api.Controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;
import com.f1system.f1_team_api.model.Race;
import com.f1system.f1_team_api.Service.RaceService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;

@RestController 
public class RaceController {
    @Autowired
    private RaceService raceService;    

    @GetMapping("/api/races")
    public List<Race> getAllRaces() {
        return raceService.getAllRaces();
    }
    @GetMapping("/api/races/{id}")
    public Race getRaceById(@PathVariable int id) {
        return raceService.getRaceById(id);
    }
    @PostMapping("/api/races/")
    public Race insertRace(@RequestBody Race race) {
        return raceService.insertRace(race);
    }
    @PutMapping("/api/races/{id}")
    public Race updateRace(@PathVariable int id, @RequestBody Race race) {
        return raceService.updateRace(race);
    }
    @DeleteMapping("/api/races/{id}")
    public void deleteRace(@PathVariable int id) {
        raceService.deleteRace(id);
    }
}
