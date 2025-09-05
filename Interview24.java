package com.Interview;

// kadane algorithm  -> maximum subarray sum

public class Interview24 {
	
	private static int maxSubarray(int[] nums) {
		int max = 0;
		int sum = 0;
		for(int i=0;i<nums.length;i++) {
			sum += nums[i];
			if(sum > max) max = sum;
			if(sum < 0) sum = 0;
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		
		int[] nums = {2, 3, -8, 7, -1, 2, 3};
		int res = maxSubarray(nums);
		System.out.println(res); // 11
	}
}
