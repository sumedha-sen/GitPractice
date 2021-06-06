package com.tyss.mycollection.arraylist;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet l1=new LinkedHashSet(); 
		l1.add(10);
		l1.add(true);
		l1.add(null);
		l1.add(null);
		l1.add("example");
		l1.add(20);
		l1.add(10);
		
		Iterator iterator=l1.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
		

	}

}
