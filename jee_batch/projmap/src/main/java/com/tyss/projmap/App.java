package com.tyss.projmap;

import javax.persistence.*;

import com.tyss.projmap.bean.Employee;
import com.tyss.projmap.bean.SystemInfo;

public class App 
{
    public static void main( String[] args )
    {
    	
        
        	EntityManagerFactory factory=null;
        	EntityManager manager=null;
        	EntityTransaction transaction=null;
        	
        	 try
             {
             	factory=EntityFactory.getEntityFactory("MapData");
             	manager=factory.createEntityManager();
             	transaction=manager.getTransaction();
                 transaction.begin();
             	Employee employeeInfo=new Employee();
             	employeeInfo.setEid(10);
             	employeeInfo.setEname("Sushma");
             	
             	SystemInfo info=new SystemInfo();
             	info.setSid(1);
             	info.setSname("Dell");
             	employeeInfo.setSysteminfo(info);
             	manager.persist(employeeInfo);
             	
             	
             	transaction.commit();
             	
             }catch(Exception e) {
             	if(transaction!=null)
             		transaction.rollback();
             	e.printStackTrace();
             }
        	 
        	 finally {
        		 if(manager!=null) {
        			 
        			 manager.close();
        			 
        		 }
        	 }
        	
        	
        	
        	
        	

        	
        	
        
    }
}
