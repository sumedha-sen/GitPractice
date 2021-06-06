package com.tyss.projmap;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityFactory {
	
	static EntityManagerFactory factory=null;
	
	private EntityFactory() {
		
		}
	
	public static EntityManagerFactory  getEntityFactory(String pUnit) {
		
		if(factory==null) {
			
			
			factory=Persistence.createEntityManagerFactory(pUnit);
			
			
			
		}
		return factory;
		
		
		
	}
	
	

}
