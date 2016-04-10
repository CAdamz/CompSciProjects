package page144;

import java.util.Scanner;
import java.util.Random;

public class Number8 {
	//Hi-Lo Game
	
	//number 1-6 are low
	//number 8-13 are high
	//7 makes u lose
	
	static int guessCount = 0;
	int guess;
	int numberHL;
	int riskedPoints;
	int numberStatus;
	int totalPoints = 1000;
	
	
	 Scanner input = new Scanner(System.in);
	 Random rng = new Random();
	 
	 public boolean validRisk(int risk){
		 
		 return (risk > totalPoints)? false : true;
	 }
	 
	 public boolean legalPrediction(int prediction){
		 
		 return (prediction > 1 || 0 > prediction)? false : true;
	 }	 
	 
	 public boolean uWinning(int num, int guess){
		 return (guess == num)? true:false;
	 }
	 
	public void highLow(){
		
		while(totalPoints > 0){
		
			System.out.println("you have "+totalPoints+" points");
			System.out.println("How mant points would you like to risk");
			riskedPoints = input.nextInt();
			while(!validRisk(riskedPoints)){
				System.out.println("You do not have enough points to do that. please enter a new value");
				riskedPoints = input.nextInt();
			}
			System.out.println("Predict (1 = High, 0 = Low)");
			guess = input.nextInt();
			while(!legalPrediction(guess)){
				System.out.println("Invalid Guess");
				System.out.println("1 = High"+"\n"+"0 = Low");
				guess = input.nextInt();
			}
			guessCount += 1;
			numberHL = (rng.nextInt(13) + 1);
			System.out.println("Number is " + numberHL);
			if(numberHL > 7 && 14 > numberHL){
				numberStatus = 1;
			}else if(7 > numberHL && numberHL > 0){
				numberStatus = 0;
			}else{
				numberStatus = 2;
			}
			
			if(uWinning(numberStatus, guess)){
				System.out.println("You Win");
				totalPoints += riskedPoints;
			}else{
				System.out.println("you Lose");
				totalPoints -= riskedPoints;
				
			}
			
			
		}
	}
	public static void main(String[] args){
		
		Number8 highLow = new Number8();
		
		System.out.println("High Low Game");
		System.out.println("Numbers 1 to 6 are low");
		System.out.println("7 is bad news");
		System.out.println("Numbers 8 to 13 are high");
		
		//starts the game
		highLow.highLow();
		System.out.print("you took " + guessCount + " guesses"+"\n");
		System.out.println("Game over");
	}
	
}
