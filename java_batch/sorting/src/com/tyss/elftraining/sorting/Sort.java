package com.tyss.elftraining.sorting;

import java.util.Scanner;

public class Sort {
	public static void sortbyBubbleSort(int arr[]) {
		 int n = arr.length;  
	        int temp = 0;  
	         for(int i=0; i < n; i++){  
	                 for(int j=1; j < (n-i); j++){  
	                          if(arr[j-1] > arr[j]){  
	                                  
	                                 temp = arr[j-1];  
	                                 arr[j-1] = arr[j];  
	                                 arr[j] = temp;  
	                         }  
	                          
	                 }  
	         } 
	         display(arr);
	}
	     	public static void sortbySelectionSort(int arr[]) {
	     		for (int i = 0; i < arr.length - 1; i++)  
	            {  
	                int index = i;  
	                for (int j = i + 1; j < arr.length; j++){  
	                    if (arr[j] < arr[index]){  
	                        index = j;//searching for lowest index  
	                    }  
	                }  
	                int smallerNumber = arr[index];   
	                arr[index] = arr[i];  
	                arr[i] = smallerNumber;  
	   		
	   	         } 

        }
	
    public static void sortbyInsertionSort(int arr[]) {
        int n = arr.length;  
        for (int j = 1; j < n; j++) {  
            int key = arr[j];  
            int i = j-1;  
            while ( (i > -1) && ( arr [i] > key ) ) {  
                arr [i+1] = arr [i];  
                i--;  
            }  
            arr[i+1] = key;  
        }
	
    }
    
    public static void display(int []a) {
    	System.out.println("the sorted elements are:");
    	for(int i = 0; i < a.length; i++)
        {
           System.out.println( a[i]);
           
        }
    	
    }
   public static void main(String[]args) {
	   Scanner s=new Scanner(System.in);
	    System.out.print("Enter no. of elements you want in array:");
        int n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
           
        }
       System.out.println("Enter type of sorting");
        String str=s.next();
      
		if(str=="bubble") {
			
			sortbyBubbleSort(a);
        }else if(str=="selection") {
			
			sortbySelectionSort(a);
        }else if(str=="insertion") {
	
	       sortbyInsertionSort(a);
       }
        
      
	   
   }
    
}


     


