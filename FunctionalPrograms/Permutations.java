/******************************************************************************
 *  Compilation:  javac -d bi  Permutatioms.java
 *  Execution:    java -cp bin com.Bridgelabz.util
 *  
 *  Purpose: Write static functions to return all permutation of a String using iterative method and Recursion method. Check if the arrays returned by two string functions are equal. 
 *
 *  @author  Nilam Godase
 *  @version 1.0
 *  @since   25-02-2019
 *
 ******************************************************************************/


package com.Bridgelabz.FunctionalPrograms;

public class Permutations 
{

public static void main(String[] agrs)
{
	Utility utility= new Utility();
	System.out.println("Enter String");
    String str=utility.inputString();
    Utility.permutations(str.toCharArray(),0);
}
}