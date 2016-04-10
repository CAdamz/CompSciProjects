package page144;

import java.util.Scanner;

public class Number2 {
		
	public static Scanner inputs  = new Scanner(System.in);
	public static double selection;
	public static double distance;
	public static void main(String[] args){
		
		System.out.println("This is unit converter");
		System.out.println("Your options are: ");
		System.out.println("1. Inches to Centimeters	5.Centimeters To Inches");
		System.out.println("2. Feet To Centimeters		6.Cetimeters To Feet");
		System.out.println("3. Yards To Meters		7. Meters To Yards");
		System.out.println("4. Miles to Kilometers		8. Kilometers To Miles");
		System.out.println("Please input the number of your desiried conversion");
		selection = inputs.nextInt();
		System.out.println("Input distance in desired inital unit");
		distance = inputs.nextInt();
		
		if(selection == 1){
			System.out.println("Converted distance"+InchToCent(distance)+" Centimeters");
		}else if(selection == 2){
			System.out.println("Converted distance "+FeetToCent(distance)+" Centimeters");
		}else if(selection == 3){
			System.out.println("Converted distance "+YardsToMeters(distance)+" Meters");
		}else if(selection == 4){
			System.out.println("Converted distance "+MilesTOKM(distance)+" Kilometers");
		}else if(selection == 5){
			System.out.println("Converted distance "+CentToInches(distance)+" Inches");
		}else if(selection == 6){
			System.out.println("Converted distance "+CentToFeet(distance)+" Feet");
		}else if(selection == 7){
			System.out.println("Converted distance "+MetersToYards(distance)+" Yards");
		}else if(selection == 8){
			System.out.println("Converted distance "+KMToMiles(distance)+" Miles");
		}
		
	}
	
	public static double InchToCent(double inches){
		double cent = inches*2.54;
		return cent;
		
	}
	
	public static double FeetToCent(double feet){
		double cent = feet * 30;
		return cent;
	}
	
	public static double YardsToMeters(double yards){
		double meters = yards * 0.91;
		return meters;
	}
	
	public static double MilesTOKM(double miles){
		double km = miles * 1.6;
		return km;
	}
	
	public static double CentToInches(double cent){
		double inches = cent / 2.54;
		return inches;
	}
	
	public static double CentToFeet(double cent){
		double feet = cent / 30;
		return feet;
	}
	
	public static double MetersToYards(double meters){
		double yards = meters / 0.91;
		return yards;
	}
	
	public static double KMToMiles(double km){
		double yards = km / 1.6;
		return yards;
	}
	
}