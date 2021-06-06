package com.tyss.jpaproj2;

import com.tyss.jpaproj2.bean.Movies1;

import java.util.List;

import javax.persistence.*;
public class MultipleDynamicUpdate {
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
             
             String update="update Movies1 set name=:name, rating=:rating where id=:id";
             
             Query query=entityManager.createQuery(update);
             query.setParameter("id", 10);
             query.setParameter("name","roy");
             query.setParameter("rating",7.0);
             
             //query.setParameter("id", Integer.parseInt(args[2]));
//             query.setParameter("name","roy");
//             query.setParameter("rating",7.0);
             
             
            int res=query.executeUpdate();
            transaction.commit();
             
             
            	 
            System.out.println(res+ "rows affected");
            	 
            	 
             
             
              
             

           
        	 
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


