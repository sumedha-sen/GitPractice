package com.tyss.thread.threadconcepts;

public class ThreadByLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Runnable ref1=()->{
    	   
    	   System.out.println("Thread Started");
  		 
  		 for(int i=0;i<30;i++) {
  			 System.out.println(i);
  			 
  		 }
    	   
       };
       
		Runnable ref2 = () -> {

			System.out.println("Thread Started");

			for (int i = 0; i < 30; i++) {
				System.out.println(i);

			}

		};
		
		Thread one=new Thread(ref1);
		Thread two=new Thread(ref2);
		
		one.start();
		two.start();
		
		
		System.out.println("Thread ended");
		
		
	}

}
