/**
* @author Victor Bieniek
* CSC 201
* Professor Tanes Kanchanawanchai
* 
* This class displays five different random playing cards
*/
import java.util.Random;
import java.util.HashSet;

public class CardDeck
{

	public static void main(String[] args)
	{
		CardDeck deck = new CardDeck();
		HashSet drawnCards = new HashSet<String>();
		String card;

		System.out.println("\nDrawing 5 cards:\n");
		for(int i = 0; i < 5; i++)
		{
			card = deck.drawCard();
			//check if the card drawn has already been drawn from the deck
			if(drawnCards.add(card)){
				System.out.println(card);
			}
			else{
				i -= 1;
			}
		}
		System.out.println();
		
	}//end main

	private int randomIntInRange(int min, int max)
	{
		Random rand = new Random();
		return rand.nextInt(max - min + 1) + min;
	}

	public String drawCard()
	{
		int number = randomIntInRange(1,13);
		int suit = randomIntInRange(1,4);
		String card = " of ";

		//translate the number
		if(number == 11){
			card = "Jack" + card;
		}
		else if(number == 12){
			card = "Queen" + card;
		}
		else if(number == 13){
			card = "King" + card;
		}
		else if(number == 1){
			card = "Ace" + card;
		}
		else{
			card = number + card;
		}

		//translate the suit
		if(suit == 1){
			card += "Spades";
		}
		else if(suit == 2){
			card += "Hearts";
		}
		else if(suit == 3){
			card += "Clubs";
		}
		else if(suit == 4){
			card += "Diamonds";
		}
		return card;
	}
}//end class
