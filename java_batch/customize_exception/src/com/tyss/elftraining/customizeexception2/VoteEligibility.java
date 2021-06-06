package com.tyss.elftraining.customizeexception2;

public class VoteEligibility {

	int validage = 18;

	public void vote(int age) {

		if (age < 18) {

			try {
				throw new InvalidAgeException("Age not eligible");
			} catch (InvalidAgeException e) {

				System.out.println(e.getMessage());
			}

		} else if (age <= 0) {
			try {
				throw new InvalidAgeException("invalid age");
			} catch (InvalidAgeException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}

		} else {
			System.out.println("eligible for voting");
		}
	}

}
