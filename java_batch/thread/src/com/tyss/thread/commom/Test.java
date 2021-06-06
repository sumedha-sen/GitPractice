package com.tyss.thread.commom;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("first call");
		MyFunctionalInterface ref1 =(String name) -> {
			System.out.println(name);
			return true;

		};
		ref1.getData("first");

		System.out.println("second call");
		MyFunctionalInterface ref2 =(String name) ->{ 
			
			return true;
		};

		

		

		ref2.getData("second");
	
		
		MyFunctionalInterfaceTwo ref3=( a, b)->
			
			System.out.println(a +" "+ b);
			
		
		
		ref3.getData("hello","Interface");
	}
}
