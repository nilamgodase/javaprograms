/******************************************************************************
 *  Compilation:  javac -d bin InsertionSort.java
 *  Execution:    java -cp bin com.Bridgelabz.util
 *  
 *  Purpose: Insertion sort
 *
 *  @author  Nilam Godase
 *  @version 1.0
 *  @since   25-02-2019
 *
 ******************************************************************************/
package com.Bridgelabz.AlgorithmPrograms;
	public class InsertionSort
	{
		public static void main(String []args)
		{
			Utility u=new Utility();
			System.out.println("Enter the size of array:");
			int size3=u.inputInteger();
			String str[] = new String[size3];
			 System.out.println("Enter Words in array:");
			 for(int i=0;i<str.length;i++)
		        {       
		        	str[i]=u.inputString();
		        }
			 System.out.println("Before Insertion Sort:");    
		        for(int i=0;i<str.length;i++)
		        {    
		            System.out.print(str[i]+" ");    
		        }  
		        String str2[]=u.insertionSortString(str,str.length);
		        System.out.println(" ");
		        System.out.println("After Insertion Sort:"); 
		        for(String i:str2)
		        {
		        	System.out.println(i);
		        }
		}
		

	}

