package com.tyss.aquizproj1;

import java.util.Scanner;

import com.tyss.aquizproj1.service.Service;
import com.tyss.aquizproj1.service.ServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("Enter your choice");
		System.out.println("Press 1 for Login procedure");
		System.out.println("Press 2 for Registration");
		System.out.println("Press 3 to exit");
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		switch (n) {
		case 1:
			Service service= new ServiceImpl();
			service.getLogin();
			break;
		case 2:
			Service serv= new ServiceImpl();
			serv.getRegistration();
			break;
			
		case 3:
			System.exit(0);
			break;
			
		default:
			
			break;
		}
    }
}
