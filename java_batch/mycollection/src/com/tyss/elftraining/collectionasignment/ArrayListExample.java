package com.tyss.elftraining.collectionasignment;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		ArrayList<String> arrayList=new ArrayList<String>();
		arrayList.add("Rima");
		arrayList.add("Sima");
		arrayList.add("Bima");
		arrayList.add("Sara");
		arrayList.add("Tara");
		
		Iterator<String> iterator=arrayList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
		
		
		
		

	}

}
