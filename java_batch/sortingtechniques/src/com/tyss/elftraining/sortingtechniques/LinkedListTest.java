package com.tyss.elftraining.sortingtechniques;

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyLinkedList obj=new MyLinkedList();
		obj.add(10);
		obj.add(30);
		obj.add(50);
		obj.add(70);
		System.out.println(obj);
		obj.remove(6);
		System.out.println("After removing");
		System.out.println(obj);

	}

}
