package com.tyss.aquizproj1.dao;

import javax.persistence.*;

import com.tyss.aquizproj1.dto.Users;

public class QuizHibDao implements Iquiz {
	
	static EntityManagerFactory entfact = null;
	static EntityManager entman = null;
	static EntityTransaction enttrans = null;

	public Users register(int id, String name, String pass) {
		// TODO Auto-generated method stub
		
		entfact = Persistence.createEntityManagerFactory("mapping");
		entman = entfact.createEntityManager();
		enttrans = entman.getTransaction();
		enttrans.begin();
		Users us = new Users();
		us.setUserId(id);
		us.setUsername(name);
		us.setPassword(pass);
		entman.persist(us);
		System.out.println("Data Inserted");
		enttrans.commit();
		return null;
		
	}

	public Users login(String name, String pass) {
		// TODO Auto-generated method stub
		entfact = Persistence.createEntityManagerFactory("mapping");
		entman = entfact.createEntityManager();
		enttrans = entman.getTransaction();
		enttrans.begin();
		String query="from ";
		enttrans.commit();
		return null;
	}

}
