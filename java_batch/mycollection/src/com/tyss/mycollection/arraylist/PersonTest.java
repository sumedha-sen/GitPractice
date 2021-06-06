package com.tyss.mycollection.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Person> arraylist=new ArrayList<Person>();
		arraylist.add(new Person(10,"Pallavi"));
		arraylist.add(new Person(50,"Rima"));
		arraylist.add(new Person(30,"Bindu"));
		arraylist.add(new Person(20,"Tina"));
		
		System.out.println("before sorting");
		
		for(Person person:arraylist) {
			System.out.println(person);
			
		}
		
		Collections.sort(arraylist);
		System.out.println("after sorting");
		for(Person person:arraylist) {
			System.out.println(person);
		}

	}

}
