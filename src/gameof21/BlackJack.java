package gameof21;

import java.util.Scanner;

public class BlackJack {

	public boolean canPlay = true;
	String wantHit;
	
	Deck deck = new Deck();
	PlayerHand userHand = new PlayerHand();
	PlayerHand dealerHand = new PlayerHand();
	
	public Scanner input = new Scanner(System.in);
	
	public void hitPlayer(){
		userHand.addCard(deck.dealCard());
	}
	
	public boolean hitInput(){
		return (wantHit.equalsIgnoreCase("y") || wantHit.equalsIgnoreCase("yes"))? true: false;
	}
		
	public boolean skipInput(){
		return (wantHit.equalsIgnoreCase("n") || wantHit.equalsIgnoreCase("no"))? true: false;
	}
	
	public void hitDealer(){
		dealerHand.addCard(deck.dealCard());
	}
	
	public boolean checkDealer(){
		return (dealerHand.getValue() >= 17)? false : true;
	}
	
	public void printUserHand(){
		System.out.println("Your hand:");
		for(int c = 0; c < userHand.getSize(); c++){
			System.out.println(userHand.getCards(c));
		}
	}
	
	public void printDealerHand(){
		System.out.println("Dealer's hand:");
		for(int d = 0; d < dealerHand.getSize(); d++){
			System.out.println(dealerHand.getCards(d));
		}
	}
	
	public boolean bust(){
		return (userHand.getValue() > 21 || dealerHand.getValue() > 21)? true: false;
	}
	
	public boolean userBust(){
		return (userHand.getValue() > 21)? true : false;
	}
	
	public boolean dealerBust(){
		return (dealerHand.getValue() > 21)? true : false;
	}
	
	
	
	public void initializeGame(){
		deck.shuffle();
		hitPlayer();
		hitDealer();
		hitPlayer();
		hitDealer();
	}
		
	public void getInput(){
		System.out.println("Hit? (Y for yes, N for No");
		wantHit = input.next();
	while((wantHit.equalsIgnoreCase("y") || wantHit.equalsIgnoreCase("n")) == false){
			System.out.println("Invalid input");
			System.out.println("Hit? (Y for yes, N for No");
			wantHit = input.next();
		}
	}
	
	public void play(){
					
		boolean userPlaying = true;
		
		while(canPlay){
			
			if(userHand.getValue() == 21){
				System.out.println("You Win");
				break;
			}else if(dealerHand.getValue() == 21){
				System.out.println("Dealer Wins");
				break;
			}
			
			if(userBust()){
				System.out.println("Your Bust! Dealer Wins");
				break;
			}else if(dealerBust()){
				System.out.println("Dealer Bust! You win!");
				break;
			}
			
			getInput();
			
			while(true){
				
				if(hitInput() && userPlaying){
					hitPlayer();
					printUserHand();
					if(bust()){ 
						System.out.println("Your Bust! Dealer Wins");
						break;	
					}
					
					return;
				}else if(skipInput()){
					userPlaying = false;
				}
				if(checkDealer()){
					hitDealer();
					if(bust()){
						System.out.println("Dealer Busts! You win!");
						break;
					}
				}
				break;
			}
			
				if(dealerHand.getValue() == userHand.getValue()){
					System.out.println("You and dealer tie");
					canPlay = false;				
				}else if((dealerHand.getValue() > userHand.getValue())){
					printDealerHand();
					printUserHand();
					System.out.println("You Lose");
					canPlay = false;
				}else{
					printDealerHand();
					printUserHand();
					System.out.println("You Win");
					canPlay = false;
				}
			}
		}
	

	
	public static void main(String[] args) {
		
		BlackJack game = new BlackJack();
		
		game.initializeGame();
		game.printUserHand();
		game.play();

	}

}
