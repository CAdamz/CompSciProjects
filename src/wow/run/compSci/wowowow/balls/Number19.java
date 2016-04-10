package wow.run.compSci.wowowow.balls;

import java.util.Scanner;

public class Number19 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a sentence");
		//Gets the sentence 
		String sentence = input.nextLine();
		System.out.println("what word u wanna remove fam");
		//gets the word to remove from the sentence
		String word = input.nextLine();
		//removes the word and a space after it so the grammar isnt terrible
		String newSentence = sentence.replace(word+" ", "");
		//prints the new and improved sentece
		System.out.println("your better sentece is: " + "\n" + newSentence);
		
	}

}
