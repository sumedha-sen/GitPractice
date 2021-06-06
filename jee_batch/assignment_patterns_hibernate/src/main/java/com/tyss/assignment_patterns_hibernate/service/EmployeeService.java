package com.tyss.assignment_patterns_hibernate.service;

import com.tyss.assignment_patterns_hibernate.dto.Primary_Info;

public interface EmployeeService {
	
	public Primary_Info getSingleRecord(int id);

	public Primary_Info  getAllRecords();

	public void insertRecord(Primary_Info info);

	public void deleteRecord(int id);

	public void updateRecord(int id);

}
