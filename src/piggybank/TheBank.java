package piggybank;

public class TheBank {

	Dialog text = new Dialog();
	Inputs UI = new Inputs();
	Coinz moneyHandles = new Coinz();
	boolean undecided = true;
	boolean runWithdrawl = true;
	boolean runDeposit = true;
	
	public static double balance = 0.0;
		
	public void run(){
		System.out.println("Welcome to the Treasure Goblin bank!");
		while(undecided){
			text.MenuMessage(balance);
			UI.MenuHandler();
			if (UI.Menu == 1){
				while(runDeposit){
					text.displayBalance(balance);
					text.DepositMenu();
					UI.DepositHandler(balance);
					if(UI.Response == 7){
						balance += UI.Deposit;
					}else{
						balance -= UI.DepositAction(UI.Response);	
					}
					if(UI.Response == 8){
						runDeposit = false;
					}
				}
			}else if(UI.Menu == 2){
				runWithdrawl = true;
				while(runWithdrawl){
					text.displayBalance(balance);
					text.WithdrawlMenu();
					UI.WithdrawlHandler(balance);
					balance -= moneyHandles.getValue(UI.Response);
					if(UI.Response == 7){
						balance -= UI.Withdrawl;
					}else{
						if(UI.WithdrawlAction(UI.Response) > balance){
							System.out.println("Need more gold. Go do a dungeon");
						}else{
							balance += UI.WithdrawlAction(UI.Response);	
						}
					}
					if(UI.Response == 8){
						runWithdrawl = false;
					}
				}
			}else if(UI.Menu == 3){
				System.out.println("Thanks for visting the Treasure Goblin bank");
				System.exit(0);
			}else if(UI.Menu <= 0 || UI.Menu >= 4){
				System.out.println("Thant wont work");
			}
		}
	}
	
	public static void main(String[] args) {
		
		TheBank bank = new TheBank();

		bank.run();
		

	}

}
