package com.qa.rest;

import com.qa.business.TrainerService;
import com.qa.persistence.domain.Trainer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TrainerController {

    private TrainerService service;

    public TrainerController(TrainerService service){
        this.service = service;
    }

    @GetMapping(value = "trainer")
    public List<Trainer> getAllTrainers(){
        return service.getTrainers();
    }

    @PostMapping(value = "trainer")
    public Trainer saveTrainer(@RequestBody Trainer trainer){
        return service.createTrainer(trainer);
    }

}
