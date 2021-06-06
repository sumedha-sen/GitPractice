package com.tyss.mycollection.arraylist;

import java.util.*;

public class StudentsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Students> hashset=new HashSet<Students>();
		Students student1=new Students(10,"Tina",9,88);
		Students student2=new Students(20,"Rima",8,78);
		Students student3=new Students(10,"Bina",9,98);
		Students student4=new Students(20,"Tina",9,68);
		Students student5=new Students(30,"Tina",9,68);
		
		hashset.add(student1);
		hashset.add(student2);
		hashset.add(student3);
		hashset.add(student4);
		hashset.add(student5);
		
		Iterator iterator=hashset.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
		
		ArrayList list=new ArrayList(hashset);
		Collections.sort(list);
		System.out.println("after sort");
		
		Iterator iterator2=list.iterator();
		
		while(iterator2.hasNext()) {
			System.out.println(iterator2.next());
			
		}
		
		
 
	}

}
