
public class RandomWalk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int trials = 0;
		int x = 100000;
		
		
		int mode = 0;
		for(int i = 0; i< x; i++) {
		
		int net_grow = 0;
		int steps = 0;
	
	
		while (net_grow >= -3.5 && net_grow <= 3.5) {
			int y =0;
			int fate = (int)(Math.random()*2);
			if (fate == 0) {
				net_grow -=1;
				steps++;
			} else {
				net_grow +=1;
				steps++;
			}
			
			
			
		}
	
		if (steps > mode) {
			mode = steps;
		}
		
		
		trials += steps;
		}
		
		System.out.println("Steps/Trial: " + trials / (double) x);
		System.out.println("Most Steps in a Walk: " + mode);

	}

}
