package com.tyss.assignment_patterns_hibernate.service;

import com.tyss.assignment_patterns_hibernate.dao.EmployeeDetailsDAO;

import com.tyss.assignment_patterns_hibernate.dto.Primary_Info;
import com.tyss.assignment_patterns_hibernate.factory.EmployeeFactory;

public class EmployeeServiceJdbc implements EmployeeService {

	EmployeeFactory employeeFactory = new EmployeeFactory();
	EmployeeDetailsDAO employeeDetails = employeeFactory.getEmployee();

	@Override
	public Primary_Info getSingleRecord(int id) {

		return employeeDetails.getSingleRecord(id);
	}

	@Override
	public Primary_Info getAllRecords() {

		return employeeDetails.getAllRecords();
	}

	@Override
	public void insertRecord(Primary_Info info) {

	}

	@Override
	public void deleteRecord(int id) {

	}

	@Override
	public void updateRecord(int id) {

	}

}
