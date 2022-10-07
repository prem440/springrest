package com.te.restcrud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.restcrud.dto.MDao;
import com.te.restcrud.repo.RestRepo;

import antlr.collections.List;
@Service
public class RestCls  implements RestS{
	@Autowired
	RestRepo repo;

	@Override
	public String save(MDao mob) {
		repo.save(mob);
		return null;
	}


	@Override
	public MDao show(int serial_no) {
		System.out.println("data from service"+serial_no);
		MDao show = repo.show(serial_no);
		return show;
	}


	@Override
	public String delete(int serial_no) {
		System.out.println("service class "+serial_no);
		String delete = repo.delete(serial_no);
		return delete;
	}


	@Override
	public MDao update(int s, String battery) {
		MDao update = repo.update(s,battery);
		return update;
	}


	@Override
	public java.util.List showall() {
		java.util.List list = repo.showall();
		
		return list;
	}



	
}
