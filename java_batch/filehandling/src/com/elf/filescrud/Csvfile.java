        package com.elf.filescrud;



	
		// TODO Auto-generated method stub
		import java.io.*;  
		import java.util.Scanner;  
		public class Csvfile 
		{  
		public static void main(String[] args) throws Exception  
		{  
		 
		Scanner sc = new Scanner(new File("C:\\Users\\Sumedha\\Desktop\\java_batch\\newfile.csv"));  
		//sc.useDelimiter(",");     
		while (sc.hasNext())    
		{  
		System.out.print(sc.next());  
		}   
		sc.close();  
		}  
		}  
	


