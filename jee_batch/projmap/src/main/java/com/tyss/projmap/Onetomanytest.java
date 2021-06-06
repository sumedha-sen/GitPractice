package com.tyss.projmap;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.tyss.projmap.bean.Employee;
import com.tyss.projmap.bean.Item;
import com.tyss.projmap.bean.SystemInfo;

public class Onetomanytest {
	public static void main(String []args) {
		
		EntityManagerFactory factory=null;
    	EntityManager manager=null;
    	EntityTransaction transaction=null;
    	
   	 try
     {
     	factory=EntityFactory.getEntityFactory("MapData");
     	manager=factory.createEntityManager();
     	transaction=manager.getTransaction();
         transaction.begin();
         
         //find cart and add items:----------------
         
//         Cart cart=manager.find(Cart.class,100);
//         
//         ArrayList<Item> items=new ArrayList<Item>();
//         items.add(item);
//         item.setCart(cart);
//         
//         cart.setItems(items);
         
         //fetch  items:---------------------------- 
         
         
         
         
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
