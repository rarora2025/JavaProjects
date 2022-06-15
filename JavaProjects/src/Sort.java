
public class Sort {
	int[] a;

	public Sort(int[] array) {
		a = array;
		
	}
	private static int[] removeElement(int[] arr, int index) {
		int dex = 0;
		int[] newArr = new int[arr.length-1];
		for(int i = 0; i < arr.length; i++) {
			if(i != index) {
				newArr[dex] = arr[i];
				dex++;
			}
		}
		return newArr;
		
	}
	private static int lowIndex(int[] arr) {
		int low = Integer.MAX_VALUE;
		int lowdex = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < low) {
				lowdex = i;
				low = arr[i];
			}
		}
		return lowdex;
	}
	public void ascent() {
	
		int[] newarr = new int[a.length];
		int index = 0;
		for(int x : a) {
			int dex = lowIndex(a);
			newarr[index] = a[dex];
			a = removeElement(a, dex);
			index++;
		}
	
		
		a = newarr;
	}
	
	public String toString() {
		String x = "";
		for(int j: a) {
			x += (j + " ");
			
		}
		return x;
	}


}
