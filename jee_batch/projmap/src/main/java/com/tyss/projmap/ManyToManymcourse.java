package com.tyss.projmap;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import com.tyss.projmap.bean.Course;
import com.tyss.projmap.bean.Student;

public class ManyToManymcourse {

	public static void main(String[] args) {
		
		EntityManagerFactory factory=null;
    	EntityManager manager=null;
    	EntityTransaction transaction=null;
    	
    	 ArrayList<Course> courses=new ArrayList<Course>();
         ArrayList<Student> students=new ArrayList<Student>();

       
         
        Student student=new Student();
        student.setSid(8);
        student.setSname("sush");
        
        Student student2=new Student();
        student2.setSid(9);
        student2.setSname("sammy");
        
        Student student3=new Student();
        student3.setSid(11);
        student3.setSname("summ");
        
        students.add(student);
        students.add(student2);
        students.add(student3);
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
         
       
          courses.add(course);
          
          student.setCourse(courses);
          student2.setCourse(courses);
          student3.setCourse(courses);
          
          course.setStudent(students);


         
         
         
         
//         for(Student std:list3) {
//        	 System.out.println(std.getSname());
//         }
         
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

