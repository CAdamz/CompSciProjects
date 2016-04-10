package page144;

public class Number6 {
	//PythagreanTriple
	
	public static void main(String[] args){
		
		
		for(int a = 1; a<= 100; a++){
			for(int b = 1; b<= 100; b++){
				for(int c = 1; c<200; c++){
					if(c*c == PFSQ(a)+PFSQ(b)){
						System.out.println("Pythagrean Triple found!");
						System.out.println(String.format("%s ^2 + %s ^2 = %s ^2", a,b,c));
					}
				}
			}
		}	
	}
	
	public static int PFSQ(int input){
		return(input*input);
	}
}
