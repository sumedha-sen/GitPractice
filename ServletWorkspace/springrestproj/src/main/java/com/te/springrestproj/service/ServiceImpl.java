package com.te.springrestproj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.springrestproj.beans.EmployeeBean;
import com.te.springrestproj.dao.EmployeeDao;

@Service
public class ServiceImpl implements EmpService {

	@Autowired
	EmployeeDao dao;

	public EmployeeBean authenticate(int id, String password) {

		// TODO Auto-generated method stub
		return dao.authenticate(id, password);
	}

	public EmployeeBean getEmployee(int id) {

		// TODO Auto-generated method stub
		return dao.getEmployee(id);
	}

	public boolean deleteEmpData(int id) {

		// TODO Auto-generated method stub
		return dao.deleteEmpData(id);
	}

	public boolean addEmployee(EmployeeBean bean) {

		// TODO Auto-generated method stub
		return dao.addEmployee(bean);
	}

	public boolean updateEmp(EmployeeBean bean) {
		// TODO Auto-generated method stub
		return dao.updateEmp(bean);
	}

	@Override
	public List<EmployeeBean> getAllEmp() {
		// TODO Auto-generated method stub
		return dao.getAllEmp();
		
	}

}
