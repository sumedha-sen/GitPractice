package com.tyss.assignment_patterns_hibernate;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import com.tyss.assignment_patterns_hibernate.dao.EmployeeDetailsDAO;
import com.tyss.assignment_patterns_hibernate.dto.Primary_Info;
import com.tyss.assignment_patterns_hibernate.factory.EmployeeFactory;

public class App {
	public static void main(String[] args) {

		EmployeeFactory employeeFactory = new EmployeeFactory();

		EmployeeDetailsDAO employeeDetailsDAO = employeeFactory.getEmployee();

		Primary_Info pInfo = new Primary_Info();// _____inserting
		try {
			pInfo.setId(20);
			pInfo.setName("varma");
			Date date = new Date(new SimpleDateFormat("dd/MM/yyyy").parse("07/04/1999").getTime());
			pInfo.setDob(date);
			pInfo.setPhoneno(8978986801l);

			employeeDetailsDAO.insertRecord(pInfo);
		} catch (ParseException e) {

			e.printStackTrace();
		}

	}
}
