package com.te.techno.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.te.techno.trainee.Trainee;

public interface TraineeRepo extends CrudRepository<Trainee,Integer> {
	
	Optional<Trainee>findByTraineeName(String tname);
}
