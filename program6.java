package com.dk;

// Kadane's algorithm --or-- maximum sub array
/*Given an integer array nums, find the sub array with the largest sum, and return its sum*/

public class program6 {
	
	private static int maxSubArraySum(int[] nums) {
		int maxi = Integer.MIN_VALUE;
		int sum =0;
		for(int i=0;i<nums.length;i++) {
			sum += nums[i];
			if(sum > maxi) {
				maxi = sum;
			}
			if(sum < 0) {
				sum = 0;
			}
		}
		return maxi;
	}
	
	public static void main(String[] args) {
		
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4}; //6
		int[] arr = {5,4,-1,7,8}; // 23 -> test case 2
		int res = maxSubArraySum(arr); 
		System.out.println("Maximum subarray: "+res);
	}
}
