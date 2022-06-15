
public class CalculatingPi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double pi = 4.0;
		int operator1 = -1;
		for (int x = 3; x < 10001.00; x+=2) {
			double expression = operator1 * (4.0/x);
			pi += expression;
			operator1 *=-1;
			
			
			
		}
		System.out.println(pi);
		
		
		
	}

}
