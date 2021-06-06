package com.tyss.elftraining.mycollection;

import java.util.*;

public class MyCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<Integer> collection=new ArrayList<Integer>();
		collection.add(10);
		collection.add(30) ;
		collection.add(20);
		collection.add(40);
		System.out.println(collection);
		Collection c1=new ArrayList();
		c1.add(10);
		c1.add("true");
		c1.add(20);
		c1.add(40);
		System.out.println(c1);
		
		System.out.println(c1.contains(20));
		System.out.println(c1.containsAll(collection));
		
		System.out.println(c1.remove(10));
		
		System.out.println(c1.retainAll(collection));
		
		System.out.println(c1);
		
		Object[] arr=collection.toArray();
		for(Object object:arr) {
			System.out.println(object);
			
		}
		
		
		
		
		
		

	}

}
