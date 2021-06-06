package com.tyss.mycollection.arraylist;

import java.util.*;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Student> arraylist=new ArrayList<Student>();
		arraylist.add(new Student(10,"Pallavi"));
		arraylist.add(new Student(50,"Rima"));
		arraylist.add(new Student(30,"Bindu"));
		arraylist.add(new Student(20,"Tina"));
		
		System.out.println("before sorting");
		
		for(Student student:arraylist) {
			System.out.println(student);
			
		}
		
//		Collections.sort(arraylist,new Student());
//		System.out.println("after sorting");
//		for(Student student:arraylist) {
//			System.out.println(student);
//		}

		
		System.out.println();
	}

}
