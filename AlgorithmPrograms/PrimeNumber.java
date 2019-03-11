

/******************************************************************************
 *  Compilation:  javac -d b PrimeNumber.java
 *  Execution:    java -cp bin com.Bridgelabz.AlgorithamPrograms.util
 *  
 *  Purpose: Check is PrimeNumber Example
 *
 *  @author  Nilam Godase
 *  @version 1.0
 *  @since   25-02-2019
 *
 ******************************************************************************/

package com.Bridgelabz.AlgorithmPrograms;


	
	public class PrimeNumber 
	{
		public static void main(String[] args) 
		{
			 int i,j,temp;
		        for(i=0;i<1000;i++)
		        {
		         if(i!=0 && i!=1)
		          {
		            temp=0;
		            for(j=2;j<i;j++)
		            {
		                if(i%j==0)
		                {
		                    temp=temp+1;
		                    break;
		                }
		            }
		            if(temp==0)
		            {
		                System.out.println(i);
		               
		            }
		          }
		        }
	     }

	}


