package com.tyss.elftraining.mycollection;

import java.util.Iterator;

public class CustomArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyArrayList<Object> obj=new MyArrayList<Object>(5);
		obj.add(10);
		obj.add("true");
		obj.add(30);
		obj.add(40);
		obj.add(60);
		obj.remove(0);
		
		//System.out.println(obj);
		System.out.println("using for loop");
		for(int i = 0;i<obj.size();i++) {
			System.out.println(obj.get(i));
			
		}
		System.out.println("printing object");
		System.out.println(obj);
		
		System.out.println("using for each");
		
		for(Object object:obj) {
			System.out.println(object);
		}
			
		}
		
		
		
		
		

	}


