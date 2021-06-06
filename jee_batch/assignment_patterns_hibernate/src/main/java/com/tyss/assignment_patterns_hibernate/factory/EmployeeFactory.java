package com.tyss.assignment_patterns_hibernate.factory;

import java.util.Scanner;

import com.tyss.assignment_patterns_hibernate.dao.EmployeeDetailsDAO;
import com.tyss.assignment_patterns_hibernate.dao.EmployeeDetailsHibernate;
import com.tyss.assignment_patterns_hibernate.dao.EmployeeDetailsJdbc;

public class EmployeeFactory {

	public EmployeeDetailsDAO getEmployee() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter type");
		String type = scanner.next();
		if (type.equalsIgnoreCase("jdbc")) {
			return new EmployeeDetailsJdbc();
		} else if (type.equalsIgnoreCase("hibernate")) {
			return new EmployeeDetailsHibernate();
		}
		return null;
	}

}
