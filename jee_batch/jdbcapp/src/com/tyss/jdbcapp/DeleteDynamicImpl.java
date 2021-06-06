package com.tyss.jdbcapp;

import java.io.*;
import java.sql.*;
import java.util.*;

public class DeleteDynamicImpl {

	public static void main(String[] args) {
		
		Connection connection=null;
		PreparedStatement pstmt=null;
		
		try {
			FileInputStream fileinputstream=new FileInputStream("dbinfo.properties");
			Properties properties=new Properties();
			properties.load(fileinputstream);
			
			Class.forName(properties.getProperty("driver"));
			connection=DriverManager.getConnection(properties.getProperty("dburl"),properties.getProperty("user"),properties.getProperty("password"));
			String query="delete from primary_info where id= ? ";
			
			pstmt=connection.prepareStatement(query);
			pstmt.setInt(1,Integer.parseInt(args[0]));
			int res=pstmt.executeUpdate();
			
			if(res!=0) {
				
				System.out.println("deleted successfully for"+args[0]);
			 	
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
