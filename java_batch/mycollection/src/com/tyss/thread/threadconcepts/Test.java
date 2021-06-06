package com.tyss.thread.threadconcepts;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("App started");
		System.out.println(Thread.currentThread().getName());
		
		ThreadOne one=new ThreadOne();
		ThreadTwo two=new ThreadTwo();
		
		one.start();
		two.start();
		

	}

}
