package com.dk;

/* Search in Rotated Sorted Array
There is an integer array nums sorted in ascending order (with distinct values).
Prior to being passed to your function, nums is possibly left rotated at an unknown index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be left rotated by 3 indices and become [4,5,6,7,0,1,2].
Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.
You must write an algorithm with O(log n) runtime complexity.


Example 1:

Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4

Example 2:

Input: nums = [4,5,6,7,0,1,2], target = 3
Output: -1
 * */

public class program25 {
	
	private static int search(int[] nums,int target) {
		for(int i=0;i<nums.length;i++) {
			if(nums[i] == target) return i;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		int[] nums = {4,5,6,7,0,1,2};
		int target = 7;
		int res = search(nums,target);
		System.out.println(res); // 3
	}
}
