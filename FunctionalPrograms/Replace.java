/******************************************************************************
	 *  Compilation:  javac -d bi  Replace.java
	 *  Execution:    java -cp bin com.Bridgelabz.util  
	 *  Purpose: Replace string
	 *  @author  Nilam Godase
	 *  @version 1.0
	 *  @since   25-02-2019
	 *
	 ******************************************************************************/
	

package com.Bridgelabz.FunctionalPrograms;
import java.util.Scanner;

	
public class Replace 
{

		public static void main(String[] args) 
		{
			// INITIALIZATION
			String str1, str2, str3, str4;
			Utility u = new Utility();

			// INPUT DATA
			System.out.print("Enter String: ");
			str1 = u.inputString();

			System.out.print("Enter name you want to replace: ");
			str2 = u.inputString();

			System.out.print("Enter name you want to replace with: ");
			str3 = u.inputString();

			// COMPUTATION
			str4 = str1.replace(str2, str3);

			// OUTPUT
			System.out.println("New String: " + str4);
		}
	}
	