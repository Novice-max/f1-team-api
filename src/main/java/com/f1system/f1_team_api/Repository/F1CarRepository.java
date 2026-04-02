package com.f1system.f1_team_api.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.f1system.f1_team_api.model.F1Car;
@Repository
public interface F1CarRepository extends JpaRepository<F1Car, Integer> {
    
}
