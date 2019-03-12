package com.Bridgelabz.DataStructure;



	import java.util.ArrayList;
	import java.util.Arrays;

	public class PrimeAnagram
	{
	   static String[][]primeAnagramArray=new String[13][13];
	    
		static ArrayList<Integer> primeList=new ArrayList<Integer>();
	    static ArrayList<Integer> anagramList=new ArrayList<Integer>();
	    

	 public static void primeAnagram() 
	 {
		 boolean flag;
	    for(int i=2;i<=1000;i++)
	    {
	      flag=true;
	      for(int j=2;j<i/2;j++)
	      {
	    	  if(i%j==0)
	    	  {
	    		  flag=false;
	    		  break;
	    	  }
	      }
	      if(flag)
	    	  primeList.add(i);
	    }
	    
	    for(int i=0;i<primeList.size();i++)
	    {
	    	for(int j=i+1;j<primeList.size();j++)
	    	{
	    		if(anagram(primeList.get(i),primeList.get(j)))//anagram calling 
	    		{
	    			//System.out.println(primeList.get(i)+" "+primeList.get(j));
	    			anagramList.add(primeList.get(i));
	    		}
	    	}
	    }
	    PrimeAnagram.storeElement();
	    PrimeAnagram.display();
	}
	 
	 public static void storeElement()
	 { int index=0;
		 for(int i=0;i<13;i++)
		 {
			 for(int j=0;j<13;j++)
			 {
				
				primeAnagramArray[i][j]= primeList.get(index).toString();
				index++;
			 }
		 }
	 }
	 public static void display()
	 {
		 for(int i=0;i<primeAnagramArray.length;i++)
		 {
			 for(int j=0;j<primeAnagramArray.length;j++)
			 {
				System.out.print(primeAnagramArray[i][j]+" ");
			 }
			 System.out.println();
		 }
	 }
		public static boolean anagram(int n1, int n2) 
		{
			int[] n1count = counting(n1);
			int[] n2count = counting(n2);
			for (int i = 0; i < n2count.length; i++)
			{
				if (n1count[i] != n2count[i]) 
				{
					return false;
				}
			}
			return true;
		}

	private static int[] counting(int n1)
	{
		int[] count = new int[10];
		int temp = n1;
		while (temp != 0) 
		{
			int rem = temp % 10;
			count[rem]++;
			temp = temp / 10;
		}
		return count;
	}		
		
	public static void main(String[] args)
	{
		System.out.println("Prime Anagram Numbers 0-1000 :");
		PrimeAnagram.primeAnagram();
	}
	}





