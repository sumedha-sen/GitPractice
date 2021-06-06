package com.tyss.thread.threadconcepts;

import java.util.Scanner;

public class ThreadBySyncBlock {

	public static void main(String[] args) {
		System.out.println("enter 2 values");
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		
		
		MainClass1 obj=new MainClass1();
		Runnable ref1 = () -> {

			synchronized (obj) {
			
				System.out.println("Thread Started");
		         
		          
				obj.printTable(m);
			}
			
			
			

		};
		Runnable ref2 = () -> {

			synchronized(obj){
				System.out.println("Thread Started");
		         
		          
				obj.printTable(n);	
		}

	};
		
		Thread one=new Thread(ref1);
		Thread two=new Thread(ref2);
		
		one.start();
		two.start();
		
		


	}

}
