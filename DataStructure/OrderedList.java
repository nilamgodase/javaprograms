/**
	 * @problem statement:Read a List of Numbers from a file and arrange it ascending Order in a Linked List.
	 *                    Take user input for a number, if found then pop the number out of the list else insert the number in appropriate position

	 * @author: Nilam Godase
	 * @date: 2/03/2019
	 * @version:1.0
	 */


	/**@param: created the class of orderlist using Iofile,linked list.
	 */
package com.Bridgelabz.DataStructure;
import java.io.BufferedReader;
	import java.io.BufferedWriter;
	import java.io.FileReader;
	import java.io.FileWriter;
	
	public class OrderedList {
		
		public void unorderList() {   //first defined the unorderedlist
			IoFile io = new IoFile();  //created object of IoFile
			String str[]=io.readFromFile("/home/admin1/Documents/Data.txt").split(" "); //read the file using readfromfile method
			Utility u = new Utility(); 
			LinkedList list = new LinkedList(); //created object of linklist
			for(int i=0; i<str.length; i++) {  //check the length of string
				list.sort(str[i]);  //sorting the string
			}
			list.display(); //display the list 
			String st = u.getNext("\nEnter word");  //for user input
			if(list.search(st)) {     //searched the word from the file
				list.remove(st);   //remove the word from the file
			}else list.sort(st); //otherwise again sort the word
			list.display();      //again display
			io.writeToFile(list,"/home/admin1/Documents/Data.txt");  //write into the file
		}
			
		public static void main(String[] args) {
				// TODO Auto-generated method stub
			OrderedList un = new OrderedList();
			un.unorderList();
			}
		}

		

