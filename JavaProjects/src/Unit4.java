import java.util.Scanner;
public class Unit4 {

	 public static void main(String[] args) {
		 for (int j = 1; j <= 5; j++) {
		        for (int k = 1; k <= j; k++) {
		           System.out.print(j);
		        }
		        System.out.println();
		     }
			
		}
			
			
		    
		 

		public static void GuessNumber(int x) {
			int tries = 1;
			Scanner scan = new Scanner(System.in);
			System.out.print("Make YOUR guess: ");
			int y = scan.nextInt();
			while(y != x) {
				tries +=1;
				if (y > x) {
					System.out.println("Too high!");
				} else {
					System.out.println("Too low!");
					
				}
				System.out.print("Make YOUR guess: ");
				y = scan.nextInt();
			}
			System.out.printf("Kudos! It took you %d tries", tries);
			
		}
		
		
		



}
