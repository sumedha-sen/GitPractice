package com.tyss.jdbcapp;

import java.io.*;
import java.sql.Connection;
import java.sql.Date;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class InsertDynamicImpl {
	
	

	public static void main(String[] args) {
		Connection connection=null;
		PreparedStatement pstmt=null;
		
		try {
			Date dob=new Date(new SimpleDateFormat("dd/MM/yyyy").parse(args[2]).getTime());
			FileInputStream fileinputstream = new FileInputStream("dbinfo.properties");
			
			Properties properties=new Properties();
			properties.load(fileinputstream);
			
			Class.forName(properties.getProperty("driver"));
			connection=DriverManager.getConnection(properties.getProperty("dburl"),properties.getProperty("user"),properties.getProperty("password"));
			
		     String query="insert into primary_info values(?,?,?,?)";
		     
		     
		     
		     pstmt=connection.prepareStatement(query);
		     
		     pstmt.setInt(1,Integer.parseInt(args[0]));
		     pstmt.setString(2,args[1]);
		     pstmt.setDate(3,dob);
		     pstmt.setLong(4,Long.parseLong(args[3]));
		     
		     int res=pstmt.executeUpdate();
		     if(res!=0) {
		    	 System.out.println("inserted successfully for"+args[0]);
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
				
				
			}catch(Exception e) {
				e.printStackTrace();
				
			}
		}
		


	}

}
