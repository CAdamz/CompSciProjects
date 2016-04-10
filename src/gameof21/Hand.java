package gameof21;

import java.util.Vector;

public class Hand {
	
	 private Vector<Cards> hand;   // The Cardss in the hand.
	   
	   public Hand() {
	           // Create a Hand object that is initially empty.
	      hand = new Vector<Cards>();
	   }
	   
	   public void clear() {
	         // DisCards all the Cardss from the hand.
	      hand.removeAllElements();
	   }
	   
	   public void addCards(Cards c) {
	         // Add the Cards c to the hand.  c should be non-null.  (If c is
	         // null, nothing is added to the hand.)
	      if (c != null)
	         hand.addElement(c);
	   }
	   
	   public void removeCards(Cards c) {
	         // If the specified Cards is in the hand, it is removed.
	      hand.removeElement(c);
	   }
	   
	   public void removeCards(int position) {
	         // If the specified position is a valid position in the hand,
	         // then the Cards in that position is removed.
	      if (position >= 0 && position < hand.size())
	         hand.removeElementAt(position);
	   }
	   
	   public int getCardsCount() {
	         // Return the number of Cards in the hand.
	      return hand.size();
	   }
	   
	   public Cards getCards(int position) {
	          // Get the Cards from the hand in given position, where positions
	          // are numbered starting from 0.  If the specified position is
	          // not the position number of a Cards in the hand, then null
	          // is returned.
	      if (position >= 0 && position < hand.size())
	         return (Cards)hand.elementAt(position);
	      else
	         return null;
	   }
	   
}
