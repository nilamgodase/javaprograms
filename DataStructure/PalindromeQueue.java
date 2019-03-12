package com.Bridgelabz.DataStructure;

public class PalindromeQueue 
{
	public boolean isPalindrome(String str)  //passed the parameter string str 
	{
		String s[]=str.split("");  //used  split function
		Queue queue = new Queue(); ////create object of queue
		for(int i=0; i<s.length; i++) {  //check the length of string and return type is array used s variable
			queue.enqueue(s[i]);         
		}
		int j = s.length-1;  //for at the last of string character
		int count=0;   
		while(queue.size()>0) {  //check the string size using queue
			if(queue.dequeue().equals(s[j])) { //if strings character is equals then counter will increased
				count++;
				j--;
			}
//			System.out.println(queue.dequeueOne());
		}
		if(count==s.length) return true;  //if length of string is equal to the counter value then return true otherwise return false
		                                      
		else return false;
		
	}
	
	
	/**
	 * 
	 * @param:  main method
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PalindromeQueue p =new PalindromeQueue();   //creating object of class
		Utility u = new Utility();  
		String str = u.getNext("Enter string for checking string is palindrome or not : "); //for user input
		if(p.isPalindrome(str)) System.out.println(str+", this string is palindrome"); 
		else System.out.println(str+", this string is not palindrome");
	}

}


