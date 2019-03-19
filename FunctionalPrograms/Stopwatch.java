/******************************************************************************
	 *  Compilation:  javac -d bi  Stopwatch.java
	 *  Execution:    java -cp bin com.Bridgelabz.util  
	 *  Purpose: Simulate Stopwatch Program
	 *  @author  Nilam Godase
	 *  @version 1.0
	 *  @since   25-02-2019
	 *
	 ******************************************************************************/
package com.Bridgelabz.FunctionalPrograms;
public class Stopwatch 
{
	
public static void main(String[] args)
		{
			
			Utility u=new Utility();
			System.out.println("Press '1' to Start Time: ");
			u.inputInteger();
			u.start();

			System.out.println();
			System.out.println("Press '2' to Stop Time: ");
			u.inputInteger();
			u.stop();

			long l=u.getElapsedTime();
			System.out.println();
			System.out.println("Total Time Elapsed(in millisec) is:"+l);
			System.out.println();
			System.out.println("Converting millisec to seconds: "+(l/1000)+" sec");
		}
}


	