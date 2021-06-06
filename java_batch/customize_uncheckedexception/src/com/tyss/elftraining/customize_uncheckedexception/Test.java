package com.tyss.elftraining.customize_uncheckedexception;

import java.util.Scanner;

public class Test {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		System.out.println("Enter the marks");
		Scanner sc=new Scanner(System.in);
		int marks=sc.nextInt();
      TestEligible obj=new TestEligible();
      try {
		obj.eligible(marks);
	} catch (MarksValidator e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
	}
	}

}
