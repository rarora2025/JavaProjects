import java.util.Scanner;
public class ThisOldMan {
	
	public static void jingleToNum(int x) {
	
		System.out.printf("The ants go marching %d by %d, hurrah, hurrah\n" + 
				"The ants go marching %d by %d, hurrah, hurrah\n" + 
				"The ants go marching %d by %d\n" + 
				"The little one stops to suck his thumb\n" + 
				"And they all go marching down to the ground\n" + 
				"\n", x, x, x,x ,x ,x );
		
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("How much versus? ");
		int num = scan.nextInt();
		
		
		for(int x = 1; x<= num; x++) {
			jingleToNum(x);
		}

	}

}
