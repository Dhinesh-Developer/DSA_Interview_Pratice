package com.dk;

/* Peak Index in a Mountain Array
You are given an integer mountain array arr of length n
 where the values increase to a peak element and then decrease.

Return the index of the peak element.

 * */

public class program27 {
	
	private static int findPeak(int[] nums) {
		int n = nums.length;
		for(int i=1;i<n;i++) {
			if(nums[i]> nums[i-1] && nums[i] > nums[i+1]) {
				return i;
			}
		}
		return 0;
	}
	
	public static void main(String[] args) {
		
		int[] nums = {0,10,5,2};
		int res = findPeak(nums);
		System.out.println(res);
	}
}
