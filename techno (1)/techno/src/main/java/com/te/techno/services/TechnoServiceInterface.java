package com.te.techno.services;

import java.util.Optional;

import com.te.techno.mentor.Mentor;
import com.te.techno.trainee.Trainee;

public interface TechnoServiceInterface {

	public Mentor addmentor(Mentor mentor);

	public Optional<Mentor> show(int emp_id);

	public Iterable<Mentor> findall();

	public Mentor update(int emp_id, String email_id);

	public String delete(int emp_id);

	public Mentor byname(String name);

	public Trainee bytraineename(String tname);

	public Trainee updatetraineedetail(int id, String name);
	

}
