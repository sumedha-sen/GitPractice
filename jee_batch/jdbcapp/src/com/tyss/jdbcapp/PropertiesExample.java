package com.tyss.jdbcapp;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesExample {

	public static void main(String[] args) {

           try {
			FileOutputStream fileoutputstream=new  FileOutputStream("directory.properties");
			Properties properties=new Properties();
			
			properties.setProperty("sara", "9865678903");
			properties.setProperty("tara", "9865678973");
			
		
			properties.store(fileoutputstream, "First Properties Example");
			System.out.println("success");
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
           
	}

}
