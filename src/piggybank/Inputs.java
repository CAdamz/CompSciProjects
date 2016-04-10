package piggybank;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Inputs {

	int Response, Menu;

	double Withdrawl;

	double Deposit;
	
	boolean legalDeposit = true;
	boolean legalWithdrawl = true;
	
	Scanner input = new Scanner(System.in);
	
	Coinz money = new Coinz();
	
	public void MenuHandler(){
		
		do{
			try{
				Response = input.nextInt(); 
			}catch(InputMismatchException e){
				System.out.println("Mismatch exception caught"); 
				System.out.println("Input a valid value");

			}finally{
				input.nextLine();
			}	
		}while(Response < 1);
		
		if( Response <= 3 && Response >= 1){
			Menu = Response;
		}else{
			Menu = 0;
		}
	
	}	
	public void DepositHandler(double balance){
	
		do{
			try{
				Response = input.nextInt(); 
			}catch(InputMismatchException e){
				System.out.println("Input Mismatch exception caught");
				System.out.println("Please input a valid value");
			}finally{
				input.nextLine();
			}	
		}while(Response < 1);
		
		if( Response <= 6 && Response >= 1){
			Deposit = Response;
		}else if(Response == 7){

			System.out.println("How much would you like to deposit?");
				do{
					try{
						Deposit = input.nextDouble(); 
					}catch(InputMismatchException e){
						System.out.println("I'm unbreakable");
						System.out.println("Please input a valid value");
					}finally{
						input.nextLine();
					}	
				}while(Deposit < 0.01);
		}else{
			Deposit = 0;
		}
		
		
	}
	
	public void WithdrawlHandler(double balance){
		
		do{
			try{
				Response = input.nextInt(); 
			}catch(InputMismatchException e){
				System.out.println("I'm unbreakable");
				System.out.println("Please input a valid value");
			}finally{
				input.nextLine();
			}	
		}while(Response < 1);
		
		if( Response <= 6 && Response >= 1){
			Withdrawl = Response;
		}else if(Response == 7){

			System.out.println("How much would you like to withdrawl?");
				do{
					try{
						Withdrawl = input.nextDouble(); 
					}catch(InputMismatchException e){
						System.out.println("I'm unbreakable");
						System.out.println("Please input a valid value");
					}finally{
						input.nextLine();
					}	
				}while(Withdrawl < 0.01);
			if(Withdrawl > balance){
				System.out.println("You dont have that much");
				Withdrawl = 0;
			}
		}else{
			Withdrawl = 0;
		}
	}
	
	
	public double DepositAction(int deposit){
		return money.getValue(deposit);
	}
	
	public double WithdrawlAction(int withdrawl){
		
		return money.getValue(withdrawl);
				
		}

}
