package com.te.spring.controller;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.print.attribute.standard.Media;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.te.springdto.Employee;

@Controller
@ResponseBody
public class EmpController {
	List<Employee> al = Arrays.asList(new Employee(6, "ravi", "software engineer"),
			new Employee(2, "anil", "developer"), new Employee(3, "rushi", "junior developer"));

	@GetMapping(path = "/test", produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee testg() {
		Employee emp = new Employee();
		emp.setId(2);
		emp.setName("ravi");
		return emp;

	}

	@PostMapping(path = "/save", consumes = MediaType.APPLICATION_ATOM_XML_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee save(@RequestBody Employee emp) {
		System.out.println("emp");
		return emp;
	}

	@GetMapping(path = "/get", produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee get(@RequestParam String name, @RequestParam Integer id) {
		List<Employee> list = al.stream().filter(t -> t.getName().equals(name)).collect(Collectors.toList());
		System.out.println(list.get(0));
		if (list.get(0).getId() > id) {
			return list.get(0);

		}
		return new Employee();
	}
}
