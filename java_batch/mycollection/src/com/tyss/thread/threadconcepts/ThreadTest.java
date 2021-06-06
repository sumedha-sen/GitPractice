package com.tyss.thread.threadconcepts;

public class ThreadTest extends Thread {
	
	@Override
	public void run() {
		 for(int i=0;i<10000;i++) {
			 System.out.println(i);
			 try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
		 }
		
	}
	
	
	public static void main(String[]args) {
		
		ThreadTest test=new ThreadTest();
		test.start();
		//test.start();
		
	}

}
