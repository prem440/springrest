package com.te.restcrud.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.te.restcrud.dto.MDao;
import com.te.restcrud.service.RestS;

import antlr.collections.List;

@RestController
public class RestC {
	@Autowired
	RestS srvc;

	@PostMapping(path = "/save", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public MDao save(@RequestBody MDao mob) {
		String t = srvc.save(mob);

		return mob;
	}

	@GetMapping(path = "/show", produces = MediaType.APPLICATION_JSON_VALUE)
	public MDao show(@RequestParam int serial_no) {
		MDao show = srvc.show(serial_no);
		return show;

	}
	@PostMapping(path = "/delete", produces = MediaType.APPLICATION_JSON_VALUE )
	public String delete(@RequestParam int serial_no) {
		System.out.println("data "+serial_no);
		String delete = srvc.delete(serial_no);
		System.out.println(serial_no);
		String t="something went wrong,sorry bro";
		if(delete!=null) {
			return delete;
		}
		else return t;
	}
	@PostMapping(path = "/update",produces = MediaType.APPLICATION_JSON_VALUE)
	public MDao update(@RequestParam int serial_no ,@RequestParam  String battery) {
	 MDao update = srvc.update(serial_no,battery);
	 return update;
	
	}
@PostMapping(path="/showall",produces = MediaType.APPLICATION_JSON_VALUE)
public List showall() {
	java.util.List showall = srvc.showall();
	return showall();
}
}
