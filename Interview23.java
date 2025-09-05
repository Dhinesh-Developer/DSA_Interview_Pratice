package com.Interview;

/* Two sum
Given an array arr[] of integers and another integer target.
 Determine if there exist two distinct indices
 such that the sum of their elements is equal to the target.
 * */
public class Interview23 {
	
	private static boolean twoSum(int[] nums,int target) {
		
		boolean flag = false;
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]+nums[j] == target) {
					flag = true;
				}
			}
		}
		return flag;
	}
	
	public static void main(String[] args) {
		
		int[] nums = {0, -1, 2, -3, 1};
		int target = -2;
		
		boolean res = twoSum(nums,target);
		System.out.println(res); // true
	}
}
