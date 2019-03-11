
/******************************************************************************
 *  Compilation:  javac -d bin MonthlyPayment.java
 *  Execution:    java -cp bin com.Bridgelabz.AlgorithamPrograms.util
 *  
 *  Purpose: MonthlyPayment
 *
 *  @author  Nilam Godase
 *  @version 1.0
 *  @since   25-02-2019
 *
 ******************************************************************************/

package com.Bridgelabz.AlgorithmPrograms;

	import java.util.Scanner;

	
	public class MonthlyPayment {
		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.println("enter principal ,year and rate");
			double p = s.nextDouble();
			double y = s.nextDouble();
			double r = s.nextDouble();
			s.close();
			System.out.println("mothly payment is " + Util.monthlyPayment(p, y, r));
		}
	}

