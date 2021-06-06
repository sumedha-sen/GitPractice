package com.tyss.projmap;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import com.tyss.projmap.bean.Course;
import com.tyss.projmap.bean.Student;

public class ManyToManyms {

	public static void main(String[] args) {
		
		EntityManagerFactory factory=null;
    	EntityManager manager=null;
    	EntityTransaction transaction=null;
    	
    	 //ArrayList<Course> courses=new ArrayList<Course>();
         ArrayList<Student> students=new ArrayList<Student>();

       
         
//        Student student=new Student();
//        student.setSid(80);
//        student.setSname("sushma");
//        
//        Student student2=new Student();
//        student2.setSid(90);
//        student2.setSname("pooja");
//        
//        Student student3=new Student();
//        student3.setSid(100);
//        student3.setSname("sima");
//        
//        students.add(student);
//        students.add(student2);
//        students.add(student3);
//        
//        course.setStudent(students);
//        
//        student.setCourse(courses);
//        
    	
   	 try
     {
     	factory=EntityFactory.getEntityFactory("MapData");
     	manager=factory.createEntityManager();
     	transaction=manager.getTransaction();
         transaction.begin();
         Course course=manager.find(Course.class,100);
         
//         ArrayList<Course> list2=new ArrayList<Course>();
//         list2.add(course);
         List<Student> list3= course.getStudent();
         
         
         
         
         for(Student std:list3) {
        	 System.out.println(std.getSname());
         }
         
//         course.setStudent(students);
           //manager.persist(student);
       
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

