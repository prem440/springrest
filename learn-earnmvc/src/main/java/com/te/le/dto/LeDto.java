package com.te.le.dto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.te.le.dao.LeDao;



@Repository
public class LeDto {
	@Autowired
	LeDao dt;
	
	
private static EntityManagerFactory emf;
	private static EntityManager em;
	private static EntityTransaction et;
	
	
	public static void starttransaction() {
		 emf= Persistence.createEntityManagerFactory("lms");
		  em = emf.createEntityManager();
           et = em.getTransaction();
           et.begin();
           
	}
	
	public boolean validation(String name, String password) {
		starttransaction();
		if(name.equalsIgnoreCase(dt.getEmployeeid())&&(password.equalsIgnoreCase(dt.getPassword()))){
			
			
			return true;	
			
		}
		else {
			return false;
		}
		
	}

	public void savedetail(LeDao dtl) {
		starttransaction();
		em.persist(dtl);
		et.commit();
		System.out.println("all details are save");
		
		
		
	}

	public String submitbatchdetail(LeDao det) {
		starttransaction();
		em.persist(det);
		et.commit();
		return "data save successfully";
		
	}

}
