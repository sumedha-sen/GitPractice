package com.te.spring;

import com.te.interfaces.Animal;

public class Cat implements Animal {

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("Cat meow");
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("cat eating");
		
	}

}
