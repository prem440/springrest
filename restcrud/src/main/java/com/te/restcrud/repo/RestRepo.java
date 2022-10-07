package com.te.restcrud.repo;

import java.sql.Connection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Repository;

import com.te.restcrud.dto.MDao;

@Repository
public class RestRepo {
	static EntityManagerFactory emf;
	static EntityManager em;
	static EntityTransaction et;

	public static void start() {
		emf = Persistence.createEntityManagerFactory("restcrud");
		em = emf.createEntityManager();
		et = em.getTransaction();
		et.begin();
	}

	public static void close() {
		em.close();

		emf.close();
	}

	public void save(MDao mob) {
		start();
		em.persist(mob);
		et.commit();

	}

	public MDao show(int serial_no) {
		start();
		MDao find = em.find(MDao.class, serial_no);
		et.commit();
		return find;

	}

	public String delete(Integer serial_no) {

		String f = "data deleted sucessfully";
       
		start();
		MDao find = em.find(MDao.class,serial_no);
		System.out.println(find);
		em.remove(find);
		return f;
	}

	public MDao update(int s, String battery) {
		start();
		MDao find = em.find(MDao.class,s);
		find.setBattery(battery);
		et.commit();
		return find;
		
	
		
		
		
	}

	public List showall() {
		start();
		Query createQuery = em.createQuery("from mdao");
		List rl = createQuery.getResultList();
		return rl;
		
	}
	
}
