package com.te.techno.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.te.techno.mentor.Mentor;
import com.te.techno.trainee.Trainee;
@Repository
public interface TechnoRepository extends CrudRepository<Mentor, Integer>{

	
Optional<Mentor> findByEmpName(String name);

}
