package com.tyss.elftraining.mycollection;



public class ArrayTest {
	public static void main(String []args) {
		MyArrayList array=new MyArrayList(5);
		System.out.println(array.size());
		array.add(10);
		array.add(20);
		array.add(30);
		
		System.out.println(array);
		
//		Iterator<E> iterator=array.iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//			
//		}
	
		
		
	}
	
	

}
