package com.tyss.mycollection.arraylist;

import java.util.Iterator;
import java.util.TreeSet;

public class SortBynameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Students student1=new Students(10,"Tina",9,88);
		Students student2=new Students(20,"Rima",8,78);
		Students student3=new Students(10,"Bina",9,98);
		Students student4=new Students(20,"Tina",9,68);
		Students student5=new Students(30,"Tina",9,68);
		
		SortByName sort=new SortByName();
		TreeSet<Students> tree=new TreeSet<Students>(sort);
		tree.add(student1);
		tree.add(student2);
		tree.add(student3);
		tree.add(student4);
		tree.add(student5);
		
		
		Iterator<Students> iterator=tree.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
	}

}
