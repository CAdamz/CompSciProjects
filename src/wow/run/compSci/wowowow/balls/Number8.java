package wow.run.compSci.wowowow.balls;

import java.util.*;

public class Number8 {

	public static Scanner inputs = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random number = new Random();
		int guess = 0 ;
				
		boolean unsolved = true;
		
		System.out.println("Welcome to number Game");
		
		int correctAwnser = number.nextInt(21);

		System.out.println("Please guess a number between 1 and 20");
		guess = inputs.nextInt();

		
		while(unsolved){
		//this is only true if the guess isnt between 1 and 20
			while(guess > 20 || 0>= guess){
				System.out.println("Please guess again with a number in the appriate range");
				guess = inputs.nextInt();
			}
			//when the guess is wrong tell the user and prompt for another guess
			if( guess != correctAwnser){
				
				System.out.println("Guess Again");
				guess = inputs.nextInt();
				//tells the user the guess is right
			}else if (guess == correctAwnser){
				System.out.println("You Win!");
				//end the loop
				unsolved = false;
			}
		}
	}
}
