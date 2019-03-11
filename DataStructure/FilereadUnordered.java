/******************************************************************************
 *  Compilation:  javac -d bin FilereadUnordered.java
 *  Execution:    java -cp bin com.Bridgelabz.util
 *  
 *  Purpose: Ensure parentheses must appear in a balanced fashion.

 *  @author  Nilam Godase
 *  @version 1.0
 *  @since   5-03-2019
 *
 ******************************************************************************/


package com.Bridgelabz.DataStructure;


	import java.io.File;
	import java.io.FileNotFoundException;
	import java.io.FileWriter;
	import java.io.IOException;
	import java.io.PrintWriter;
	import java.util.Scanner;



	public class FilereadUnordered 
	{
		
		public static void main(String[] args) 
		{
			try {
				// creating a new file
				File f1 = new File("/home/admin1/Documents/Data.txt");
				UnorderedList<String> list = new UnorderedList<>();
				Scanner sf = new Scanner(f1);
				Scanner s = new Scanner(System.in);
				// addind values from file to list
				while (sf.hasNext()) {
					list.add(sf.next());
				}
				// printing list
				System.out.println(list);
				/*
				 * writing to file using file writer
				 */
				FileWriter fw = new FileWriter(f1);
				System.out.println("enter a word ");
				String s1 = s.nextLine();
				System.out.println(list.size());
				// checking if word is found and deleting it and then saving list to file
				if (list.search(s1)) {
					list.remove(s1);
					int n = 0;
					while (n < list.size()) {
						fw.write(list.pop(0) + " ");
						fw.flush();
						n++;
					}
					System.out.println("found and deleted");
					// or adding it to list and saving it to file
				} else {
					list.add(s1);
					int n = 0;
					while (n < list.size()) {
						fw.write(list.pop(0) + " ");
						fw.flush();
						n++;
					}
					System.out.println("added and saved");
					fw.close();
					s.close();
				}

			} catch (FileNotFoundException e)
			{
				System.out.println("file not found");
			} catch (IOException e)
			{
				System.out.println("io excep");
			}
		}
	}

