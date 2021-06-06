package com.tyss.jdbcapp;

import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;

public class DynamicSelect {

	public static void main(String[]data) {
		
		Connection  connection=null;
		PreparedStatement pstmt=null;
		ResultSet resultset=null;
		
		try {
			
			
			FileInputStream fileinputstream=new FileInputStream("dbinfo.properties"); 
			
			Properties properties=new Properties();
			
			properties.load(fileinputstream);
			
			//Class.forName("com.mysql.jdbc.Driver");
			
			connection = DriverManager.getConnection(properties.getProperty("dburl"),
					properties);
			String query= "select * from primary_info where id= ?";
			
			pstmt=connection.prepareStatement(query);
			 pstmt.setInt(1,Integer.parseInt(data[0]));
			 resultset=pstmt.executeQuery();
			 
			 while(resultset.next()) {
				 System.out.println(resultset.getInt("id"));
				 System.out.println(resultset.getString("name"));
				 System.out.println(resultset.getDate("dob"));
				 System.out.println(resultset.getLong("phoneno"));
				 
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
					if(pstmt!=null) {
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

