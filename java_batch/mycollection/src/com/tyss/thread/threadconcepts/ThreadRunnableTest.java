package com.tyss.thread.threadconcepts;

public class ThreadRunnableTest {
	
	public static void main(String[] args) {
		
		ThreadRunnableOne one=new ThreadRunnableOne();
		ThreadRunnableTwo two=new ThreadRunnableTwo();
		
//		one.run();
//		two.run();
		
		Thread threadone=new Thread(one);
		Thread threadtwo=new Thread(two);
		
		threadone.start();
		threadtwo.start();
		
		
		
		
		
		
		
		
		
	}
	

}
