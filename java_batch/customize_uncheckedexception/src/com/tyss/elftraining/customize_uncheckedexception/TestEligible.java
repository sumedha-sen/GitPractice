package com.tyss.elftraining.customize_uncheckedexception;

public class TestEligible {
	int marks;
	public void eligible(int marks){
		try {
			if(marks<60) {
				throw new MarksValidator("Not Eligible");
			}
		
			else {
				System.out.println("eligible");
			}
			
		}
		catch(RuntimeException e){
			System.out.println(e.getMessage());
			
		}
		

}
}
