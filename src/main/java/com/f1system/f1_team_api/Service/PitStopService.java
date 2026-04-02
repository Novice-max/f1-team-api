package com.f1system.f1_team_api.Service;

import com.f1system.f1_team_api.model.PitStop;
import com.f1system.f1_team_api.Repository.PitStopRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
@Service    
public class PitStopService {
    @Autowired
    private PitStopRepository pitStopRepository;

    public List<PitStop> getAllPitStops(){
        return pitStopRepository.findAll();
    }   
    public PitStop getPitStop(int id){
        return pitStopRepository.findById(id).orElse(null);
    }
    public PitStop insertPitStop(PitStop pitStop){
        return pitStopRepository.save(pitStop);
    }
    public PitStop updatePitStop(PitStop pitStop){
        return pitStopRepository.save(pitStop);
    }
    public void deletePitStop(int id){
        pitStopRepository.deleteById(id);
    }
            
}
