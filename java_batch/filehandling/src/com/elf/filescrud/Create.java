package com.elf.filescrud;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Create {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   File myFile = new File("javadiscover.txt");
	        try{
	        if(!(myFile.exists())){ // checking file exist or not
	            myFile.createNewFile(); // Creating new file
	            System.out.println("New File created....");
	        }else{
	            System.out.println("File already exists....");
	        }
	        }catch (IOException e) {
	            e.printStackTrace();
	        }
	        FileWriter fWrite = null;
	        BufferedWriter bWrite = null;
	        
	        String content = "Hi All, Welcome to Java Discover";
	        File myFile1 = new File("javadiscover.txt");
	        
	        try{
	            if(!(myFile1.exists())){
	                myFile1.createNewFile();
	        }
	        fWrite = new FileWriter(myFile1, true); // true for appending content to the existing file
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
