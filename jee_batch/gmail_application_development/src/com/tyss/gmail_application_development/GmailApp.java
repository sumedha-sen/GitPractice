package com.tyss.gmail_application_development;

import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;
import java.util.Scanner;


public class GmailApp {

	public static void main(String[] args) {


		while(true) {

			Connection connection=null;
			PreparedStatement pstmt=null;
			Statement stmt=null;
			ResultSet resultset=null;

			try {
				FileInputStream fileinputstream=new FileInputStream("dbinfo.properties");
				Properties properties=new Properties();
				properties.load(fileinputstream);

				Class.forName(properties.getProperty("driver"));
				connection=DriverManager.getConnection(properties.getProperty("dburl"),properties);
				Scanner sc=new Scanner(System.in);

				System.out.println("1. Press 1 to login   2.Press 2 to register");
				int i=sc.nextInt();
				if(i==1) {
					System.out.println("Enter your email id");
					String emailid=sc.next();
					System.out.println("Enter your password");
					String pass=sc.next();

					String query="select * from account where email=? and password=?";
					pstmt=connection.prepareStatement(query);
					pstmt.setString(1,emailid);
					pstmt.setString(2,pass);
					resultset=pstmt.executeQuery();
					//


					if(resultset.next()) {

						System.out.println("Login successful");
						System.out.println("1.Press A to compose  2.Press B to show inbox");
						int choice=sc.nextInt();
						if(choice==1) {

							System.out.println("Enter email id to whom you want to send message");

							String em=sc.next();
							String query3="select * from account where email=?";
							pstmt=connection.prepareStatement(query3);
							pstmt.setString(1,em);

							ResultSet resultset1=pstmt.executeQuery();
							
                             
							System.out.println("Enter message");
							String msg=sc.next();
							String query4="insert into inbox (user_id,message) values(?,?)";





							pstmt=connection.prepareStatement(query4);
							if(resultset1.next()) {
								int uid=resultset1.getInt("user_id");
								pstmt.setInt(1,uid);
								pstmt.setString(2,msg);
								
							}

							




							int res=pstmt.executeUpdate();
							if(res!=0) {
								System.out.println("Message has been composed");
							}



						}else if(choice==2) {
							int userid=resultset.getInt("user_id");
							System.out.println("These are all your emails");
							String query1="select * from inbox where user_id=?";
							pstmt=connection.prepareStatement(query1);
							pstmt.setInt(1,userid);

							resultset=pstmt.executeQuery();
							while(resultset.next()) {
								System.out.println(resultset.getString("message"));
							}



						}else {
							System.out.println("Please enter valid choice");
						}


					}else {
						System.out.println("Please enter valid credentials");
					}

				}else if(i==2) {
					System.out.println("enter user name");
					System.out.println("enter password");
					System.out.println("enter email");

					String name=sc.next();
					String password=sc.next();
					String email=sc.next();
					String query="insert into account (user_name,password,email) values(?,?,?)";




					pstmt=connection.prepareStatement(query);

					pstmt.setString(1,name);
					pstmt.setString(2,password);
					pstmt.setString(3,email);



					int res=pstmt.executeUpdate();
					if(res!=0) {
						System.out.println("Registration successful and an account is created");
					}



				}else
				{
					System.out.println("enter a valid input");
				}



			} catch (Exception e) {
				e.printStackTrace();
			}

			finally {
				try {
					if(connection!=null) {
						connection.close();
					}
					if(pstmt!=null) {
						pstmt.close();
					}
					if(stmt!=null) {
						pstmt.close();
					}
					if(resultset!=null) {
						resultset.close();
					}


				}catch(Exception e) {
					e.printStackTrace();

				}
			}




		}


	}




}


