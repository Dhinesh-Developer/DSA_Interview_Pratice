package com.pattern.TwoPointers;

// Trapping rain water

public class TP10 {
	
	private static int trap(int[] nums) {
		int n = nums.length;
		int l=0,r=n-1;
		int leftMax=0,rightMax=0;
		int res = 0;
		while(l <= r) {
			if(nums[l] <= nums[r]) {
				if(nums[l] >= leftMax) {
					leftMax = nums[l];
				}else {
					res += leftMax- nums[l];
				}
				l++;
			}else {
				if(nums[r] >= rightMax) {
					rightMax = nums[r];
				}else {
					res += rightMax - nums[r];
				}
				r--;
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		
		int[] nums = {0,1,0,2,1,0,1,3,2,1,2,1};
		int res = trap(nums);
		System.out.println(res); // 6
	}
}
