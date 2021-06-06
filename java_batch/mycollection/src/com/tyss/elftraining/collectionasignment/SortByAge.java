package com.tyss.elftraining.collectionasignment;

import java.util.Comparator;

public class SortByAge implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.age-o2.age;
	}
	
	

}
