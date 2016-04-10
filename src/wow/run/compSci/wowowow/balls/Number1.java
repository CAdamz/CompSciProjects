package wow.run.compSci.wowowow.balls;

import java.util.Scanner;

public class Number1 {

	//Prime Numbers
	
	
	public static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {            
                       
            System.out.println("Input first number");
            //Lower bound of the prime range
            int firstNum = input.nextInt();
            
            System.out.println("input second number");
            //Upper bound of the prime range
            int secondNum = input.nextInt();
            
            System.out.print("Prime Number list");
            /*
             * cycles through all all the nunbers within the bounds set
             */
            for(int i=firstNum; i < secondNum; i++){
                   
                    boolean isPrime = true;
                   /*
                    * devides the possible prime by all numbers less then the possible prime.
                    * if any devision cases come back evenly, is is marked as prime and a new number can be tested
                    */
                    for(int j=2; j < i ; j++){
                           //this is the devision part
                            if(i % j == 0){
                                    isPrime = false;
                                    break;
                            }
                    }
                    // print any numbers that return prime
                    if(isPrime)
                            System.out.print("\n" + i);
            }
    }

	}


