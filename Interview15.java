package com.Interview;

/* Missing in array
You are given an array arr[] of size n - 1 that contains distinct integers 
in the range from 1 to n (inclusive). This array represents a permutation of the integers from 1 to n with one element missing. 
Your task is to identify and return the missing element.
 * */
public class Interview15 {
	
	private static int findMissingElement(int[] nums) {
		int n = nums.length+1;
		int sum = n*(n+1)/2;
		int cnt = 0;
		
		for(int i=0;i<nums.length;i++) {
			cnt += nums[i];
		}
		
		return sum-cnt;
	}
	
	public static void main(String[] args) {
		
		int[] nums = {1,2,3,5};
		int res = findMissingElement(nums);
		System.out.println(res); // 4
		
	}
}
