package com.te.springrestproj.dao;

import java.util.List;

import javax.persistence.*;

import org.springframework.stereotype.Repository;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.te.springrestproj.beans.EmployeeBean;

@Repository
public class EmployeeDaoHibImpl implements EmployeeDao {

	public EmployeeBean authenticate(int id, String password) {
		// TODO Auto-generated method stub

//		EntityManagerFactory factory=null;
//		EntityManager manager=null;

		try {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("employee");

			EntityManager manager = factory.createEntityManager();
			EmployeeBean bean = manager.find(EmployeeBean.class, id);

			if (bean != null) {

				if (bean.getPassword().equals(password)) {
					System.out.println("Login success");
					return bean;

				} else {
					System.out.println("Login not successful");
					return null;
				}
			}
			return bean;

		} catch (Exception e) {
			e.printStackTrace();

		}
		return null;

	}

	@Override
	public EmployeeBean getEmployee(int id) {
		// TODO Auto-generated method stub
		try {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("employee");

			EntityManager manager = factory.createEntityManager();
			EmployeeBean bean = manager.find(EmployeeBean.class, id);

			if (bean != null) {

				return bean;

			} else {
				System.out.println("Login not successful");
				return null;
			}

			// return bean;
		} catch (Exception e) {
			e.printStackTrace();

		}
		return null;
	}

	@Override
	public boolean deleteEmpData(int id) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("employee");

		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {

			transaction.begin();
			EmployeeBean bean = manager.find(EmployeeBean.class, id);
			manager.remove(bean);
			transaction.commit();

		} catch (Exception e) {
			e.printStackTrace();
		}

		// TODO Auto-generated method stub

		return false;
	}

	@Override
	public List<EmployeeBean> getAllEmp() {
		// TODO Auto-generated method stub
		try {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("employee");
			EntityManager manager = factory.createEntityManager();
			String read = " from EmployeeBean ";
			Query query = manager.createQuery(read);
			List<EmployeeBean> data = query.getResultList();
			return data;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public boolean addEmployee(EmployeeBean bean) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("employee");

		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		boolean isAdded = false;
		try {

			transaction.begin();
			// EmployeeBean bean = manager.find(EmployeeBean.class, id);
			if (bean != null) {
				manager.persist(bean);
				transaction.commit();
				isAdded = true;
			}

		} catch (Exception e) {
			isAdded = false;
			e.printStackTrace();
		}

		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		return isAdded;
	}

	public boolean updateEmp(EmployeeBean bean) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("employee");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			EmployeeBean info = manager.find(EmployeeBean.class, bean.getId());
			if (bean.getName() != null && bean.getName() != "") {
				info.setName(bean.getName());
			}
			if (bean.getDob() != null) {
				info.setDob(bean.getDob());
			}
			if (bean.getPassword() != null && bean.getPassword() != "") {
				info.setPassword(bean.getPassword());
			}
			transaction.commit();
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

}
