package com.tyss.assignment_patterns_hibernate.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.tyss.assignment_patterns_hibernate.dto.Primary_Info;

public class EmployeeDetailsJdbc implements EmployeeDetailsDAO {

	@Override
	public Primary_Info getSingleRecord(int eid) {
		
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		
		try {
			
			Primary_Info info = new Primary_Info();
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ems?", "root", "abcd");
			String query = " select * from primary_info where id = '+eid+' ";
			statement = connection.createStatement();

			resultSet = statement.executeQuery(query);

			while (resultSet.next()) {
				info.setId(resultSet.getInt("id"));
				info.setName(resultSet.getString("name"));
				info.setDob(resultSet.getDate("dob"));
				info.setPhoneno(resultSet.getLong("phoneno"));
			}
			return info;
		} catch (Exception e) {

			e.printStackTrace();
		} finally {

			try {
				if (connection != null) {
					connection.close();
				}
				if (statement != null) {
					statement.close();
				}
				if (resultSet != null) {
					resultSet.close();
				}
			} catch (Exception e) {

				e.printStackTrace();
			}
		}
		return null;
		
	}

	@Override
	public Primary_Info getAllRecords() {

		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		Primary_Info info = new Primary_Info();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ems?", "root", "abcd");
			String query = " select * from primary_info ";
			statement = connection.createStatement();
			resultSet = statement.executeQuery(query);

			while (resultSet.next()) {
				info.setId(resultSet.getInt("id"));
				info.setName(resultSet.getString("name"));
				info.setDob(resultSet.getDate("dob"));
				info.setPhoneno(resultSet.getLong("phoneno"));
			}
		} catch (Exception e) {

			e.printStackTrace();
		} finally {

			try {
				if (connection != null) {
					connection.close();
				}
				if (statement != null) {
					statement.close();
				}
				if (resultSet != null) {
					resultSet.close();
				}
			} catch (Exception e) {

				e.printStackTrace();
			}
		}

		return info;

	}

	@Override
	public void insertRecord(Primary_Info info) {

		Connection connection = null;
		PreparedStatement pstatement = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ems?", "root", "abcd");
			String query = " insert into  primary_info values(?,?,?,?) ";
			pstatement = connection.prepareStatement(query);
			pstatement.setInt(1, info.getId());
			pstatement.setString(2, info.getName());
			pstatement.setDate(3, (Date) info.getDob());
			pstatement.setLong(4, info.getPhoneno());
			pstatement.executeUpdate();
		} catch (Exception e) {

			e.printStackTrace();
		} finally {

			try {
				if (connection != null) {
					connection.close();
				}
				if (pstatement != null) {
					pstatement.close();
				}

			} catch (Exception e) {

				e.printStackTrace();
			}
		}

	}

	@Override
	public void deleteRecord(int eid) {

		Connection connection = null;
		PreparedStatement pstatement = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ems?", "root", "abcd");
			String query = " delete from primary_info where id= '+eid+' ";
			pstatement = connection.prepareStatement(query);
			pstatement.executeUpdate();
			System.out.println("deleted");
		} catch (Exception e) {

			e.printStackTrace();
		} finally {

			try {
				if (connection != null) {
					connection.close();
				}
				if (pstatement != null) {
					pstatement.close();
				}

			} catch (Exception e) {

				e.printStackTrace();
			}
		}

	}

	@Override
	public void updateRecord(int eid) {
		Scanner scanner = new Scanner(System.in);
		Connection connection = null;
		PreparedStatement pstatement = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ems?", "root", "abcd");
			String query = " update primary_info set name=? where id= '+eid+' ";
			pstatement = connection.prepareStatement(query);
			System.out.println("enter name which you want to update");
			String name = scanner.next();
			pstatement.setString(1, name);
			pstatement.executeUpdate();
			scanner.close();
		} catch (Exception e) {

			e.printStackTrace();
		} finally {

			try {
				if (connection != null) {
					connection.close();
				}
				if (pstatement != null) {
					pstatement.close();
				}

			} catch (Exception e) {

				e.printStackTrace();
			}
		}

	}

}
