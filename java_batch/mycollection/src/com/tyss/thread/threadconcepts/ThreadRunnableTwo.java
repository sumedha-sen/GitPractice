package com.tyss.thread.threadconcepts;

public class ThreadRunnableTwo implements Runnable {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread1"+Thread.currentThread().getName());
		 
		 for(int i=100;i<300;i++) {
			 System.out.println(i);
			 
		 }
		
	}

}
