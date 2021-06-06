package com.tyss.jpaproj2;

import com.tyss.jpaproj2.bean.Movies1;

import java.util.List;

import javax.persistence.*;
public class DeleteDynamic {
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
             
             String nonselect="delete from Movies1 where id=:id";
             
             Query query=entityManager.createQuery(nonselect);
             
             query.setParameter("id", 10);
             
            int res=query.executeUpdate();
            
            transaction.commit();
            System.out.println(res+"row affected");
             
             
            	 
            	
            	 
             
             
              
             

           
        	 
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



