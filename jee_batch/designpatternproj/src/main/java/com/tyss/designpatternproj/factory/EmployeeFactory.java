package com.tyss.designpatternproj.factory;

import java.util.Scanner;

import com.tyss.designpatternproj.dao.EmployeeDetailsDAO;
import com.tyss.designpatternproj.dao.EmployeeDetailsHibernate;
import com.tyss.designpatternproj.dao.EmployeeDetailsJdbc;

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
