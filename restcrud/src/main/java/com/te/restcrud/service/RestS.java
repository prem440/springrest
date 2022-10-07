package com.te.restcrud.service;

import org.springframework.stereotype.Service;

import com.te.restcrud.dto.MDao;
import com.te.restcrud.restcontroller.RestC;

import antlr.collections.List;

public interface RestS {
	public String save(MDao mob);
	public String delete(int serial_no);
	public MDao show(int serial_no);
	public MDao update(int s, String battery);
	public java.util.List showall();
	
	

}
