package com.f1system.f1_team_api.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.f1system.f1_team_api.model.RaceStrategy; 

@Repository
public interface RaceStrategyRepository extends JpaRepository<RaceStrategy, Integer> {

    
}
