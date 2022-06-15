import java.util.ArrayList;
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = {1,2,3,4,5};
		for(int i = 0; i < x.length/2; i++) {
			int temp = x[i];
			x[i] = x[x.length-1-i];
			x[x.length-1-i] = temp;
		}
		for(int y : x) {
			System.out.println(y);
		}
	}

}
