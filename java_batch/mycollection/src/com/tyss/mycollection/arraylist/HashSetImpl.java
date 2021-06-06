package com.tyss.mycollection.arraylist;

import java.util.*;

public class HashSetImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet l1=new HashSet ();
		l1.add(10);
		l1.add(null);
		l1.add("Example");
		l1.add(40);
		l1.add(40);
		l1.add(true);
		System.out.println(l1.contains(10));
		
		Iterator iterator=l1.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
		

	}

}
