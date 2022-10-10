package com.te.techno.mentor;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.te.techno.trainee.Trainee;


import lombok.Data;
@Data
@Entity
public class Mentor {
	@OneToMany(cascade = CascadeType.ALL )
	List<Trainee> trainees;
	
	 
	@Id
	private int empId;
	private String empName;
    private String emailId;
    

}
