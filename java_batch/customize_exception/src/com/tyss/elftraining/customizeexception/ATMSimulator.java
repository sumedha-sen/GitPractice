package com.tyss.elftraining.customizeexception;

public class ATMSimulator {
     double balance=60000;
   public void withdraw(double amount) {
	 try {
		  if(amount<=0) {
			   
			  throw new InsuffBalanceException("Invalid input");
		   }else if(amount>balance) {
			   throw new InsuffBalanceException("insufficient balance");
		   }
		   else
		   {
			   System.out.println("withdraw successful");
			   
		   }
	 }
	 catch(Exception e) {
		  System.out.println(e.getMessage());
		 
	 }
   }
}


