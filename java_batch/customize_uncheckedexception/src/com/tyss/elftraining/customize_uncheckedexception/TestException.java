package com.tyss.elftraining.customize_uncheckedexception;

import java.io.IOException;
import java.sql.SQLException;

public class TestException  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			int a[]=new int[5];
			a[5]=30/0;
			
		}catch(ArithmeticException e) {  //we cannot add parent and child in same catch block
			
		}
		
		

	}

}
