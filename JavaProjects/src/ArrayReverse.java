
public class ArrayReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,14,20,23,14,2};
		System.out.println(mode(arr));
		
	
		
		
		
		

	}
	
	public static int mode(int[] array) {
		int mode = array[0];
		
		int max_count = 0;
		
		for(int x = 0; x<array.length; x++) {
			int cur_mode = array[x];
			int cur_count = 0;
			for(int i = 0; i<array.length; i++) {
				if(array[i] == cur_mode) {
					cur_count++;
				}
			}
			
			if(cur_count > max_count) {
				mode = cur_mode;
				max_count = cur_count;
			}
			
		}
		
		
		return mode;
		
	
	}
	


}
