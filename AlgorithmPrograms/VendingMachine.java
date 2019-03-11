
/******************************************************************************
 *  Compilation:  javac -d b VendingMachine.java
 *  Execution:    java -cp bin com.Bridgelabz.AlgorithamPrograms.util
 *  
 *  Purpose: Find the Fewest Notes to be returned for Vending Machine

 *
 *  @author  Nilam Godase
 *  @version 1.0
 *  @since   25-02-2019
 *
 ******************************************************************************/


package com.Bridgelabz.AlgorithmPrograms;

public class VendingMachine 
{
	// Static Variables i for indexing the array and total for calculating the total Notes
  	static int i=0;
  	static int total=0;

  	//Initialization of New Array
  	static int[] notes = { 1000,500,100,50,10,5,2,1};
  	static int money;

  	// Function for Calculating the notes
  	public static  int calculate(int money,int[]notes )
  	{
  		//calling calculate Function
        int rem;
		if(money==0)
		{
			return -1 ;
		}
		else
		{
			if(money>=notes[i])
			{
				// logic for Calculating The notes
				int calNotes =money/notes[i];
				rem = money%notes[i];
				money =rem;
				total += calNotes;
				System.out.println(notes[i]+   " Notes ---> " +calNotes );
			}
			i++;
			return calculate(money, notes);
		}
	}//end of method

  	// Starting Main Function
	public static void main(String[] args)
	{
        Utility u1=new Utility();

		//ask the user enter the money
		System.out.print("Enter the Amount:");
		money =u1.inputInteger();

		// Creating The Object of Vending MAchine class
		VendingMachine.calculate(money,notes);
		System.out.println("Total Number of Notes are :"+total);
	}
}



