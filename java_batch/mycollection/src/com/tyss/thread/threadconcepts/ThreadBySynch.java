package com.tyss.thread.threadconcepts;

public class ThreadBySynch {

	public static void main(String[] args) {
		
		MainClass obj=new MainClass();
		Runnable ref1 = () -> {

			System.out.println("Thread Started");

			obj.printTable(10);

		};
		Runnable ref2 = () -> {

			System.out.println("Thread Started");

			obj.printTable(20);

		};
		
		Thread one=new Thread(ref1);
		Thread two=new Thread(ref2);
		
		one.start();
		two.start();
		
		

	}

}
