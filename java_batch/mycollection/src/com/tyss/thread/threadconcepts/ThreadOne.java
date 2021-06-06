package com.tyss.thread.threadconcepts;

public class ThreadOne extends Thread {
	
	
	
	
	 
	@Override
	 public void run() {
		
		System.out.println(Thread.currentThread().getName());
		 
		 for(int i=0;i<30;i++) {
			 System.out.println(i);
			 
		 }
		 
	 }
	

}
