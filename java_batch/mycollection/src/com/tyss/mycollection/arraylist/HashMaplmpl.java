package com.tyss.mycollection.arraylist;

import java.util.*;

public class HashMaplmpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	HashMap<String,Long> hashmap=new HashMap<String,Long>();
	
	hashmap.put("Rima", 34567890L);
	hashmap.put("Tina", 678906789L);
	hashmap.put("Bina", 23456789L);
	hashmap.put("Sara", 45678980L);
	hashmap.put("Tara", 789034564l);
	hashmap.put("null", 789034564L);
	hashmap.put("Tara", 789034564L);
	
	System.out.println(hashmap);
	
	System.out.println("------get based on key------");
	
	System.out.println(hashmap.get("Rima"));
	
	Set<Map.Entry<String,Long>> entries=hashmap.entrySet();
	System.out.println("entries");
	
	for(Map.Entry<String,Long> entry : entries) {
		System.out.println(entry.getKey());
		System.out.println(entry.getValue());
		System.out.println("------");
		
		Collection<String> set=hashmap.keySet();
		
		System.out.println(set);
		
	Collection<Long> collection=hashmap.values();
		
		System.out.println(collection);
		
		
		
		
		
	}
	
	
	
	

	}

}
