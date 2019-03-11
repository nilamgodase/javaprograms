package com.Bridgelabz.DataStructure;


	
	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.Stack;

	/**
	 /*@problem statement:Add the Prime Numbers that are Anagram in the Range of 0 ­ 1000 in a stack using
		                  the Linked List and Print the Anagrams in the Reverse Order. Note no Collection
		                  Library can be used.
	 *@author : Nilam Goadse
	 *@since: 03/3/2019
	 *@version:1.0
	 */


	/**@param creating class of primeAnagram using stack
	 */
	public class PrimeAnagramStack 
	{

		public Stack primeAnagram() 
		{
			Stack stack = new Stack();  //created object of stack
			Utility u = new Utility();
			ArrayList arr = u.getPrimeNumberInRange(1000); //take the number in range 1000
			System.out.println(arr);
	 		for(int i=0; i<arr.size()-1; i++) {
				for(int j=i+1; j<arr.size(); j++) {
					if(u.isAnagram(String.valueOf(arr.get(i)),String.valueOf(arr.get(j)))) { //check the value of both i and j using string valueOf method
						stack.push(String.valueOf(arr.get(i)));  //push the number in stack
						stack.push(String.valueOf(arr.get(j)));
					}
				}
			}
			return stack;
		}
		
		public static void main(String[] args)
		{
			PrimeAnagramStack p = new PrimeAnagramStack();
			Stack stack = p.primeAnagram();   //called the stack to check the prime snumber is anagram or not
			int len = stack.size();
			for(int i=0; i<len; i++) {
				System.out.print(stack.pop()+" ");  //if number is anagram then it should be pop from stack and printed
			}


	}
}
