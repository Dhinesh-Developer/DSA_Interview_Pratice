package com.dk;

/* Trapping rain water
Given n non-negative integers representing an elevation map 
where the width of each bar is 1, 
compute how much water it can trap after raining.
 * */

public class program21 {
	
	private static int trappingRainWater(int[] nums) {
		int n = nums.length;
		if(nums == null || nums.length == 0) return 0;
		int[] leftMax = new int[n];
		int[] rightMax = new int[n];
		
		leftMax[0] = nums[0];
		rightMax[n-1] = nums[n-1];
		for(int i=1;i<n;i++) {
			leftMax[i] = Math.max(leftMax[i-1],nums[i]);
		}
		
		for(int i=n-2;i>=0;i--) {
			rightMax[i] = Math.max(rightMax[i+1], nums[i]);
		}
		
		int waterTrapped = 0;
		for(int i=0;i<n;i++) {
			waterTrapped += Math.min(leftMax[i],rightMax[i])-nums[i];
		}
		
		return waterTrapped;
	}
	
	public static void main(String[] args) {
		
		int[] nums = {0,1,0,2,1,0,1,3,2,1,2,1}; 
		int res = trappingRainWater(nums);
		System.out.println(res); // 6.
		
	}
}
