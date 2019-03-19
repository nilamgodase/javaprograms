


/******************************************************************************
 *  Compilation:  javac -d bin DayOfweek.java
 *  Execution:    java -cp bin com.Bridgelabz.util
 *  
 *  Purpose: DayOfWeek
 *
 *  @author  Nilam Godase
 *  @version 1.0
 *  @since   25-02-2019
 *
 ******************************************************************************/

package com.Bridgelabz.AlgorithmPrograms;

	import java.util.Scanner;

	public class DayOfweek {
		
		
	 /**
	  *    main function to test the class
	  */
		public static void main(String[] args) {
			int d, m, y;
			Scanner s = new Scanner(System.in);
			System.out.println("enter date in day month year:");
			d = s.nextInt();
			m = s.nextInt();
			y = s.nextInt();
			String arr[]= {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
			int a=Util.dayOfWeek(d, m, y);
			if(a<=arr.length)
				System.out.println("The day is: "+arr[a]);
		
			
		}
	}

