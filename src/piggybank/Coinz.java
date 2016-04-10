package piggybank;

public class Coinz {
	
	
	public double getValue(int selection) {
		
		switch (selection) {
			case 1:   return 0.01;
			case 2:   return 0.05;
			case 3:   return 0.10;
			case 4:   return 0.25;
			case 5:   return 1.00;
			case 6:   return 2.00;
			default:  return 0.00;
		}
	}
}
