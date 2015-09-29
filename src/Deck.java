import java.util.ArrayList;

/*
* @author Matthew Chivallati
*/

public class Deck
{

	private ArrayList<Card> deck = new ArrayList<Card>();

	public Deck()
	{

		addClubs();
		addDiamonds();
		addHearts();
		addSpades();

	}

	public void addSpades()
	{

		int val = 1;

		for ( int i = 0 ; i < 13 ; i++ ) {

			Card s = new Card( "Spades" , checkRank(i) , val );
			this.deck.add(s);
			val++;

		}

	}

	public void addClubs()
	{

		int val = 1;

		for ( int i = 0 ; i < 13 ; i++ ) {

			Card c = new Card( "Clubs" , checkRank(i) , val );
			this.deck.add(c);
			val++;

		}

	}

	public void addHearts()
	{

		int val = 1;

		for ( int i = 0 ; i < 13 ; i++ ) {

			Card h = new Card( "Hearts" , checkRank(i) , val );
			this.deck.add(h);
			val++;

		}

	}

	public void addDiamonds()
	{

		int val = 1;

		for ( int i = 0 ; i < 13 ; i++ ) {

			Card d = new Card( "Diamonds" , checkRank(i) , val );
			this.deck.add(d);
			val++;

		}

	}
	
	/* !--only to be used with the add*SuitName* methods--!
	   @param i		where int i < 13
	   @return		string for the card rank */
	public String checkRank(int i)  // i < 13
	{

		if (i == 0) {

			return "Ace";

		} else if (i == 1) {

			return "Two";

		} else if (i == 2) {

			return "Three";

		} else if (i == 3) {

			return "Four";

		} else if (i == 4) {

			return "Five";

		} else if (i == 5) {

			return "Six";

		} else if (i == 6) {

			return "Seven";

		} else if (i == 7) {

			return "Eight";

		} else if (i == 8) {

			return "Nine";

		} else if (i == 9) {

			return "Ten";

		} else if (i == 10) {

			return "Jack";

		} else if ( i == 11) {

			return "Queen";

		} else if (i == 12) {

			return "King";

		} else {

			return null;

		}

	}

	public void printDeck()
	{

		for ( Card aDeck : deck ) {

			System.out.println( aDeck.toString() );

		}

	}

	/* @param i		where i is in the range 0-52 inclusive
	   @param k		where k is in the range 0-52 inclusive
	   @see #shuffleDeck(int) */
	public void swap(int i , int k)
	{

		Card temp = new Card( deck.get(i).getSuit() , deck.get(i).getRank() , deck.get(i).getVal() );

		deck.get(i).setSuit( deck.get(k).getSuit() );
		deck.get(i).setRank( deck.get( k ).getRank() );
		deck.get(i).setVal( deck.get( k ).getVal() );

		deck.get(k).setSuit( temp.getSuit() );
		deck.get(k).setRank( temp.getRank() );
		deck.get(k).setVal( temp.getVal() );

	}

	// @param numShuffles	number of induvidual swaps
	public void shuffleDeck( int numShuffles )
	{

		for (int j = 0 ; j < numShuffles ; j++) {

			int randomInt1 = randomInt( 0, 51 );
			int randomInt2 = randomInt( 0, 51 );
			swap( randomInt1 , randomInt2 );

		}

	}
	
	/* @param min		the minuim value bound
	*  @param max		the maximum value bound
	*  @return 		random value from min - max */
	public static int randomInt( int min, int max )
	{

		int range = ( max + 1 ) - min;

		return (int) ( ( Math.random( ) * range ) + min );

	}

}
