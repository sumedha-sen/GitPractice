package com.tyss.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class UpdateImpl {
	public static void main(String[] args) {
		ArrayList<EmployeeDetails> employeedetails = new ArrayList<EmployeeDetails>();
		Connection connection=null;
		Statement statement=null;
		ResultSet resultset=null;
		
		System.out.println("before adding");
		System.out.println(employeedetails);
		try {
	
			Class.forName("com.mysql.jdbc.Driver").newInstance();

			String dburl = "jdbc:mysql://localhost:3307/ems";
			 connection = DriverManager.getConnection(dburl,"root","root");
			String query = "update primary_info set dob='2000/05/09' where name='sara'";

			 statement = connection.createStatement();
			 int res = statement.executeUpdate(query);
			

			if(res!=0) {
				System.out.println(res+"no of rows affected");

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
