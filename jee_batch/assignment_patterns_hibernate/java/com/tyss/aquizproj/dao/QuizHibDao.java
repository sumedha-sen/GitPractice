package com.tyss.aquizproj.dao;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.aquizproj.dto.Users;

public class QuizHibDao implements IquizDao{
	
	static EntityManagerFactory entfact = null;
	static EntityManager entman = null;
	static EntityTransaction enttrans = null;
	@Override
	public Users getRegister(int id, String name, String password) {
		
		try {
			entfact = Persistence.createEntityManagerFactory("mapping");
			entman = entfact.createEntityManager();
			enttrans = entman.getTransaction();
			enttrans.begin();
			Users us = new Users();
			us.setUser_id(id);
			us.setPassword(password);
			us.setUsername(name);
		    entman.persist(us);
		    System.out.println("Data inserted");
		    enttrans.commit();
		    return null;

		} catch (Exception e) {
			if (enttrans != null) {
				enttrans.rollback();
			}
			e.printStackTrace();
		} finally {
			if ( entman != null) {
				 entman.close();
			}
			if (entfact != null) {
				entfact.close();
			}
		}
		
		
		return null;
	}

	@Override
	public Users getLogin(String name, String password) {
		// TODO Auto-generated method stub
		
		try {
			entfact = Persistence.createEntityManagerFactory("mapping");
			entman = entfact.createEntityManager();
			enttrans = entman.getTransaction();
			enttrans.begin();
			Users us = new Users();
			
			us.setPassword(password);
			us.setUsername(name);
		    entman.persist(us);
		    System.out.println("Data inserted");
		    enttrans.commit();
		    return null;

		} catch (Exception e) {
			if (enttrans != null) {
				enttrans.rollback();
			}
			e.printStackTrace();
		} finally {
			if ( entman != null) {
				 entman.close();
			}
			if (entfact != null) {
				entfact.close();
			}
		}
		
		
		return null;
		
	
	}
	

}
