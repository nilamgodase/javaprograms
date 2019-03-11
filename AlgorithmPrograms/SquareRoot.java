
/******************************************************************************
 *  Compilation:  javac -d bin SquareRoot.java
 *  Execution:    java -cp bin com.Bridgelabz.AlgorithamPrograms.util
 *  
 *  Purpose: Find the square root of given number

 *
 *  @author  Nilam Godase
 *  @version 1.0
 *  @since   25-02-2019
 *
 ******************************************************************************/


package com.Bridgelabz.AlgorithmPrograms;


	import java.util.Scanner;

	public class SquareRoot {
		
	/**
	 * Main method to test the class
	 * @param args
	 * @throws Exception if input is not integer
	 */
		public static void main(String[] args) throws Exception {
			try {
				int d=10;
				Scanner s = new Scanner(System.in);
				System.out.println("enter decimal no");
				double c = s.nextDouble();
				System.out.println("square root is " + Util.sqrt(c));
				s.close();
			} catch (Exception e) {
				System.out.println("inter integer value "+e.getMessage());
			}

		}
	}

