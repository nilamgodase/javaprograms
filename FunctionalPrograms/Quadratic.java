/******************************************************************************
	 *  Compilation:  javac -d bi  Quadratic.java
	 *  Execution:    java -cp bin com.Bridgelabz.util  
	 *  Purpose: Write a program Quadratic.java to find the roots of the equation a*x*x + b*x + c. 
	 *  @author  Nilam Godase
	 *  @version 1.0
	 *  @since   25-02-2019
	 *
	 ******************************************************************************/
	
package com.Bridgelabz.FunctionalPrograms;

public class Quadratic 
{
public static void main(String[] agrs)

{
	Utility utility= new Utility();
    System.out.println("\n Enter value of a :");
    int a= utility.inputInteger();
    System.out.println("\n Enter value of b");
    int b=utility.inputInteger();
    System.out.println("\n Enter value of c");
    int c=utility.inputInteger();
    System.out.println("\n Equation is:"+a+"x*x + "+b+"x +"+c);
    utility.CalculateRoots(a,b,c);

    

}

}
	
