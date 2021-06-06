package com.tyss.designpatternproj.service;

import java.util.List;

import com.tyss.designpatternproj.dto.Primary_Info;

public interface EmployeeService {
	
	public Primary_Info getSingleRecord(int id);

	public List<Primary_Info>  getAllRecords();

	public void insertRecord(Primary_Info info);

	public void deleteRecord(int id);

	public void updateRecord(int id);

}

