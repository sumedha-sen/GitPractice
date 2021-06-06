package com.tyss.mycollection.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListImpl {

	public static void main(String []args) {
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(40);
		arrayList.add(4,50);
		System.out.println(arrayList);
		
		arrayList.set(1, 100);
		System.out.println(arrayList);
		
		List<Integer> sublist=arrayList.subList(1, 5);
		System.out.println(sublist);
		
		System.out.println(arrayList.indexOf(100));
		
		System.out.println(arrayList.lastIndexOf(30));
		
		
		System.out.println(arrayList.indexOf(2000));
	}
}
