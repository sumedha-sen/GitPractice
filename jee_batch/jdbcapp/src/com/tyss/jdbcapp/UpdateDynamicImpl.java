package com.tyss.jdbcapp;

import java.io.*;
import java.sql.*;
import java.util.Properties;

public class UpdateDynamicImpl {

	public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3307/ems";
		String query="update primary_info set name=? where id=?";
		
		
	  try(FileInputStream fileinputstream=new FileInputStream ("dbinfo.properties");
			  Connection connection=DriverManager.getConnection(url,"root","root");
			  PreparedStatement pstmt=connection.prepareStatement(query);
			  ) {
		  
		  Properties properties=new Properties();
		  properties.load(fileinputstream);
		  
		  Class.forName(properties.getProperty("driver"));
		  
		  pstmt.setString(1,args[0]);
		  pstmt.setInt(2,Integer.parseInt(args[1]));
		  
		  int res=pstmt.executeUpdate();
		  if(res!=0) {
			  System.out.println("updated");
		  }
		  
		  
		  
 		  
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	  


	}

}
