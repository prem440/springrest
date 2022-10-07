package com.te.le.dao;



import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

import lombok.Data;



@Data
@Entity
@Component
public class LeDao {
	@Id
	private String Employeeid;
	private String password;
	private String email;
	private String bname;
	
	
}
