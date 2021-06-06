package com.tyss.mycollection.arraylist;


import java.util.*;

public class TreeMapImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();
		
		map.put(2,"Java");
		map.put(26,"sql");
		map.put(10,"react");
		map.put(15,"html");
		map.put(30,"Java");
		
//		System.out.println(map);
		System.out.println(map.get(10));
		
		Set<Map.Entry<Integer,String>> entries=map.entrySet();
		
		for(Map.Entry<Integer,String> entry : entries) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			System.out.println("------");
			
			Set<Integer> set=map.keySet();
			
			System.out.println(set);
			
		Collection<String> collection=map.values();
			
			System.out.println(collection);
			
			
			
			
			
		}
		

	}

}
