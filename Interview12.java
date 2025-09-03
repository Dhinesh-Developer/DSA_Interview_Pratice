package com.Interview;

/* Single Number I
You are given a sorted array consisting of only integers where every element appears exactly twice,
 except for one element which appears exactly once.

Return the single element that appears only once.

Your solution must run in O(log n) time and O(1) space. 
 * */
public class Interview12 {
	
	private static int findSingleElement(int[] nums) {
		int res = 0;
		for(int i=0;i<nums.length;i++) {
			res ^= nums[i];
		}
		return res;
	}
	public static void main(String[] args) {
		
		int[] nums = {1,1,2,3,3,4,4,8,8};
		int res = findSingleElement(nums);
		System.out.println(res); // 2
	}
}
