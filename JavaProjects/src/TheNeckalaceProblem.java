import java.util.Scanner;
public class TheNeckalaceProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the first number: ");
		int num_1 = scan.nextInt();
		System.out.print("Enter the second number: ");
		int num_2 = scan.nextInt();
		
		boolean sent = true;
		
		int counter = 0;
		int num1 =  num_1;

		int num2 =num_2;
		System.out.print(num_1 + " " + num_2 + " ");
		while (sent) {
		
			num_1 = sum(num_1,num_2);
			System.out.print(num_1 + " ");
			
			counter++;
			num_2 = sum(num_1,num_2);
			System.out.print(num_2 + " ");
			counter++;
			if(num1 == num_1) {
	
				if (num2 == num_2) {
					
					sent = false;
				}
				
			}
		}
		
		System.out.println("\t and it took " + counter + " steps");
	}
	
	
	public static int sum(int a, int b) {
		int sum = a+b;
		while (sum >= 10) {
			sum-=10;
		}
		return sum;
		
	}

}
