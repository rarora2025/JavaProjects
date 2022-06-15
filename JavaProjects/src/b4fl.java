

public class b4fl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[][] x = {{false, true, false, true}, {false, true, false, true}};
		System.out.println(setTrue(x));
		
		

	}
	public static double setTrue(boolean[][] matrix) {
		double trues = 0;
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[0].length; j++) {
				if(matrix[i][j]) {
					trues++;
				}
				
			}
			
		}
		
		return trues/(matrix[0].length*matrix.length);
		
	}

}
