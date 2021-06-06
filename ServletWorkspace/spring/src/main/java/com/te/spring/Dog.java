package com.te.spring;

import com.te.interfaces.Animal;

public class Dog implements Animal{

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		
		System.out.println("Dog barking");
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("dog eating");
		
	}

}
