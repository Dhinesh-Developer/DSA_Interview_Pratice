package com.dk;

import java.util.Arrays;

/*
 *  SLiding window maximum.
You are given an array of integers nums, 
there is a sliding window of size k which is moving
 from the very left of the array to the very right. 
 You can only see the k numbers in the window. 
 Each time the sliding window moves right by one position.
Return the max sliding window.

 

Example 1:

Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
Output: [3,3,5,5,6,7]
Explanation: 
Window position                Max
---------------               -----
[1  3  -1] -3  5  3  6  7       3
 1 [3  -1  -3] 5  3  6  7       3
 1  3 [-1  -3  5] 3  6  7       5
 1  3  -1 [-3  5  3] 6  7       5
 1  3  -1  -3 [5  3  6] 7       6
 1  3  -1  -3  5 [3  6  7]      7..
 * */

public class program22 {
	
	private static int[] maxSlidingWindow(int[] nums,int k) {
		if(nums == null || k<0) return new int[0];
		int n = nums.length;
		int[] res = new int[n-k+1];
		for(int i=0;i<=n-k;i++) {
			int max = nums[i];
			for(int j=i;j<i+k;j++) {
				if(nums[j] > max) {
					max = nums[j];
				}
			}
			res[i] = max;
		}
		
		return res;
	}
	
	public static void main(String[] args) {

		int[] nums = {1,3,-1,-3,5,3,6,7};
		int k = 3;
		int[] res = maxSlidingWindow(nums, k);
		System.out.println(Arrays.toString(res)); 
		// Output: [3, 3, 5, 5, 6, 7]
	}
}
