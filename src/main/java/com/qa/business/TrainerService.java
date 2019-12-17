package com.qa.business;

import com.qa.persistence.domain.Trainer;
import com.qa.persistence.repo.TrainerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainerService {

    private TrainerRepository repo;

    public TrainerService(TrainerRepository repo) {
        this.repo = repo;
    }

    public List<Trainer> getTrainers() {
        return repo.findAll();
    }

    public Trainer createTrainer(Trainer trainer) {
        return repo.save(trainer);
    }
}
