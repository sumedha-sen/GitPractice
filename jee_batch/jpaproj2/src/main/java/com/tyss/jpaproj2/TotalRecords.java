package com.tyss.jpaproj2;

import com.tyss.jpaproj2.bean.Movies1;

import java.util.List;

import javax.persistence.*;
public class TotalRecords {
    public static void main( String[] args )
    {
    	   EntityManagerFactory managerFactory=null;
           EntityManager entityManager=null;
        
           
         try {
        	 
        	  managerFactory=Persistence.createEntityManagerFactory("MoviesData");
              entityManager=managerFactory.createEntityManager();
             
             String select="select count(*) from Movies1";
             
             Query query=entityManager.createQuery(select);
             
            Object movies=query.getSingleResult();
             
             
            	 
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


