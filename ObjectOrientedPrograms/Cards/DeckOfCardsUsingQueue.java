/******************************************************************************
 *  Compilation:  javac -d bi DeckOfCardsUsingQueue.java
 *  Execution:    java -cp bin Cards
 *  
 *  Purpose:Deck Of cards using queue
 *
 *  @author  Nilam Godase
 *  @version 1.0
 *  @since   15-03-2019
 *
 ******************************************************************************/

package Cards;
public class DeckOfCardsUsingQueue
{
	public static void main(String[] args) 
	{
		DeckOfCardsUtil deckOfCardUtil=new DeckOfCardsUtil();
		int noOfPlayer = 4;
		int noOfCards = 9;
		String[] init = deckOfCardUtil.getCards();
		String[] shuffleCards = deckOfCardUtil.shuffleCards(init);
		String[][] distributedShuffle =deckOfCardUtil.distributedCards(shuffleCards, noOfPlayer, noOfCards);
		System.out.println("----------------------------AFTER SORTING-------------------------------");		
		deckOfCardUtil.deckOfCardsQueue(distributedShuffle, noOfPlayer, noOfCards);
    }
}
	 

		
	
	
		
	
