package com.te.springrestproj.dao;

import java.util.Date;
import java.util.List;

import com.te.springrestproj.beans.EmployeeBean;



public interface EmployeeDao {
	

	public EmployeeBean authenticate(int id, String password);

	public EmployeeBean getEmployee(int id);

	public boolean deleteEmpData(int id);
	
	public List<EmployeeBean> getAllEmp(); 
	
	//public EmployeeBean addEmp(int id,String name,Date dob,String password);
	
	public boolean addEmployee(EmployeeBean bean);

	public boolean updateEmp(EmployeeBean bean);

}
