import java.util.Scanner;
public class EvenInts {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Gimme a num...");
		int number = scan.nextInt();
		int sum = 0;
		for(int x = 2; x<=number; x+=2) {
			if (number == 2) {
			throw new ArithmeticException("WHAT THE HELL DO YOU THINK YOU DOIN MAYNE!");
			}else {
			sum+=x;
			}
			
		}
		
		for (int x = 0; x < 50; x++) {
		
			for(int j = 0; j <= x%4; j++) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
				System.out.print("...");
				
				
			}
			System.out.println();
			
		}
		System.out.println("OUTPUT es el numero #" + sum);
	}
}
