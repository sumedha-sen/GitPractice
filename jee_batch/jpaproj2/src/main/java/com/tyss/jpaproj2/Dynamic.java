package com.tyss.jpaproj2;

import com.tyss.jpaproj2.bean.Movies1;

import java.util.List;

import javax.persistence.*;
public class Dynamic {
    public static void main( String[] args )
    {
    	   EntityManagerFactory managerFactory=null;
           EntityManager entityManager=null;
        
           
         try {
        	 
        	  managerFactory=Persistence.createEntityManagerFactory("MoviesData");
              entityManager=managerFactory.createEntityManager();
             
             String read="from Movies1 where id=:id";
             
             Query query=entityManager.createQuery(read);
             //query.setParameter("id", 10);
             query.setParameter("id",Integer.parseInt(args[0]));
             
            Movies1 movies=(Movies1)query.getSingleResult();
             
             
            	 
            	 System.out.println(movies.getId());
            	 System.out.println(movies.getName());
            	 System.out.println(movies.getRating());
            	 System.out.println(movies.getReviews());
            	 
            	 
             
             
              
             

           
        	 
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

