package com.te.sprmvc.service;

import java.util.List;

import com.te.sprmvc.beans.EmployeeBean;

public interface EmpService {
	
	public EmployeeBean authenticate(int id, String password);

	public EmployeeBean getEmployee(int id);
	
	public boolean deleteEmpData(int id);

	public boolean addEmployee(EmployeeBean bean);

	public boolean updateEmp(EmployeeBean bean);

	public List<EmployeeBean> getAllEmp();
	
	
	


}
