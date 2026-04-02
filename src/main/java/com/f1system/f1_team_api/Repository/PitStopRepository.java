package com.f1system.f1_team_api.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.f1system.f1_team_api.model.PitStop;
import org.springframework.stereotype.Repository;

@Repository
public interface PitStopRepository extends JpaRepository<PitStop, Integer> {
    
}
