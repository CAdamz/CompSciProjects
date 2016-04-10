package wow.run.compSci.wowowow.balls;

import java.util.Scanner;

	//Digit Sum

public class Number6 {

	public static Scanner inputs  = new Scanner(System.in);//.useDelimiter("\n");
	
	public static void main(String[] args) {
	
		
		System.out.println("Please input a positvie integer");
		
		int storedNum = inputs.nextInt();

		int total = 0;
		//uses a devision function that adds the digits by making the number a smaller devisor of 10, then added the number that was removed from the larger number
		while (storedNum > 0){
			//adds the first digit
			total += (storedNum%10);
			//removes the digit that was just adedd
			storedNum = storedNum/10;
		}
		
		System.out.print("The sum of the digits is "+total);
	}

}
