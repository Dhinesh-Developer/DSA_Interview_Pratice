package com.dk;

/*
Peak Index in a Mountain Array

You are given an integer mountain array arr of length n where the values increase to a peak element and then decrease.
Return the index of the peak element.
Your task is to solve it in O(log(n)) time complexity.

Example 1:

Input: arr = [0,1,0]
Output: 1

Example 2:

Input: arr = [0,2,1,0]
Output: 1

Example 3:

Input: arr = [0,10,5,2]
Output: 1


 * */

public class program26 {
	
	private static int findPeak(int[] nums) {
		int n = nums.length;
		for(int i=1;i<n;i++) {
			if(nums[i] > nums[i-1] && nums[i] > nums[i+1]) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		int[] nums = {0,10,5,2};
		int res = findPeak(nums);
		System.out.println(res); // 1
	}
}
