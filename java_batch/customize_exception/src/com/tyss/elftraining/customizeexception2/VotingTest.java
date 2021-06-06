package com.tyss.elftraining.customizeexception2;

import java.util.Scanner;

public class VotingTest {

	public static void main(String[] args) {
		
		VoteEligibility obj=new VoteEligibility();
		System.out.println("Enter valid voting age");
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		obj.vote(age);

	}

}
