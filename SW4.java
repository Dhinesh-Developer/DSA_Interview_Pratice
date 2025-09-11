package com.pattern.slidingWindow;

/* Count Number of Nice Subarrays
Given an array of integers nums and an integer k. 
A continuous subarray is called nice if there are k odd numbers on it.
Return the number of nice sub-arrays.

Example 1:

Input: nums = [1,1,2,1,1], k = 3
Output: 2
Explanation: The only sub-arrays with 3 odd numbers are [1,1,2,1] and [1,2,1,1].
Example 2:

Input: nums = [2,4,6], k = 1
Output: 0
Explanation: There are no odd numbers in the array.

 * */

public class SW4 {
	
	public static int cnt(int[] nums,int k) {
		return countSubarray(nums,k) - countSubarray(nums,k-1);
	}
	
	private static int countSubarray(int[] nums,int k) {
		int left = 0,res = 0;
		for(int right=0;right<nums.length;right++) {
			if(nums[right] % 2 == 1) k--;
			while(k < 0) {
				if(nums[left] % 2== 1) k++;
				left++;
			}
			res += right-left+1;
		}
		return res;
	}
	
	public static void main(String[] args) {
		
		int[] nums = {1,1,2,1,1};
		int k = 3;
		int res = cnt(nums,k);
		System.out.println(res); // 2.
	}
}
