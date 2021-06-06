package com.tyss.jpaproj2;

import com.tyss.jpaproj2.bean.Movies1;

import java.util.List;

import javax.persistence.*;
public class SingleRecord {
    public static void main( String[] args )
    {
    	   EntityManagerFactory managerFactory=null;
           EntityManager entityManager=null;
        
           
         try {
        	 
        	  managerFactory=Persistence.createEntityManagerFactory("MoviesData");
              entityManager=managerFactory.createEntityManager();
             
             String select="from Movies1 where id=10";
             
             Query query=entityManager.createQuery(select);
             
            Movies1 movies=(Movies1)query.getSingleResult();
             
             
            	 
            	 System.out.println(movies);
            	 
             
             
              
             

           
        	 
         }
          catch(Exception e) {
        	  
        	 
        	  e.printStackTrace();
          
          }
         
         finally {
        	 if(entityManager!=null) {
        		 entityManager.close();
        	 }
        	 if(managerFactory!=null) {
        		 entityManager.close();
        	 }
         }
    }
}

