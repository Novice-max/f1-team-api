package com.f1system.f1_team_api.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.f1system.f1_team_api.model.Race; 
import com.f1system.f1_team_api.Repository.RaceRepository;
import com.f1system.f1_team_api.exception.ResourceNotFoundException;

import java.util.List;

@Service
public class RaceService {
    @Autowired
    private RaceRepository raceRepository;

    public List<Race> getAllRaces() {
        return raceRepository.findAll();
    }
    public Race getRaceById(int id) {
        return raceRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Race with ID " + id + " not found"));
    }
    public Race insertRace(Race race) {
        return raceRepository.save(race );   
    }
    public Race updateRace(Race race){
        return raceRepository.save(race);
    }     
    public void deleteRace(int id) {
        raceRepository.deleteById(id);          
    }  
}
