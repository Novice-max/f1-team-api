package com.f1system.f1_team_api.Controller;

import com.f1system.f1_team_api.Service.F1CarService;
import com.f1system.f1_team_api.model.F1Car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class F1CarController {
    @Autowired
    private F1CarService f1CarService;
    
    @GetMapping("/api/F1Cars")
    public List<F1Car>getAllF1Cars(){
        return f1CarService.getAllF1Cars();
    }
    @GetMapping("/api/F1Cars/{id}")
    public F1Car getF1Car(@PathVariable int id){
        return f1CarService.getF1Car(id);
    }
    @PostMapping("/api/F1Cars")
    public F1Car insertF1Car(@RequestBody F1Car f1Car){
        return f1CarService.insertF1Car(f1Car);
    }
    @PutMapping("/api/F1Cars/{id}")
    public F1Car updateF1Car(@PathVariable int id,@RequestBody F1Car f1Car){
        return f1CarService.updateF1Car(f1Car);
    }
    @DeleteMapping("/api/F1Cars/{id}")
    public void deleteF1CAr(@PathVariable int id){
        f1CarService.deleteF1Car(id);
    }


}
