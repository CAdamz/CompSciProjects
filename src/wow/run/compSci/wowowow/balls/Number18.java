package wow.run.compSci.wowowow.balls;

import java.util.Scanner;

public class Number18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your first name");
		String first = input.next();
		System.out.println("please enter your middle innitial");
		String middle = input.next();
		System.out.println("Please enter your last name");
		String last = input.next();
		//gets the first letter of the users first name
		first = first.substring(0, 1);
		//get the first letter of users middle name
		middle = middle.substring(0, 1);
		//gets the first letter of the users last name
		last = last.substring(0,1);
		
		// prints the users anagram and changes the cases of the letters to lowercase, capital, then lowercase
		System.out.println("Your anagram is " + first.toLowerCase() + last.toUpperCase() + middle.toLowerCase());
		
		
	}

}
