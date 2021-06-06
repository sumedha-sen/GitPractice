package com.tyss.elftraining.sortingtechniques;

public class MainClass {
	

	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			int [] arr={90,101,45,65,23,67,89,34};
		
			
			Sorting s=new Sorting();
			s.bubbleSort(arr);
			s.display(arr);
			s.selectionSort(arr);
			s.display(arr);
			s.insertionSort(arr);
			s.display(arr);
			s.sort(arr, 0, arr.length-1);
			s.display(arr);
			s.sort1(arr, 0, arr.length-1);
			s.display(arr);

		}

	}



