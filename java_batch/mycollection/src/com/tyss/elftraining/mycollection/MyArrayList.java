package com.tyss.elftraining.mycollection;

import java.util.Iterator;

public class MyArrayList<E> implements Iterable<E>{
   Object []arr;
   Object[] default_arr;
   private int size;
  //private int position;
   
   public MyArrayList() {
	   arr=default_arr;
   }
   public MyArrayList(int size) {
	   arr=new Object[size];
	   
   }
   public boolean add(Object element) {
	   arr[size++]=element;
	   return true;
   }
   public Object get(int index) {
	   return arr[index];
   }
    
  public void set(int index,Object element) {
	  arr[index]=(int) element;
  }
  
  public Object remove(int index) {
	  Object deletedValue=arr[index];
	  int len=size-index-1;
	  System.arraycopy(arr, index+1, arr, index, len);
	  arr[--size]=0;
	  return deletedValue;
	  
	  
	  
  }
  
  
 
  
   

   public String toString() {
	   for(int i=0;i<arr.length;i++) {
		   if(arr[i]!=null) {
			   System.out.println(arr[i]);
		   }
	   }
	return "";
	   
   }
   public int size() {
	   return this.size;
   }

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return new MyItr();
	}
	
	class MyItr implements Iterator<E>{
		
		int index;

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return (index<size)?true:false;
		}

		@Override
		public E next() {
		
			E e=(E)arr[index++];
			return e;
		}

		
		
	}
	
	
}
