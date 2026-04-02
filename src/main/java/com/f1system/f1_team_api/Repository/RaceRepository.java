package com.f1system.f1_team_api.Repository;

import org.springframework.stereotype.Repository;
import com.f1system.f1_team_api.model.Race;
import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface RaceRepository extends JpaRepository<Race, Integer> {
    
}
