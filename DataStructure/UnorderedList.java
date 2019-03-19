
	/**
	 *@problem statement:Read the Text from a file, split it into words and arrange it as Linked List.
	 *                   Take a user input to search a Word in the List. If the Word is not found then add it to the list, and if it found then remove the word from the List. In the end save the list into a file

	 *@author : Nilam Godase
	 *@since: 6/3/2019
	 *@version:1.0
	 */


	/**@param: created class for unorderedlist
	 * 
	 */
package com.Bridgelabz.DataStructure;
	
	public class UnorderedList 
	{
        public void unorderList() 
		{
			IoFile io = new IoFile();
			String str[]=io.readFromFile("/home/admin1/Documents/Data.txt").split(" ");
			Utility u = new Utility();
			LinkedList list = new LinkedList();
			for(int i=0; i<str.length; i++) 
			{
				list.add(str[i]);
			}
			list.display();
			String st = u.getNext("\nEnter word");
			if(list.search(st)) 
			{
				list.remove(st);
			}
			else 
			{
				list.add(st);
			}
			list.display();
			io.writeToFile(list,"/home/admin1/Documents/Data.txt");
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			UnorderedList un = new UnorderedList();
			un.unorderList();
		}

	}



