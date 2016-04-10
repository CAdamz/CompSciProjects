	package piggybank;
	
	import java.text.DecimalFormat;
	
	public class Dialog {
	
		DecimalFormat moneyHandler = new DecimalFormat("0.00");
		
		public void MenuMessage(double balance){
			System.out.println(String.format("Current Balance is:", moneyHandler.format(balance)));
			System.out.println("Press 1 to make a deposit");
			System.out.println("Press 2 to make a withdrawl");
			System.out.println("Press 3 to exit");
		}
		
		public void displayBalance(double balance){
			System.out.println(String.format("Current balance is:", moneyHandler.format(balance)));
		}
		
		public void DepositMenu(){
			System.out.println("If you wish to deposit a coin press the associated number");
			System.out.println("1: Penny");
			System.out.println("2: Nickle");
			System.out.println("3: Dime");
			System.out.println("4: Quarter");
			System.out.println("5: Loonie");
			System.out.println("6: Toonie");
			System.out.println("7: Custom amount");
			System.out.println("8: Main menu");
			
		}
		
		public void WithdrawlMenu(){
			System.out.println("If you wish to withdraw a coin press the associated number");
			System.out.println("1: Penny");
			System.out.println("2: Nickle");
			System.out.println("3: Dime");
			System.out.println("4: Quarter");
			System.out.println("5: Loonie");
			System.out.println("6: Toonie");
			System.out.println("7: Custom amount");
			System.out.println("8: Main menu");
		}
		
	}
