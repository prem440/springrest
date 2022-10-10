package com.te.techno.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.te.techno.mentor.Mentor;
import com.te.techno.services.TechnoServiceInterface;
import com.te.techno.trainee.Trainee;

@RestController
public class TechnoController {

	@Autowired
	TechnoServiceInterface tsi;

	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}

	@PostMapping("/addmentor")
	public Mentor addmentor(@RequestBody Mentor mentor) {
		Mentor addmentor = tsi.addmentor(mentor);
		return addmentor;

	}

	@GetMapping("/find")
	public Optional<Mentor> show(@RequestParam int emp_id) {
		Optional<Mentor> show = tsi.show(emp_id);
		return show;
	}

	@GetMapping("/show")
	public Iterable<Mentor> showall() {
		Iterable<Mentor> findall = tsi.findall();
		return findall;
	}

	@PostMapping("/update")
	public Mentor update(@RequestParam int emp_id, @RequestParam String email_id) {
		Mentor update = tsi.update(emp_id, email_id);
		return update;
	}

	@PostMapping("/delete")
	public String delete(@RequestParam int emp_id) {
		String delete = tsi.delete(emp_id);
		return delete;
	}

	@GetMapping("/byname")
	public Mentor byname(@RequestParam String name1) {
		Mentor byname = tsi.byname(name1);
		return byname;
	}

	@GetMapping("/trainee")
	public Trainee trainees(@RequestParam String tname) {
		Trainee trainee = tsi.bytraineename(tname);
		return trainee;

	}

	@PostMapping("/updatetrainee")
	public Trainee updatetrainee(@RequestParam int id, @RequestParam String name) {
      return tsi.updatetraineedetail(id,name);
	            
	}
}
