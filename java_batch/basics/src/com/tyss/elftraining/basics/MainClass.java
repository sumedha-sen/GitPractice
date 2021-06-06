package com.tyss.elftraining.basics;

import java.io.FileInputStream;

public class MainClass {
	public static void main(String[]args) throws Exception
	{
		FileInputStream fileInputStream=new FileInputStream("src/demo1.txt");
		int i=fileInputStream.read();
		while(i!=-1)
		{
			char data=(char)i;
			System.out.print(data);
			i=fileInputStream.read();
			
		}
		fileInputStream.close();
		
	}

}
