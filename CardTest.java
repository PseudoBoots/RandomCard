import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class CardTest {

	@Test
	public void test() {
		CardDeck deck = new CardDeck();
		
		for(int i = 0; i < 10000; i++)
		{
			Assert.assertTrue(deck.drawCard().matches("(([2-9]|10)|(Ace)|(Jack)|(Queen)|(King))\\sof\\s((Spades)|(Hearts)|(Clubs)|(Diamonds))"));
		}
	}

}
