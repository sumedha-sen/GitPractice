package com.tyss.mycollection.arraylist;

import java.util.*;

public class TreeSetImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> tree=new TreeSet<Integer>();
		tree.add(10);
		tree.add(20);
		tree.add(30);
		tree.add(50);
		tree.add(25);
		
		Iterator<Integer> iterator=tree.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
		

	}

}
