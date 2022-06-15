
public class PythagoreanTriples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Side 1\tSide2\tSide3");
		System.out.println("---------------------");
		for(int a = 1; a <=100; a++) {
			for(int b = 1; b <=100; b++) {
				for(int c = 1; c <=100; c++) {
					
					if(Math.pow(a,2) + Math.pow(b,2) == Math.pow(c,2)) {
						if (b>=a) {
							System.out.println(a + "\t" + b + "\t" + c);
							
						}
						
					}
					
					
					
				}
				
				
				
			}
			
		}

	}

}
