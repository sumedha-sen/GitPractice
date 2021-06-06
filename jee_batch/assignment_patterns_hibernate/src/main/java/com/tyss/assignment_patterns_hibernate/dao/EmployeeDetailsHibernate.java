package com.tyss.assignment_patterns_hibernate.dao;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.tyss.assignment_patterns_hibernate.dto.Primary_Info;

public class EmployeeDetailsHibernate implements EmployeeDetailsDAO {

	Scanner scanner = new Scanner(System.in);
	EntityManagerFactory entityManagerFactory = null;
	EntityManager entityManager = null;
	EntityTransaction transaction = null;
	Query query = null;

	@Override
	public Primary_Info getSingleRecord(int id) {

		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("assignment");
			entityManager = entityManagerFactory.createEntityManager();
			Primary_Info primary_Info = entityManager.find(Primary_Info.class, id);
			return primary_Info;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (entityManager != null) {
				entityManager.close();
			}
			if (entityManagerFactory != null) {
				entityManagerFactory.close();
			}
		}

		return null;
	}

	@Override
	public Primary_Info getAllRecords() {

		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("assignment");
			entityManager = entityManagerFactory.createEntityManager();
			String read = " from Primary_Info ";
			query = entityManager.createQuery(read);
			List<Primary_Info> primary_Infos = query.getResultList();
			return (Primary_Info) primary_Infos;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (entityManager != null) {
				entityManager.close();
			}
			if (entityManagerFactory != null) {
				entityManagerFactory.close();
			}
		}

		return null;
	}

	@Override
	public void insertRecord(Primary_Info info) {

		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("assignment");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(info);
			transaction.commit();

		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		} finally {
			if (entityManager != null) {
				entityManager.close();
			}
			if (entityManagerFactory != null) {
				entityManagerFactory.close();
			}
		}

	}

	@Override
	public void deleteRecord(int id) {

		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("assignment");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			Primary_Info info = entityManager.find(Primary_Info.class, id);
			entityManager.remove(info);
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		} finally {
			if (entityManager != null) {
				entityManager.close();
			}
			if (entityManagerFactory != null) {
				entityManagerFactory.close();
			}
		}

	}

	@Override
	public void updateRecord(int id) {

		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("assignment");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			Primary_Info info = entityManager.find(Primary_Info.class, id);
			System.out.println("enter --> 1 to update NAME");
			System.out.println("enter --> 2 to update DOB");
			System.out.println("enter --> 3 to update PHONE_NO");
			int option = scanner.nextInt();
			if (option == 1) {
				System.out.println("enter name which you want to update");
				String name = scanner.next();
				info.setName(name);
				System.out.println("updated-successfull");
			} else if (option == 2) {
				System.out.println("enter DOB which you want to update");
				String dateupdate = scanner.next();
				Date date = new Date(new SimpleDateFormat("dd/MM/yyyy").parse(dateupdate).getTime());
				info.setDob(date);
				System.out.println("updated-successfull");
			} else if (option == 3) {
				System.out.println("enter PHONE_NO which you want to update");
				long phone = scanner.nextLong();
				info.setPhoneno(phone);
			} else {
				System.out.println("choose correct option");
			}
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		} finally {
			if (entityManager != null) {
				entityManager.close();
			}
			if (entityManagerFactory != null) {
				entityManagerFactory.close();
			}
		}

	}

}
