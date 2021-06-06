package com.tyss.designpatternproj.service;

import java.util.List;
import java.util.regex.Pattern;

import com.tyss.designpatternproj.dao.EmployeeDetailsDAO;

import com.tyss.designpatternproj.dto.Primary_Info;
import com.tyss.designpatternproj.factory.EmployeeFactory;

public class EmployeeServiceJdbc implements EmployeeService {

    EmployeeFactory employeeFactory = new EmployeeFactory();
	EmployeeDetailsDAO employeeDetails = employeeFactory.getEmployee();
	

	
	public Primary_Info getSingleRecord(int id) {

		return employeeDetails.getSingleRecord(id);
	}

		
	public List<Primary_Info> getAllRecords() {

		return employeeDetails.getAllRecords();
	}

	
	public void insertRecord(Primary_Info info){
		
		String name=info.getName();
		if(name.length()>=2 || Pattern.matches("[a-zA-Z]", name)) {
			info.setName(name);
		}else {
			System.out.println("Enter valid name");
			
		}
		
		
	
		 employeeDetails.insertRecord(info);
		 System.out.println("inserted successfully");

	}

	
	public void deleteRecord(int id) {
		
		 employeeDetails.deleteRecord(id);
		 System.out.println("deleted");

	}

	@Override
	public void updateRecord(int id) {
		
		 employeeDetails.updateRecord(id);
		 System.out.println("updated");

	}

}

