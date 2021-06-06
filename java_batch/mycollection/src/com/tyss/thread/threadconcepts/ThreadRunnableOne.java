package com.tyss.thread.threadconcepts;

public class ThreadRunnableOne implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread1"+Thread.currentThread().getName());
		 
		 for(int i=0;i<30;i++) {
			 System.out.println(i);
			 
		 }
		
	}
	
	
	
	

}
