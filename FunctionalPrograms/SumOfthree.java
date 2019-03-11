/******************************************************************************
	 *  Compilation:  javac -d bi  SumOfthree.java
	 *  Execution:    java -cp bin com.Bridgelabz.util  
	 *  Purpose: Sum of three Integer adds to ZERO
	 *  @author  Nilam Godase
	 *  @version 1.0
	 *  @since   25-02-2019
	 *
	 ******************************************************************************/
	

package com.Bridgelabz.FunctionalPrograms;
import java.io.*; 
import java.util.Scanner;
public class SumOfthree {

	 
		// Driver program to test above functions
		public static void main(String[] args) 
		{
			int choice = 0;
			do{		
			Utility utility = new Utility();
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the number of elements that u want in array");
			int n = scanner.nextInt();
			int A[] = new int[n];
			System.out.println("Enter all the elements");
			for(int i =0;i<n;i++)
			{
			  A[i] = scanner.nextInt();
			}
			System.out.println("enter the sum that you want to check");
				
				int arr_size = A.length;
				int sum = scanner.nextInt();
				
				boolean b = utility.find3Numbers(A, arr_size, sum);
				if(!b )
				{
					System.out.println("triplet not found");
				}
				System.out.println("press 1 for continue");
				choice = utility.inputInteger();
				
			}while(choice == 1);
		}
	}