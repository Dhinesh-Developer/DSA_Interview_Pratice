package com.pattern.TwoPointers;

// container with most water.

public class TP4 {
	
	private static int maxArea(int[] nums) {
		int n = nums.length;
		int left = 0, right = n-1;
		int maxArea = 0;
		while(left < right) {
			int curArea = Math.min(nums[left],nums[right]) * (right-left);
			maxArea = Math.max(curArea, maxArea);
			if(nums[left] < nums[right]) left++;
			else right--;
		}
		return maxArea;
	}
	
	public static void main(String[] args) {
		
		int[] nums = {1,8,6,2,5,4,8,3,7};
		int res = maxArea(nums);
		System.out.println(res); // 49
	}
}
