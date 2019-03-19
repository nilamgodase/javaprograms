/******************************************************************************
 *  Compilation:  javac -d bi  Factor.java
 *  Execution:    java -cp bin com.Bridgelabz.util
 *  
 *  Purpose: Computes the prime factorization of N using brute force.

 *
 *  @author  Nilam Godase
 *  @version 1.0
 *  @since   25-02-2019
 *
 ******************************************************************************/



package com.Bridgelabz.FunctionalPrograms;
import java.io.*; 
import java.lang.Math; 
import java.util.Scanner;
public class Factor 
{
	
		public static void main(String[] args) {
			int choice = 0;
			do {
				// take the variable to store the number
				int number;
				Scanner scanner = new Scanner(System.in);
				System.out.println("Enter a number");
				number = scanner.nextInt();
				Utility.primeFactors(number);
				System.out.println("press 1 for continue");
				choice = scanner.nextInt();
			} while (choice == 1);

		}
	}
