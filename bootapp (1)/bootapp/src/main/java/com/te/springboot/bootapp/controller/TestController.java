package com.te.springboot.bootapp.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.te.springboot.bootapp.repo.WatchRepo;
import com.te.springboot.bootapp.service.WService;
import com.te.springboot.bootapp.watch.Watch;
import com.te.springboot.bootapp.wservice.impl.WatchC;

@RestController
public class TestController {
@Autowired
	WService wsrvc;
	
	@GetMapping("/test")
	public String test(){
		return "this is me";
	}
@PostMapping("/add")
public Watch addwatch(@RequestBody Watch w) {
	System.out.println(w);
	Watch addwatch = wsrvc.addwatch(w);
	return addwatch;
}

@GetMapping("/getWatch")
public Optional<Watch> getwatch(@RequestParam int wid) {
	Optional<Watch> getwatch = wsrvc.getwatch(wid);
	return getwatch;

}
}