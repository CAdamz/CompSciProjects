package gameof21;

import java.util.Vector;

public class PlayerHand {

	private Vector<Cards> hand;

	public PlayerHand (){
		hand = new Vector<Cards>();
	}
	
	public Vector<Cards> getHand() {
		return hand;
	}

	public void setHand(Vector<Cards> hand) {
		this.hand = hand;
	}
	
	public void clear(){
		hand.removeAllElements();
	}
	
	public int getSize(){
		return hand.size();
	}
	
	public void addCard(Cards card) {
        // Add the Cards to the hand.
     if (card != null){
        hand.addElement(card);
     }
	}
	
	public int getValue(){
		int value = 0;
		if(hand.isEmpty()){
			value = 0;
		}else{
			for(int i = 0; i < hand.size(); i ++){
				value += (hand.elementAt(i)).getValue();
				
			}
		}
		return value;
		
	}
	
	public Cards getCards(int pos){
		if (pos >= 0 && pos < hand.size())
	         return (Cards)hand.elementAt(pos);
	      else
	         return null;
		
	}
	
}
