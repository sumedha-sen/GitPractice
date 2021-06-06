package com.tyss.elftraining.assignments;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapStudentClassImpl {
	
	public static void main(String[] args) {
		TreeMap<String, Integer> hashMap = new TreeMap<String,Integer>();
		hashMap.put("java", 1);
		hashMap.put("j2ee", 5);
		hashMap.put("sql", 3);
		hashMap.put("html", 2);
		System.out.println(hashMap);
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		for (Entry<String, Integer> entry : hashMap.entrySet()) {
		arrayList.add(entry.getValue());
		}
		System.out.println(arrayList);
		Collections.sort(arrayList, new Comparator<Integer>() {

			
		@Override
		public int compare(Integer o1, Integer o2) {
		return o1 - o2;
		
		}
		});
		System.out.println(arrayList);
		LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<String, Integer>();
		for (Integer sorted : arrayList) {
		for (Entry<String, Integer> entry : hashMap.entrySet()) {
		if (entry.getValue().equals(sorted)) {
		linkedHashMap.put(entry.getKey(), sorted);
		}
		System.out.println(linkedHashMap);
		}
		}
	}
}



		








