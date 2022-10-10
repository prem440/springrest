package com.te.techno.service.Interface.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.techno.mentor.Mentor;
import com.te.techno.repository.TechnoRepository;
import com.te.techno.repository.TraineeRepo;
import com.te.techno.services.TechnoServiceInterface;
import com.te.techno.trainee.Trainee;
@Service
public class TechnoServiceImplClass implements TechnoServiceInterface {
	@Autowired
	TechnoRepository tr;
	@Autowired
	TraineeRepo trp;

	@Override
	public Mentor addmentor(Mentor mentor) {
        Mentor save = tr.save(mentor);
		return save;
	}

	@Override
	public Optional<Mentor> show(int emp_id) {
	Optional<Mentor> id = tr.findById(emp_id);
		return id;
	}

	@Override
	public Iterable<Mentor> findall() {
		Iterable<Mentor> findAll = tr.findAll();
		return findAll;
	}

	@Override
	public Mentor update(int empid, String emailId) {
	Optional<Mentor> findById = tr.findById(empid);
		Mentor mentor2 = findById.get();
		if(mentor2!=null) {
			return mentor2;
		}
		else
		    return new Mentor();
		
	}

	@Override
	public String delete(int emp_id) {
		tr.deleteById(emp_id);
		return "entry remove succesfully";
	}

	@Override
	public Mentor byname(String name) {
	Optional<Mentor> findByempName = tr.findByEmpName(name);
	Mentor mentor = findByempName.get();
	System.out.println(mentor);
	if(mentor!=null) {
		return mentor;
	}
	else
		return new Mentor();
	}

	@Override
	public Trainee bytraineename(String tname) {
		Optional<Trainee> findByTraineeName = trp.findByTraineeName(tname);
		Trainee trainee = findByTraineeName.get();
		return trainee;
	}

	@Override
	public Trainee updatetraineedetail(int id, String name) {
       Optional<Trainee> findById = trp.findById(id);
       Trainee trainee = findById.get();
		if(trainee!=null) {
			System.out.println(trainee.getTraineeName());
			trainee.setTraineeName(name);
			System.out.println(trainee.getTraineeName());
			trp.save(trainee);
			return trainee;
		}else
			
       return new Trainee();
	}

}
