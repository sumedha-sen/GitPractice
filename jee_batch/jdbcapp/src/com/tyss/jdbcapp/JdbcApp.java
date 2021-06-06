package com.tyss.jdbcapp;

import java.sql.*;
import java.util.ArrayList;

public class JdbcApp {

	public static void main(String[] args) {
		ArrayList<EmployeeDetails> employeedetails = new ArrayList<EmployeeDetails>();
		Connection connection=null;
		Statement statement=null;
		ResultSet resultset=null;
		
		System.out.println("before adding");
		System.out.println(employeedetails);
		try {
			/*
			 * Driver driver=new com.mysql.jdbc.Driver();
			 * DriverManager.registerDriver(driver);
			 * 
			 */
			//
			Class.forName("com.mysql.jdbc.Driver").newInstance();

			String dburl = "jdbc:mysql://localhost:3307/ems?user=root&password=root";
			 connection = DriverManager.getConnection(dburl);
			String query = "select * from primary_info";

			 statement = connection.createStatement();
			 resultset = statement.executeQuery(query);
			System.out.println(resultset.wasNull());

			while (resultset.next()) {

//				System.out.println("id---->" + resultset.getInt("id"));
//				System.out.println("id---->" + resultset.getString("name"));
//				System.out.println("id---->" + resultset.getDate("dob"));
//				System.out.println("id---->" + resultset.getLong("phoneno"));
				
				EmployeeDetails details=new EmployeeDetails();
				details.setId(resultset.getInt("id"));
				details.setName(resultset.getString("name"));
				details.setDob(resultset.getDate("dob"));
				details.setPhoneno(resultset.getLong("phoneno"));
				
				employeedetails.add(details);
				
				
				

			}
			System.out.println("after adding");
			for(EmployeeDetails  e1:employeedetails) {
				System.out.println(e1);
				
			}
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				if(connection!=null) {
					connection.close();
				}
				if(statement!=null) {
					connection.close();
				}
				if(resultset!=null) {
					connection.close();
				}
				
			}catch(Exception e) {
				e.printStackTrace();
				
			}
		}
	}

}
