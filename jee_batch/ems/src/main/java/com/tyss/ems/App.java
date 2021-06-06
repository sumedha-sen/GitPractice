package com.tyss.ems;


import java.sql.Date;
import java.text.SimpleDateFormat;
//import java.util.Date;
import java.util.List;
import java.util.Scanner;

import javax.persistence.*;

import com.tyss.ems.bean.Employee;

//import com.tyss.ems.bean.Employee;








public class App {
    public static void main( String[] args )
    
    
    {      
    	while(true) {
    		
    		Scanner sc=new Scanner(System.in);
	    	   System.out.println("1. see all employees 2. see employee according to id  3. update employee according to id  4.  delete employee according to id 5. add employees 6. exit");
	    	   
	    	   int op=sc.nextInt();
	    	   switch(op) {
	    	   
	    	   case 1:
	    	   {
	    		   EntityManagerFactory managerFactory=null;
	               EntityManager entityManager=null;
	            
	               
	             try {
	            	 
	            	  managerFactory=Persistence.createEntityManagerFactory("EmpData");
	                  entityManager=managerFactory.createEntityManager();
	                 
	                 String select=" from Employee";
	                 
	                 Query query=entityManager.createQuery(select);
	                 
	                 List<Employee> emps=query.getResultList();
	                 
	                 for(Employee emp: emps){
	                	 
	                	 System.out.println(emp);
	                	 
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

	    		   break;
	    	   
	    	   }
	    	   
	    	   case 2:
	    	   {
	    		   
	    		   System.out.println("enter id");
	    		   int idvalue=sc.nextInt();
	    		   System.out.println("enter 1 for update and 2 for delete");
	    		   int option=sc.nextInt();
	    		   if(option==1) {
	    			   
	    			   System.out.println("Enter name");
	        	       String namevalue=sc.next();
	        		   EntityManagerFactory managerFactory=null;
	                   EntityManager entityManager=null;
	                   EntityTransaction transaction=null;
	                   
	                
	                   
	                 try {
	                	 
	                	  managerFactory=Persistence.createEntityManagerFactory("EmpData");
	                      entityManager=managerFactory.createEntityManager();
	                      transaction=entityManager.getTransaction();
	                      
	                      transaction.begin();
	                     
	                     String update="update Employee set name=:name where id=:id";
	                     
	                     Query query=entityManager.createQuery(update);
	                     
	                     query.setParameter("id",idvalue);
	                     query.setParameter("name",namevalue);
	                     
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

	        		   break;
	    			   
	    		   }else {
	    			   
	    			   
	        		   EntityManagerFactory managerFactory=null;
	                   EntityManager entityManager=null;
	                   EntityTransaction transaction=null;
	                   
	                
	                   
	                 try {
	                	 
	                	  managerFactory=Persistence.createEntityManagerFactory("EmpData");
	                      entityManager=managerFactory.createEntityManager();
	                      transaction=entityManager.getTransaction();
	                      
	                      transaction.begin();
	                     
	                     String update="delete Employee where id=:id";
	                     
	                     Query query=entityManager.createQuery(update);
	                     
	                     query.setParameter("id",idvalue);
	                  
	                     
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
	    		   
	    		   break;
	    	   }
	    	   
	    	   case 3:
	    		   
	    	   {   
	    		   
	    		   System.out.println("Enter id");
	    	       int idvalue=sc.nextInt();
	    	       System.out.println("Enter name");
	    	       String namevalue=sc.next();
	    		   EntityManagerFactory managerFactory=null;
	               EntityManager entityManager=null;
	               EntityTransaction transaction=null;
	               
	            
	               
	             try {
	            	 
	            	  managerFactory=Persistence.createEntityManagerFactory("EmpData");
	                  entityManager=managerFactory.createEntityManager();
	                  transaction=entityManager.getTransaction();
	                  
	                  transaction.begin();
	                 
	                 String update="update Employee set name=:name where id=:id";
	                 
	                 Query query=entityManager.createQuery(update);
	                 
	                 query.setParameter("id",idvalue);
	                 query.setParameter("name",namevalue);
	                 
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

	    		   break;
	    	   
	    	   }
	    	   
	    	   case 4:
	    	   {
	    		   
	    		   System.out.println("Enter id");
	    	       int idvalue=sc.nextInt();
	    		   EntityManagerFactory managerFactory=null;
	               EntityManager entityManager=null;
	               EntityTransaction transaction=null;
	               
	            
	               
	             try {
	            	 
	            	  managerFactory=Persistence.createEntityManagerFactory("EmpData");
	                  entityManager=managerFactory.createEntityManager();
	                  transaction=entityManager.getTransaction();
	                  
	                  transaction.begin();
	                 
	                 String delete="delete from Employee where id=:id";
	                 
	                 Query query=entityManager.createQuery(delete);
	                 
	                 query.setParameter("id",idvalue);
	                 
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
	    		   break;
	    	   }
	    		   
	    	   
	    	   
	    	   
	    	   case 5:
	    	   {   
	    		   System.out.println("enter id");
	    	        int idval=sc.nextInt();
	    	        System.out.println("enter name");
	    	        String nameval=sc.next();
	    	        System.out.println("enter phoneno");
	    	        Long phoneval=sc.nextLong();
	    	        
	    	        System.out.println("enter dob in dd/MM/yyyy format");
	    	        String stringdate=sc.next();
	    	        EntityManagerFactory managerFactory=null;
	     	       EntityManager entityManager=null;
	     	       EntityTransaction transaction=null;

					
					java.util.Date out = null;
					try {
						out = new SimpleDateFormat("dd/MM/yyyy").parse(stringdate);
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					java.sql.Date date2=new Date(out.getTime());
						
					
	    	        
	    	        
	    	      
	    		   Employee emp=new Employee();
	    	       emp.setId(idval);
	    	       emp.setName(nameval);
	    	       emp.setDob(date2);
	    	       emp.setPhoneno(phoneval);
	    	       
	    	   
	    	       
	    	     try {
	    	    	 
	    	    	  managerFactory=Persistence.createEntityManagerFactory("EmpData");
	    	          entityManager=managerFactory.createEntityManager();
	    	          transaction=entityManager.getTransaction();
	    	          transaction.begin();
	    	          entityManager.persist(emp);
	    	          
	    	          System.out.println("inserted data");

	    	          transaction.commit();
	    	    	 
	    	     }
	    	      catch(Exception e) {
	    	    	  
	    	    	  if(transaction!=null) {
	    	    		  transaction.rollback();
	    	    	  }
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
	    	   
//	    	   case 6:
//	    	   {
//	    		   System.exit(0);
//	    	   }
	    	   
//	    	   default:
//	    	   
 		 
	    	   
	    	  
	    }
	    	  
    		
    	}
		
		
    	
    		
    		
    		
    	
    	   
}
}






