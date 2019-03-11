

/******************************************************************************
 *  Compilation:  javac -d bin PrimeNum2.java
 *  Execution:    java -cp bin com.Bridgelabz.AlgorithamPrograms.util
 *  
 *  Purpose: Check is palindrome Example
 *
 *  @author  Nilam Godase
 *  @version 1.0
 *  @since   25-02-2019
 *
 ******************************************************************************/


package com.Bridgelabz.AlgorithmPrograms;


	

	public class PrimeNum2 
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
		                //System.out.println(i);
		                isPalindrome(i);
		            }
		          }
		        }
	     }
		private static void isPalindrome(int i) {
			// TODO Auto-generated method stub
			int rev=0,rem, k=i;
			while( i != 0 )
	        {
	            rem = i % 10;
	            rev = rev * 10 + rem;
	            i  /= 10;
	        }
			if (k == rev) {
			
				if(k<=10) {
					 System.out.println(k + " ");
				}else
				{
					//isAnagram(k);
					 System.out.println(k + " is a palindrome.");
				}
			}
	        else
	           System.out.println(k + " is not a palindrome.");
			
		}
		private static void isAnagram(int k) {
			// TODO Auto-generated method stub
			int j=k;
			
		}

	}

                
