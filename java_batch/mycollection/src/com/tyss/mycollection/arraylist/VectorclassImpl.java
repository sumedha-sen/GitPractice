package com.tyss.mycollection.arraylist;

import java.util.*;

public class VectorclassImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> l1=new Vector<Integer> ();
		l1.add(10);
		l1.add(30);
		l1.add(20);
		l1.add(40);
		l1.add(80);
		
		Iterator<Integer> iterator=l1.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
		
		

	}

}
