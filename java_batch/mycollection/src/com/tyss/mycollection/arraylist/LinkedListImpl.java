package com.tyss.mycollection.arraylist;

import java.util.*;


public class LinkedListImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> l1=new LinkedList<Integer> ();
		l1.add(10);
		l1.add(30);
		l1.add(20);
		l1.add(40);
		l1.add(90);
		l1.add(90);
	
		
		ArrayList<Integer> c1=new ArrayList<Integer> ();
		c1.add(100);
		c1.add(200);
		c1.add(300);
		c1.add(400);
		System.out.println(c1);
		
		
		System.out.println(l1.contains(10));
		
		
		l1.addFirst(9);
		l1.addAll(c1);
		System.out.println(l1.getFirst());
		
		System.out.println(l1);
		
		Iterator<Integer> iterator=l1.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}

	}

}
