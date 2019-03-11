
/******************************************************************************
	 *  Compilation:  javac -d bi  Tictactoe.java
	 *  Execution:    java -cp bin com.Bridgelabz.util  
	 *  Purpose: Cross Game or Tic-Tac-Toe Game 
	 *  @author  Nilam Godase
	 *  @version 1.0
	 *  @since   25-02-2019
 ******************************************************************************/


package com.Bridgelabz.FunctionalPrograms;

public class Tictactoe
{

public static void main(String[] args) 
{

	//Utility myGame =  new Utility();
	int choice = 0;
	do
	{
		Utility myGame =  new Utility();

		myGame.GameBoard();
		myGame.dispalyBoard();

		int counter = 1;
		while(myGame.gameActive() && counter < 10)
		{
			if(counter % 2 == 0)
				myGame.askPlayer('O');
			else
				myGame.askPlayer('X');
			counter++;

			System.out.println("\n");
			myGame.dispalyBoard();
			myGame.checkForWinner();

			if(counter == 10)
			{
				System.out.println("State mate! \n");
			}
		}
	System.out.println("press 1 for continue");
	choice = myGame.inputInteger();
	}while(choice == 1);
	//myGame.makeMove('O','0','0');
	//myGame.makeMove('X','1','1');



}
}
