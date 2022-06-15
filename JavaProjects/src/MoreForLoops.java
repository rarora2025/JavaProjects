import java.util.Scanner;
public class MoreForLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int str = input.nextInt();
		
	int sum = 0;
	
		for(int x = str; x>0; x/=10) {
			sum += x%10;
		
			
			
		}
		
		
		System.out.println(sum);
		
		

	}

}
