package com.tyss.jdbcapp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateSql {

	public static void main(String[] args) {
		
		
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("enter date :");
			String stringdate=sc.next();
			
			System.out.println("date as string "+stringdate);
			Date date=new SimpleDateFormat("dd/MM/yyyy").parse(stringdate);
			System.out.println("date as java.util date"+date);
			
			java.sql.Date sqlDate=new java.sql.Date(date.getTime());
			System.out.println("date in java.sql.date format"+sqlDate);
		} catch (Exception e) {

			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
			


	}

}
