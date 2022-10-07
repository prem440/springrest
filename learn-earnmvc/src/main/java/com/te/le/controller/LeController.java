package com.te.le.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.te.le.dao.LeDao;
import com.te.le.service.LeService;

@Controller
public class LeController {
	@Autowired
	LeService srvc;

	@GetMapping("/admin")
	public String m1() {
		return "home";

	}
	@GetMapping("/one")
	public String one() {
		return"addbatch";
	}

 	@GetMapping("/adminform")
	public String m2() {
		return "/adminform";
	}

	@PostMapping("/justthankyoumsg")
	public String m3(LeDao dtl) {
		srvc.savedetail(dtl);
		return "/justthankyoumsg";

	}

	@PostMapping("/gethomepage")
	public String gethomepage(@RequestParam("Employeeid") String name, @RequestParam String password) {
		boolean validation = srvc.validation(name, password);
		if (validation = true) {
			return "/main";

		} else {
			return "/index";
		}
	}
	@PostMapping("/submitbatchdetail")
	public String submitbatchdetail(LeDao det) {
	   return srvc.submitbatchdetail(det);
		
	}
}
