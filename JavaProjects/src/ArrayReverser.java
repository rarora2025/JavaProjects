
public class ArrayReverser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[] arr = new int[111];
	int index = 0;
	for(int i = 5; i<= 225; i+=2) {
		arr[index] = i;
		index++;
		
	}
	
	for(int x : arr) {
		System.out.println(x);
	}


	}

}
