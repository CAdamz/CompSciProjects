package wow.run.compSci.wowowow.balls;

import java.util.Scanner;

public class Number17 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//Top password
		String password = "kek";
		int guessNum = 0;
		
		String guess = "";
		//i use this to control the loops behavior
		boolean passIncorrect = true;
		//only runs when the password is incorrect
		while(passIncorrect){
			//user prompts
			System.out.println("Please enter the password");
			
			guess = input.next();
			//if the password is correct the loop exits
			if(guess.equals(password)){
				System.out.println("Acess Granted");
				passIncorrect = false;
			}else{
				//when the password is incorrect its adds 1 to the attempt counter
				System.out.println("Nize");
				guessNum += 1;
				//when the user is at 3 guesses the program exits
				if(guessNum == 3) {
					passIncorrect = false;
					System.out.println("Acess Denied");
				}
			}
			
			
	}
		//the open resource warning really got to me
		input.close();
		
		//the end
		System.out.println("Program Terminating");
		
}
}