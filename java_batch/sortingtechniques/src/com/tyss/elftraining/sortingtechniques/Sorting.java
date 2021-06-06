package com.tyss.elftraining.sortingtechniques;

public class Sorting {
	

	
		

		public void bubbleSort(int arr[]) {
			int i, j;
			
			System.out.println("Sort using Bubble Sort algorithm");
			
			for (i = 0; i < arr.length-1; i++) {
				for (j = 1; j < (arr.length - i); j++) {
					if (arr[j - 1] > arr[j]) {
						int temp = arr[j - 1];
						arr[j - 1] = arr[j];
						arr[j] = temp;
					}
				}
			}
			

		}
		
		
		public void selectionSort(int arr[]) {
			System.out.println("Sort using Selection Sort algorithm");
			
			for (int i = 0; i < arr.length - 1; i++) {
				int index = i;
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[j] < arr[index]) {
						index = j;// searching for lowest index
					}
				}
			}
			
		}

		public void insertionSort(int arr[]) {
			
			System.out.println("Sort using Insertion Sort algorithm");
			
			for (int j = 1; j < arr.length; j++) {
				int key = arr[j];
				int i = j - 1;
				while ((i > -1) && (arr[i] > key)) {
					arr[i + 1] = arr[i];
					i--;
				}
				arr[i + 1] = key;
			}
			
		}

		public void mergeSort(int arr[], int beg, int mid, int end) {
			
			
			int l = mid - beg + 1;
			int r = end - mid;

			int LeftArray[] = new int[l];
			int RightArray[] = new int[r];

			for (int i = 0; i < l; ++i)
				LeftArray[i] = arr[beg + i];

			for (int j = 0; j < r; ++j)
				RightArray[j] = arr[mid + 1 + j];

			int i = 0, j = 0;
			int k = beg;
			while (i < l && j < r) {
				if (LeftArray[i] <= RightArray[j]) {
					arr[k] = LeftArray[i];
					i++;
				} else {
					arr[k] = RightArray[j];
					j++;
				}
				k++;
			}
			while (i < l) {
				arr[k] = LeftArray[i];
				i++;
				k++;
			}
			while (j < r) {
				arr[k] = RightArray[j];
				j++;
				k++;
			}
		}

		void sort(int arr[], int beg, int end) {
			System.out.println("Sort using Merge Sort algorithm");
			
			if (beg < end) {
				int mid = (beg + end) / 2;
				sort(arr, beg, mid);
				sort(arr, mid + 1, end);
				mergeSort(arr, beg, mid, end);
			}
			
		}

		public int quickSort(int arr[], int beg, int end) {
			
			System.out.println("Sort using Quick Sort algorithm");
			
			int left, right, temp, loc, flag;
			loc = left = beg;
			right = end;
			flag = 0;
			while (flag != 1) {
				while ((arr[loc] <= arr[right]) && (loc != right))
					right--;
				if (loc == right)
					flag = 1;
				else if (arr[loc] > arr[right]) {
					temp = arr[loc];
					arr[loc] = arr[right];
					arr[right] = temp;
					loc = right;
				}
				if (flag != 1) {
					while ((arr[loc] >= arr[left]) && (loc != left))
						left++;
					if (loc == left)
						flag = 1;
					else if (arr[loc] < arr[left]) {
						temp = arr[loc];
						arr[loc] = arr[left];
						arr[left] = temp;
						loc = left;
					}
				}
			}
			return loc;
		}

		public void sort1(int arr[], int beg, int end) {
			int loc;
			if (beg < end) {
				loc = quickSort(arr, beg, end);
				quickSort(arr, beg, loc - 1);
				quickSort(arr, loc + 1, end);
			}
			

		}
		
		void heapify(int arr[], int size, int i)  
		{  
			int temp;
		
		int largest = i;    
		int left = 2*i + 1;    
		int right = 2*i + 2;    
		  
		if (left < size && arr[left] >arr[largest])  
		largest = left;  
		  
		if (right < size && arr[right] > arr[largest])  
		largest = right;  
		  
		if (largest != i)  
		{  
		temp = arr[i];  
		    arr[i]= arr[largest];   
		    arr[largest] = temp;  
		heapify(arr, size, largest);  
		}  
		}  
		  
		void heapSort(int arr[], int size)  
		{  
			int temp;
		
		int i;  
		for (i = size / 2 - 1; i >= 0; i--)  
		heapify(arr, size, i);  
		for (i=size-1; i>=0; i--)  
		{  
		temp = arr[0];  
		    arr[0]= arr[i];   
		    arr[i] = temp;  
		heapify(arr, i, 0);  
		}  
		}
		
		public void display(int arr[])
		{
			System.out.println("Display array elements");
			for(int i=0;i<=arr.length-1;i++)
			{
				System.out.println(arr[i]);
			}
		}
	}



