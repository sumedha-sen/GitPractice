package com.tyss.elftraining.assignments;

import java.util.Comparator;

public class SortByAge implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.Age-o2.Age;
	}

}

