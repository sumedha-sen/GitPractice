package com.tyss.aquizproj.service;

import java.util.Scanner;

import com.tyss.aquizproj.dao.QuizHibDao;
import com.tyss.aquizproj.dto.Users;

public class ServiceImpl implements Service {

	@Override
	public Users getRegister() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id");
		int id=sc.nextInt();
		System.out.println("Enter name");
		String name=sc.next();
		System.out.println("Enter password");
		String password=sc.next();
		
		 QuizHibDao dao=new QuizHibDao();
		
		return dao.getRegister(id,name,password);
	}

	@Override
	public Users getLogin() {
		// TODO Auto-generated method stub
		return null;
	}

}
