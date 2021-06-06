package com.tyss.elftraining.collectionasignment;

import java.util.Comparator;

public class SortByMarks implements Comparator<Student> {
	
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.marks-o2.marks;
	}

}
