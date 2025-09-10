package com.pattern.slidingWindow;

/* Minimum Size Subarray Sum
Given an array of positive integers nums and a positive integer target, return the minimal length of a subarray whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.

 Ex1:
Input: target = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: The subarray [4,3] has the minimal length under the problem constraint.
Example 2:

Input: target = 4, nums = [1,4,4]
Output: 1
Example 3:

Input: target = 11, nums = [1,1,1,1,1,1,1,1]
Output: 0
 */

public class SW3 {

	private static int MinimumSizeSubarraySumLessThanK(int k,int[] nums) {
		int left = 0, sum = 0, minLen = Integer.MAX_VALUE;

		for (int right = 0; right < nums.length; right++) {
			sum += nums[right];  
			while (sum >= k) {
				minLen = Math.min(minLen, right - left + 1);  
				sum -= nums[left];  
				left++;  
			}
		}
		return minLen == Integer.MAX_VALUE ? 0 : minLen;
	}

	public static void main(String[] args) {

		int[] nums = {2,3,1,2,4,3};
		int target = 7;
		int res = MinimumSizeSubarraySumLessThanK(target,nums);
		System.out.println(res); // 2
	}
}
