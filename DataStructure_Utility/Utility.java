package com.Bridgelabz.DataStructure_Utility;




	import java.util.ArrayList;

	public class Utility
	{
	public boolean isAnagram(String first, String second)
	{
		boolean bool[];
		int counter = 0;
		if(first.length() == second.length()) 
		{
			bool = new boolean[second.length()];
			for(int j=0; j<second.length();j++)
				bool[j] = false;
			for(int i=0; i<second.length();i++) 
			{
				for(int j=0; j<second.length();j++)
				{
					if(first.charAt(i)==second.charAt(j) && bool[j]== false)
					{
						bool[j] = true;
						counter++;
						break;
					}
				}
			}
				if(counter==second.length())
				{
					return true;
				}
			
			else
			{
				return false;
				
			}
		}
			else
			{
		return false;
		
	}
	}

	public boolean isPrime(int n)
	{
		for(int i=2; i<n;i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
		}

	public ArrayList getPrimeNumberInRange(int range)
	{
	ArrayList arr= new ArrayList<Integer>();
	int j=0;
	for(int i=2; i<=range;i++)
	{
		if(isPrime(i))
			{
			arr.add(i);
			}
	}
		return arr;

	}

	public int getInt(String string) {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean isLeapYear(int year) {
		// TODO Auto-generated method stub
		return false;
	}

	}



