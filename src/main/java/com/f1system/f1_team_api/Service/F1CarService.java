package com.f1system.f1_team_api.Service;

import com.f1system.f1_team_api.model.F1Car;
import com.f1system.f1_team_api.Repository.F1CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class F1CarService {
    @Autowired
    private F1CarRepository f1CarRepository;

    public List<F1Car>getAllF1Cars(){
        return f1CarRepository.findAll();
    }
    public F1Car getF1Car(int id){
       return f1CarRepository.findById(id).orElse(null);
    }
    public F1Car insertF1Car(F1Car f1Car){
        return f1CarRepository.save(f1Car);
    }
    public F1Car updateF1Car(F1Car f1Car){
        return f1CarRepository.save(f1Car);
    }
    public void deleteF1Car(int id){
        f1CarRepository.deleteById(id);
    }
}
