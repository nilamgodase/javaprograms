/******************************************************************************

 *  Compilation:  javac -d bin AnagramString.java
 *  Execution:    java -cp bin com.Bridgelabz.AlgorithamPrograms.util
 *  
 *  Purpose: An Anagram Detection Example
 *
 *  @author  Nilam Godase
 *  @version 1.0
 *  @since   25-02-2019
 *
 ******************************************************************************/



package com.Bridgelabz.AlgorithmPrograms;


import java.util.Arrays;

  

public class AnagramString {  
    static void isAnagram(String str1, String str2) {  
        String s1 = str1.replaceAll("\\s", "");  
        String s2 = str2.replaceAll("\\s", "");  
        boolean status = true;  
        if (s1.length() != s2.length()) {  
            status = false;  
        } else {  
            char[] ArrayS1 = s1.toLowerCase().toCharArray();  
            char[] ArrayS2 = s2.toLowerCase().toCharArray();  
            Arrays.sort(ArrayS1);  
            Arrays.sort(ArrayS2);  
            status = Arrays.equals(ArrayS1, ArrayS2);  
        }  
        if (status) {  
            System.out.println(s1 + " and " + s2 + " are anagrams");  
        } else {  
            System.out.println(s1 + " and " + s2 + " are not anagrams");  
        }  
    }  
   
    public static void main(String[] args) {
    	Utility u=new Utility();
    	System.out.println("Enter first String:");
    	String str1=u.inputString();
    	System.out.println("Enter Second String:");
    	String str2=u.inputString();
        isAnagram(str1, str2);  
         
    }  
}  


