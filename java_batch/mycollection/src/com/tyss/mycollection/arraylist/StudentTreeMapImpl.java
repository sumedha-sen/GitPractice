package com.tyss.mycollection.arraylist;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class StudentTreeMapImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<Student1,Integer> students=new TreeMap<Student1,Integer>(new SortByname1());
		students.put(new Student1(10,"Rima"), 90);
		students.put(new Student1(20,"Sima"), 80);
		students.put(new Student1(30,"Bima"), 60);
		students.put(new Student1(50,"Rima"), 70);
		students.put(new Student1(40,"Rima"), 50);
		
		System.out.println(students);
		Set<Entry<Student1,Integer>> entries=students.entrySet();
		
	   for(Entry<Student1,Integer> entry: entries) {
		
		System.out.println(entry.getKey());
		
		

	}
	}

}
