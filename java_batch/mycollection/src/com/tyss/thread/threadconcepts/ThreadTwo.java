package com.tyss.thread.threadconcepts;

public class ThreadTwo extends Thread{
	
	
	@Override
	 public void run() {
		
		System.out.println(Thread.currentThread().getName());
		 
		 for(int i=80;i<200;i++) {
			 System.out.println(i);
			 
		 }
		 
	 }
}
