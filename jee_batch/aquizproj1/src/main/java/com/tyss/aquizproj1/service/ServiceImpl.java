package com.tyss.aquizproj1.service;

import java.util.Scanner;

import com.tyss.aquizproj1.dao.Iquiz;
import com.tyss.aquizproj1.dao.QuizHibDao;
import com.tyss.aquizproj1.dto.Users;

public class ServiceImpl implements Service {
	Scanner sc = new Scanner(System.in);
	Iquiz dao = new QuizHibDao();

	public Users getLogin() {
		// TODO Auto-generated method stub

		Users u = new Users();
		System.out.println("Enter your name");
		String name = sc.nextLine();
		System.out.println("enter your password");
		String pass = sc.nextLine();
		return ((QuizHibDao) dao).login(name, pass);
		
	}

	public Users getRegistration() {
		// TODO Auto-generated method stub
		Users u = new Users();
		System.out.println("Enter ur id");
		int id = sc.nextInt();
		System.out.println("Enter ur name");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.println("Enter ur password");
		String pass = sc.nextLine();
		return ((QuizHibDao) dao).register(id, name, pass);
		
	}

}
