package page144;

import java.util.Scanner;
import java.util.Random;


public class Number9 {
	// game of nim
	
	public boolean runInit = true;
	int userMove;
	int cpuMove;
	public static Random stones = new Random();
	
	 public Scanner input = new Scanner(System.in);
	
	 public int stonesLeft;
	 
	public void run(){
		
		while (runInit){
			stones();
			if(stonesLeft >= 15 && 30 >= stonesLeft){
				this.runInit = false;
			}
		}
		System.out.println("Game Initilaization Finsihed");
		
		
		while(stonesLeft > 0){
			
		
			
			System.out.println("There are "+stonesLeft+" stones in play");
			System.out.println("How amny would you like to remove 1-3");
			userMove = input.nextInt();
			
			while(entryCheck(userMove)){
				System.out.println("Invalid input");
				userMove = input.nextInt();
				
			}
			stonesLeft -= userMove;
			if(stonesLeft <= 0){
				System.out.println("CPU Wins");
				return;
			}
			cpuMove = drawStones();
				
				System.out.println("Computer will take " + cpuMove + " stones");
				stonesLeft -= cpuMove;
				
				if(stonesLeft <= 0){
					System.out.println("Winner");
					return;
				}			
			}			 
		}
			
	public void stones(){
		int rand = stones.nextInt(31);
		
		if(rand < 15){
			rand = stones.nextInt(31);
		}
		
		this.stonesLeft = rand;

	}
		 
	public int drawStones()
	    {
	        return (int)(stones.nextInt(3))+1;
	    }
	public boolean entryCheck(int input){
		/*Ternarys are fun and if statements are boring
		 * this checks to see if the users input is below 3 and less than
		 * the total number of stones
		*/
		return (input > stonesLeft || input > 3) ? true : false;
	}
	
	
	public static void main(String[] args){
		
		//running like this allows me to have non static variables
		
		Number9 nimGame = new Number9();
		nimGame.run();
		
		
	}
	
	

}

	

