
public class Pset4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0,0,1,1,2,2,3,3};
		for(int i = 3; i<nums.length-1; i++) {
			nums[i+1] = i;
		}
		
		for(int x : nums) {
			System.out.println(x);
		}

	}

}
