package com.Bridgelabz.AlgorithmPrograms;


	
	import java.io.BufferedReader;
	import java.io.InputStreamReader;
	import java.util.ArrayList;

	public class Utility 
	{
		BufferedReader br;
		double start, stop;
		public Utility()
		{
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		
		public String inputString() {
			

			try 
			{
				return br.readLine();
				
			} catch (Exception e) 
			{
				System.out.println(e);
			}
	       return "";
		}

		public int inputInteger() {
			
			try 
			{
				return Integer.parseInt(br.readLine());
				
			} catch (Exception e)
			{
				System.out.println(e);
			}
	      return 0;
		}

		public int intputInteger1() {
			
			try 
			{
				return Integer.parseInt(br.readLine());
				
			} catch (Exception e)
			{
				System.out.println(e);
			}
	      return 0;
		}

		public double StartTime() {
			start = System.currentTimeMillis();
			return start;
		}

		public double StopTime() {
			stop = System.currentTimeMillis();
			return stop;
		}
		public String BinarySearchInteger(ArrayList<Integer> my_intlist, int num, int min, int max) {
			String str1, str2;
			str1 = "INTEGER FOUND";
			str2 = "INTEGER NOT FOUND";
			int mid = (max + min) / 2;
			if (min > max)
				return str2;
			if (my_intlist.get(mid) == num) {
				return str1;
			} else if (my_intlist.get(mid) < num) {
				return BinarySearchInteger(my_intlist, num, min, mid - 1);
			} else {
				return BinarySearchInteger(my_intlist, num, mid + 1, max);
			}
		}

		// BINARY SEARCH STRING
		public String BinarySearchString(ArrayList<String> my_list, String str, int min, int max) {
			String str1, str2;
			str1 = "STRING FOUND";
			str2 = "STRING NOT FOUND";
			int mid = (max + min) / 2;
			if (min > max)
				return str2;
			if (my_list.get(mid).equals(str)) {
				return str1;
			} else if (my_list.get(mid).compareTo(str) > 0) {
				return BinarySearchString(my_list, str, min, mid - 1);
			} else {
				return BinarySearchString(my_list, str, mid + 1, max);
			}
	}

		public int binarySearch(int[] arr, int first, int last, int key) {
			if (last>=first){  
	            int mid = first + (last - first)/2;  
	            if (arr[mid] == key)
	            {  
	            return mid;  
	            }  
	            if (arr[mid] > key){  
	            return binarySearch(arr, first, mid-1, key);//search in left subarray  
	            }else{  
	            return binarySearch(arr, mid+1, last, key);//search in right subarray  
	            }  
	        }  
	        return -1;
		}
		public int binarySearchString(String[] arr1, String x) 
	    { 
	        int l = 0, r = arr1.length - 1; 
	        while (l <= r) { 
	            int m = l + (r - l) / 2; 
	  
	            int res = x.compareTo(arr1[m]); 
	  
	            // Check if x is present at mid 
	            if (res == 0) 
	                return m; 
	  
	            // If x greater, ignore left half 
	            if (res > 0) 
	                l = m + 1; 
	  
	            // If x is smaller, ignore right half 
	            else
	                r = m - 1; 
	        } 
	  
	        return -1; 
	    }

		public int[] insertionSortInt(int[] arr3, int num3) {

	        int i, j, temp;

	        for (i = 1; i< num3; i++) 

	        {

	            j = i;

	            temp = arr3[i];    

	            while (j > 0 && temp < arr3[j-1])

	            {

	                arr3[j] = arr3[j-1];

	                j = j-1;

	            }

	            arr3[j] = temp;   
	          

	        }
			return arr3;        		
		}

		public String[] insertionSortString(String[] str, int length) {
			String temp="";
			for(int i=0;i<length;i++){
			for(int j=i+1;j<length;j++){
			if(str[i].compareToIgnoreCase(str[j])>0){
			temp = str[i];
			str[i]=str[j];
			str[j]=temp;
			}
			}
			}
			return str;
		}

		public int[] bubbleSortInt(int[] arr5, int num2) {
		  
	        int temp = 0;  
	         for(int i=0; i < num2; i++){  
	                 for(int j=1; j < (num2-i); j++){  
	                          if(arr5[j-1] > arr5[j]){  
	                                 //swap elements  
	                                 temp = arr5[j-1];  
	                                 arr5[j-1] = arr5[j];  
	                                 arr5[j] = temp;  
	                         }  
	                          
	                 }  
	         }
			return arr5;  
	  
	    }

		public String[] bubbleSortString(String[] str3, int length) {
			String temp;
			 for (int j = 0; j < length; j++) {
		         for (int i = j + 1; i < length; i++) {
		            // comparing strings
		            if (str3[i].compareTo(str3[j]) < 0) {
		               temp = str3[j];
		               str3[j] = str3[i];
		               str3[i] = temp;
		            }
		         }
		         
		      }
			return str3;
		}  


	}


