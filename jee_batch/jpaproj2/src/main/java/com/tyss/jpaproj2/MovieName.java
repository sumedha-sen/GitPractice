package com.tyss.jpaproj2;

import com.tyss.jpaproj2.bean.Movies1;

import java.util.List;

import javax.persistence.*;
public class MovieName 
{
    public static void main( String[] args )
    {
    	   EntityManagerFactory managerFactory=null;
           EntityManager entityManager=null;
        
           
         try {
        	 
        	  managerFactory=Persistence.createEntityManagerFactory("MoviesData");
              entityManager=managerFactory.createEntityManager();
             
             String select=" select name from Movies1";
             
             Query query=entityManager.createQuery(select);
             
             List<String> movies=query.getResultList();
             
             for(String movie: movies){
            	 
            	 System.out.println(movie);
            	 
             }
             
              
             

           
        	 
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
