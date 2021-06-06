package com.tyss.elftraining.customizeexception;

import java.util.Scanner;

public class SBIAtm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the amount");
		Scanner sc=new Scanner(System.in);
		int amount=sc.nextInt();
       ATMSimulator obj=new ATMSimulator();
       obj.withdraw(amount);
	}

}
