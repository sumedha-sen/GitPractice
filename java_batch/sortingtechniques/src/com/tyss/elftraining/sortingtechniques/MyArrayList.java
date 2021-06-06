package com.tyss.elftraining.sortingtechniques;

import java.util.Arrays;
import java.util.Iterator;

public class MyArrayList {
	
	Object [] arr;
	int p;
	public MyArrayList(int size) {
		arr=new Object[size];
		p=0;
	}
	
   public void add(Object e) {
	   if(p>=arr.length) {
		   grow();
	   }
	   arr[p]=e;
	   p++;
	   
   }
   private void grow(){
	Object [] temp= new Object[arr.length+5];
	System.arraycopy(arr, 0, temp, 0, arr.length);
	arr=temp;
	}
   
   public int size() {
	   return p;
   }
   public Object get(int index) {
	return arr[index];
	   
   }
  public String toString() {
	  if(size()==0) {
		  System.out.println("[]");
	  }
	  String s="["+arr[0];
	  for(int i=1;i<size();i++) {
		 s+=", "+arr[i];
	  }
	  s+="]";
	  
	  
	 return s;  


   
  }
}