/******************************************************************************
 *  Compilation:  javac -d bin PrimeNumber2D.java
 *  Execution:    java -cp bin com.Bridgelabz.util
 *  
 *  Purpose:Take a range of 0 - 1000 Numbers and find the Prime numbers in that range. Store the prime numbers in a 2D Array, the first dimension represents the range 0-100, 100-200, and so on. While the second dimension represents the prime numbers in that range

 *  @author  Nilam Godase
 *  @version 1.0
 *  @since   25-02-2019
 *
 ******************************************************************************/
package com.Bridgelabz.DataStructure;
public class PrimeNumber2D {

	int primeArray[][]=new int[10][25];

	public static void main(String[] args)
	{
		//  int printArray[][]=new int[10][25];
		System.out.println("prime numbers in 2D Array :");
		System.out.println();
		PrimeNumber2D primeno=new PrimeNumber2D();
		int printArray[][]= primeno.display();

		for(int i=0;i<printArray.length;i++)
		{
			for(int j=0;j<printArray[0].length;j++)
			{
				System.out.print(printArray[i][j]+ "  ");
			}
			System.out.println();
		}
	}

	public int[][] display()
	{
		int first=0,second=0,third=0,four=0,five=0,six=0,seven=0,eight=0,nine=0,ten=0;
		for(int i=2;i<1000;i++)
		{
			
			
			if( PrimeNumber2D.prime(i) == 0)
			{
				if((i>0) && (i<100))
				{
					primeArray[0][first++]=i;
					
				}
				else if((i>100) && (i<200))
				{
					primeArray[1][second++]=i;
				}
				else if((i>200) && (i<300))
				{
					primeArray[2][third++]=i;
				}
				else if((i>300) && (i<400))
				{
					primeArray[3][four++]=i;
				}
				else if((i>400) && (i<500))
				{
					primeArray[4][five++]=i;
				}
				else if((i>500) && (i<600))
				{
					primeArray[5][six++]=i;
				}
				else if((i>600) && (i<700))
				{
					primeArray[6][seven++]=i;
				}
				else if((i>700) && (i<800))
				{
					primeArray[7][eight++]=i;
				}
				else if((i>800) && (i<900))
				{
					primeArray[8][nine++]=i;
				}
				else if((i>900) && (i<1000))
				{
					primeArray[9][ten++]=i;
				}
			}
		}
		return primeArray;
	}
	static int prime(int number)
	{
		int flag=0;
		for(int j=2;j<number;j++)
		{
			if(number%j==0)
			{
				flag=1;
			}
		}

		return flag;	
	}
}

