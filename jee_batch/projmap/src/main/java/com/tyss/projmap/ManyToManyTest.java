package com.tyss.projmap;

import java.util.ArrayList;

import javax.persistence.*;

import com.tyss.projmap.bean.Course;
import com.tyss.projmap.bean.Student;

public class ManyToManyTest {

	public static void main(String[] args) {
		
		EntityManagerFactory factory=null;
    	EntityManager manager=null;
    	EntityTransaction transaction=null;
    	
    	 ArrayList<Course> courses=new ArrayList<Course>();
         ArrayList<Student> students=new ArrayList<Student>();

         Course course=new Course();
         course.setCid(100);
         course.setCname("Java");
         
         Course course1=new Course();
         course1.setCid(200);
         course1.setCname("JDBC");
         
         Course course3=new Course();
         course3.setCid(300);
         course3.setCname("Hibernate");
         
         courses.add(course);
         courses.add(course1);
         courses.add(course3);
         
        Student student=new Student();
        student.setSid(10);
        student.setSname("sumedha");
        
        students.add(student);
        
        course.setStudent(students);
        
        student.setCourse(courses);
        
    	
   	 try
     {
     	factory=EntityFactory.getEntityFactory("MapData");
     	manager=factory.createEntityManager();
     	transaction=manager.getTransaction();
         transaction.begin();
         manager.persist(student);
       
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
