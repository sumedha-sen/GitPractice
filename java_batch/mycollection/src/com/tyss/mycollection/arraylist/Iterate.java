package com.tyss.mycollection.arraylist;

import java.util.*;

public class Iterate {
	public static void main(String[]args) {
		ArrayList<Integer> arraylist=new ArrayList<Integer>();
		arraylist.add(10);
		arraylist.add(50);
		arraylist.add(30);
		arraylist.add(20);
		
		arraylist.add(40);
		System.out.println("for loop");
		
		for(int i=0;i<arraylist.size();i++) {
			System.out.println(arraylist.get(i));
			
		}
		
		System.out.println("for-each loop");
		for(Integer object:arraylist) {
			System.out.println(object);
			
		}
		System.out.println("using iterator");
		Iterator<Integer> iterator=arraylist.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
		
		System.out.println("using list-iterator-forward");
		ListIterator<Integer> listiterator=arraylist.listIterator();
		while(listiterator.hasNext()) {
			System.out.println(listiterator.next());
			
		}
		
		
		System.out.println("using list-iterator-backward");
		ListIterator<Integer> listiterator2=arraylist.listIterator(arraylist.size());
		while(listiterator2.hasPrevious()) {
			System.out.println(listiterator.previous());
			
		}
		
		System.out.println("");
		
		
		
		
		
		
	}

}
