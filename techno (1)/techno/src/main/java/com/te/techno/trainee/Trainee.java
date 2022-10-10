package com.te.techno.trainee;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Trainee {
	@Id
	private int traineeId;
	private String traineeName;
	private String traineeDepartment;
	
	

}
