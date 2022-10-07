package com.te.le.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.le.dao.LeDao;
import com.te.le.dto.LeDto;

@Service
public class LeService {
	@Autowired
	LeDto ldt;

	public boolean validation(String name, String password) {
		boolean validation = ldt.validation(name, password);

		if (validation == true) {
			return true;
		} else {
			return false;
		}
	}

	public void savedetail(LeDao dtl) {
		ldt.savedetail(dtl);

	}

	public String submitbatchdetail(LeDao det) {
		String string = ldt.submitbatchdetail(det);
		return string;
	}

}
