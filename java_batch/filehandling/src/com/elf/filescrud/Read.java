package com.elf.filescrud;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Read {
	public static void main(String []args)
	{
		 BufferedReader br = null;
	        try{
	            FileReader myFile  = new FileReader("javadiscover.txt");
	            br = new BufferedReader(myFile);
	            String line = null; 
	            while ((line = br.readLine()) != null) {
	                System.out.println(line);
	            }
	        }catch (IOException e) {
	            e.printStackTrace();
	        }finally{
	            if(br != null) 
	                try{ br.close(); }catch(IOException e){e.printStackTrace();}
	        }        
	}

}
