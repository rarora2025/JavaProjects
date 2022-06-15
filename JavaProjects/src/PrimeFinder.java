import java.util.Scanner;
public class PrimeFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int number = scan.nextInt();
		boolean prime = true;
		for(int x = 2; x<number; x++) {
			if (number%x ==0) {
				prime = false;
		
				
			}
			
			
		}
		System.out.println(prime);

	}

}
