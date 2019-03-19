/******************************************************************************
	 *  Compilation:  javac -d bi  Windchill.java
	 *  Execution:    java -cp bin com.Bridgelabz.util  
	 *  Purpose: Windchill
	 *  @author  Nilam Godase
	 *  @version 1.0
	 *  @since   25-02-2019
******************************************************************************/
package com.Bridgelabz.FunctionalPrograms;
import java.util.Scanner;
	 
	public class Windchill
	{
	 
	    public static void main(String[] args) 
	    {
	         
	        // Display Program Information
	        System.out.println("This Program Calculates Wind-chill Temperature.\n");
	 
	        // create Scanner 
	        Scanner input = new Scanner(System.in);
	 
	        // prompt user to enter details
	        System.out.println("Enter the outside temperature in Fahrenheit "
	                + "(between -58 and 41 degrees):");
	        double temperature = input.nextDouble();
	        System.out.println("Enter the wind speed in miles per hour "
	                + "(greater than or equal to 2 mph):");
	        double speed = input.nextDouble();
	 
	        // calculate area using the formula 
	        //twc = 35.74 + (0.6215 * ta) - (35.75 * Math.pow(v, 0.16)) + (0.4275 * ta * Math.pow(v, 0.16))
	        // where twc = wind-chill temperature
	        // ta = outside temperature measured in degrees Fahrenheit
	        // v = v is the speed measured in miles per hour
	        // Note that formula cannot be used for wind speeds below 2 mph or 
	        // temperatures below -58 degrees Fahrenheit or above 41 degrees Fahrenheit
	        double windChillTemperature = 35.74 + (0.6215 * temperature) - (35.75
	                * Math.pow(speed, 0.16)) + (0.4275 * temperature * Math.pow(speed, 0.16));
	        // format area to five decimal places
	        windChillTemperature = (int) (windChillTemperature * 100000) / 100000.0;
	 
	        // display the result
	        System.out.println("windchill  is " + windChillTemperature + "\n");
	    }
	}


