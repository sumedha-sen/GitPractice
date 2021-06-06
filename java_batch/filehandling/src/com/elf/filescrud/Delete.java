package com.elf.filescrud;

import java.io.File;
import java.io.IOException;

public class Delete {
	public static void main(String []args)
	{
		File myFile = new File("java2.txt");
        try{
        if(!(myFile.exists())){ // checking file exist or not
            myFile.createNewFile(); // Creating new file
            System.out.println("New File created....");
        }else{
            System.out.println("File already exisit....");
        }
        }catch (IOException e) {
            e.printStackTrace();
        }
        try{
            File myFile1 = new File("java2.txt");
            if(myFile1.exists()){
                myFile1.delete();
                System.out.println("File deleted successfully....");
            }else{
                System.out.println("File NOT Exisit....");
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
	}

}
