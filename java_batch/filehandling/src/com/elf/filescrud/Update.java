package com.elf.filescrud;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Update {
	public static void main(String []args)
	{
		 FileWriter fWrite = null;
	        BufferedWriter bWrite = null;
	        
	        String content = "Hi All, The content gets changed";
	        File myFile = new File("javadiscover.txt");
	        
	        try{
	            if(!(myFile.exists())){
	                myFile.createNewFile();
	        }
	        fWrite = new FileWriter(myFile, true); // true for appending content to the existing file
	            bWrite = new BufferedWriter(fWrite);
	            bWrite.write(content);
	            bWrite.close();
	            
	            System.out.println("File write complete.....");
	            
	        }catch (IOException e) {
	            e.printStackTrace();
	        }finally{
	            if(fWrite != null) 
	                try { fWrite.close(); } catch (IOException e) { e.printStackTrace(); }
	            if(bWrite != null) 
	                try { bWrite.close(); } catch (IOException e) { e.printStackTrace(); }            
	        }
	}
}
