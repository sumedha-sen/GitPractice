package com.tyss.thread.threadconcepts;

public class MainClass {
	
	public synchronized void printTable(int n) {
		
		for(int i=1;i<=n;i++) {
			System.out.println(i*n);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {


				e.printStackTrace();
			}
			
		}

}
}
