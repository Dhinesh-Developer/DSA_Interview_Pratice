package Array_Easy;

/* Single number.
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.*/
public class program4 {
	
	private static int findSingleNumber(int[] nums) {
		int sum = 0;
		for(int i=0;i<nums.length;i++) {
			sum ^= nums[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		
		int[] nums = {1,1,2,3,3,4,4};
		int res = findSingleNumber(nums);
		System.out.println(res); //2
	}
}
