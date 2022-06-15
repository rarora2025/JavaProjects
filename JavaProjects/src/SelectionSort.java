import java.util.ArrayList;
public class SelectionSort {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(12);
		arr.add(4);
		arr.add(3);
		arr.add(6);
		arr.add(5);
		sort(arr);
		
		
		
		
		
		

	}
	public static void sort(ArrayList<Integer> arr) {
		
		for(int i = 0; i < arr.size(); i++) {
			Integer min = arr.get(i);
			int minDex = i;
			for(int j = i+1; j < arr.size(); j++) {
				if(min.compareTo(arr.get(j)) > 0) {
					minDex = j;
					min = arr.get(j);
					
				}
				
			}
			Integer x = arr.set(i, arr.get(minDex));
			arr.set(minDex, x);
		}
		for(int x : arr) {
			System.out.println(x);
		}
		
		
	}

}
