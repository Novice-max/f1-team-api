package com.f1system.f1_team_api.Service;
import com.f1system.f1_team_api.model.RaceStrategy;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.f1system.f1_team_api.Repository.RaceStrategyRepository;

@Service    
public class RaceStrategyService {
      @Autowired
      private RaceStrategyRepository raceStrategyRepository;

      public List<RaceStrategy>getAllRaceStrategies(){
        return raceStrategyRepository.findAll();
      }
      public RaceStrategy getRaceStrategy(int id){
        return raceStrategyRepository.findById(id).orElse(null);
      }
      public RaceStrategy insertRaceStrategy(RaceStrategy raceStrategy){
        return raceStrategyRepository.save(raceStrategy);
      }
      public RaceStrategy updateRaceStrategy(RaceStrategy raceStrategy){
        return raceStrategyRepository.save(raceStrategy);
      }
      public void deleteRaceStrategy(int id){
            raceStrategyRepository.deleteById(id);
      }
}
