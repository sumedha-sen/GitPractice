package com.tyss.jpaproj2;

import com.tyss.jpaproj2.bean.Movies1;

import java.util.List;

import javax.persistence.*;
public class Delete {
    public static void main( String[] args )
    {
    	   EntityManagerFactory managerFactory=null;
           EntityManager entityManager=null;
           EntityTransaction transaction=null;
        
           
         try {
        	 
        	  managerFactory=Persistence.createEntityManagerFactory("MoviesData");
              entityManager=managerFactory.createEntityManager();
              transaction=entityManager.getTransaction();
              
              transaction.begin();
             
             String select="delete from Movies1 where id=20";
             
             Query query=entityManager.createQuery(select);
             
            int res=query.executeUpdate();
            transaction.commit();
             
             
            	 
            	 System.out.println(res);
            	 
             
             
              
             

           
        	 
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

