package com.pattern.slidingWindow;

import java.util.HashSet;
import java.util.Set;

/* Maximum Sum of Distinct Subarrays With Length K
You are given an integer array nums and an integer k. Find the maximum subarray sum of all the subarrays of nums that meet the following conditions:

The length of the subarray is k, and
All the elements of the subarray are distinct.
Return the maximum subarray sum of all the subarrays that meet the conditions. If no subarray meets the conditions, return 0.

A subarray is a contiguous non-empty sequence of elements within an array.

Example 1:

Input: nums = [1,5,4,2,9,9,9], k = 3
Output: 15
Explanation: The subarrays of nums with length 3 are:
- [1,5,4] which meets the requirements and has a sum of 10.
- [5,4,2] which meets the requirements and has a sum of 11.
- [4,2,9] which meets the requirements and has a sum of 15.
- [2,9,9] which does not meet the requirements because the element 9 is repeated.
- [9,9,9] which does not meet the requirements because the element 9 is repeated.
We return 15 because it is the maximum subarray sum of all the subarrays that meet the conditions
Example 2:

Input: nums = [4,4,4], k = 3
Output: 0
Explanation: The subarrays of nums with length 3 are:
- [4,4,4] which does not meet the requirements because the element 4 is repeated.
We return 0 because no subarrays meet the conditions.
 

Constraints:

1 <= k <= nums.length <= 105
1 <= nums[i] <= 105
 * */

public class SW2 {
	
	private static int MaximumSum(int[] nums,int k) {
		int n = nums.length;
		Set<Integer> set = new HashSet<>();
		int curSum = 0,maxSum = 0;
		int left = 0;
		for(int right=0;right<n;right++) {
			if(set.contains(nums[right]) || set.size()==k) {
				set.remove(nums[left]);
				curSum -= nums[left];
				left++;
			}
			curSum += nums[right];
			set.add(nums[right]);
			if(set.size() == k) {
				maxSum = Math.max(maxSum, curSum);
			}
		}
		return maxSum;
	}
	
	public static void main(String[] args) {
		
		int[]nums = {1,5,4,2,9,9,9};
		int k = 3;
		int res = MaximumSum(nums,k);
		System.out.println(res); // 15.
	}
}



























