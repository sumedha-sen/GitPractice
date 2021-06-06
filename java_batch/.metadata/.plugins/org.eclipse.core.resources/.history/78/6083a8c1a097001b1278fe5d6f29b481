package com.tyss.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class FinalFastImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList<Integer> obj=new ArrayList<Integer>();
//		obj.add(10);
//		obj.add(20);
//		obj.add(30);
//		obj.add(40);
//		obj.add(50);
//		obj.remove(3);
//		System.out.println(obj);
//		Iterator iterator=obj.iterator();
//		System.out.println("print using iterator");
//		while(iterator.hasNext()) {
//			if(iterator.next()==(Object)20) {
//				obj.remove(2);
//			}
////			
//			System.out.println(iterator.next());
//			
//			
//		}
	ConcurrentHashMap<String,Integer> map=new ConcurrentHashMap<String,Integer>();
	map.put("One", 1);
	map.put("Two", 2);
	map.put("Three", 3);
	map.put("Four", 4);
	
	Iterator iterator=map.keySet().iterator();
	 while (iterator.hasNext()) {
         String key = (String)iterator.next();
         System.out.println(key + " : " + map.get(key));

         // This will reflect in iterator.
         // Hence, it has not created separate copy
         map.put("SEVEN", 7);
     }
	
	
	
	
		

	}

}
