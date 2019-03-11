/******************************************************************************
 *  Compilation:  javac -d bin MergeSort.java
 *  Execution:    java -cp bin com.Bridgelabz.util
 *  
 *  Purpose: MergeSort
 *
 *  @author  Nilam Godase
 *  @version 1.0
 *  @since   25-02-2019
 *
 ******************************************************************************/
package com.Bridgelabz.AlgorithmPrograms;


	public class MergeSort 
	{
		
	    private static void merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi) {
	        int i = lo, j = mid;
	        for (int k = lo; k < hi; k++)
	        {
	            if(i == mid)                 
	            	aux[k] = a[j++];
	            else if(j == hi)                  
	            	aux[k] = a[i++];
	            else if(a[j].compareTo(a[i]) < 0)
	            	aux[k] = a[j++];
	            else                              
	            	aux[k] = a[i++];
	        }

	        // copy back
	        for (int k = lo; k < hi; k++)
	            a[k] = aux[k];
	    }


	  
	    //Mergesort the subarray a[lo] .. a[hi-1], using the
	    // auxilliary array aux[] as scratch space.
	    
	    
	    public static void sort(Comparable[] a, Comparable[] aux, int lo, int hi) {

	        // base case
	        if (hi - lo <= 1) return;

	        // sort each half, recursively
	        int mid = lo + (hi - lo) / 2;
	        sort(a, aux, lo, mid);
	        sort(a, aux, mid, hi);

	        // merge back together
	        merge(a, aux, lo, mid, hi);
	    }


	   //  Sort the array a using mergesort.

	   
	   /* public static void sort(Comparable[] a) {
	        int n = a.length;
	        Comparable[] aux = new Comparable[n];
	        sort(a, aux, 0, n);
	    }*/

	   
	    //Sort the subarray a[lo..hi] using mergesort.

	    
	    public static void sort(Comparable[] a, int lo, int hi) {
	        int n = hi - lo + 1;
	        Comparable[] aux = new Comparable[n];
	        sort(a, aux, lo, hi);
	    }


	   
	    //  Check if array is sorted - useful for debugging.
	    
	   
	    private static boolean isSorted(Comparable[] a) {
	        for (int i = 1; i < a.length; i++)
	            if (a[i].compareTo(a[i-1]) < 0) return false;
	        return true;
	    }

	   
	     //Show results.
	   
	   
	   
	    public static void show(Comparable[] a) {
	        for (int i = 0; i < a.length; i++)
	            System.out.println(a[i]);
	    }


	   // Test client.
	  
	    public static void main(String[] args) {
	    	Utility u=new Utility();
	    	System.out.println("Enter a size of String:");
	    	
	        int size = u.inputInteger();
	        String[] str=new String[size];
	        System.out.println("Enter the String:");
	        for(int i=0;i<str.length;i++)
	        {
	        	str[i]=u.inputString();
	        }
	        MergeSort.sort(str,0,str.length);
	        assert isSorted(str);
	        System.out.println("After sorting the string:");
	        for (int i = 0; i < str.length; i++) {
	            System.out.print(str[i] + " ");
	        }
	        System.out.println();
	    }

	}

