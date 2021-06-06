package com.tyss.mycollection.arraylist;

import java.util.*;

public class SortByName implements Comparator<Students>{

	@Override
	public int compare(Students o1, Students o2) {
		// TODO Auto-generated method stub
		return (int) (o1.marks-o2.marks);
	}
	
	
	

}
