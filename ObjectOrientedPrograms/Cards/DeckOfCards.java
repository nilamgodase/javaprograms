/******************************************************************************
 *  Compilation:  javac -d bi DeckOfCards.java
 *  Execution:    java -cp bin Cards
 *  
 *  Purpose:Write a Program DeckOfCards.java, to initialize deck of cards having suit ("Clubs", "Diamonds", "Hearts", "Spades") & Rank ("2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"). Shuffle the cards using Random method and then distribute 9 Cards to 4 Players and Print the Cards the received by the 4 Players using 2D Array…
 *
 *  @author  Nilam Godase
 *  @version 1.0
 *  @since   15-03-2019
 *
 ******************************************************************************/

package Cards;
public class DeckOfCards
{
	public static void main(String[] args)
	{
		DeckOfCardsUtil util=new DeckOfCardsUtil();
		int noOfPlayer = 4;
		int noOfCards = 9;
		String[] cards = util.getCards();
		String[] shuffleCards = util.shuffleCards(cards);
		util.distributedCards(shuffleCards, noOfPlayer, noOfCards);
	}
}