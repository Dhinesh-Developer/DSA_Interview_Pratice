package com.Interview;

import java.util.Arrays;

/* Pair Sum Closest to 0

Given an integer array of N elements. You need to find the maximum sum of two elements such that sum is closest to zero.

Example 1:

Input:
N = 3
arr[] = {-8 -66 -60}
Output: -68
Explanation: Sum of two elements closest to 
zero is -68 using numbers -60 and -8.
Example 2:

Input: 
N = 6
arr[] = {-21 -67 -37 -18 4 -65}
Output: -14
Explanation: Sum of two elements closest to
zero is -14 using numbers -18 and 4. 
 * */

public class Interview34 {
	
	private static int closestToZero(int[] nums,int n) {
		Arrays.sort(nums);
		int left = 0,right = n-1;
		
		int closestSum = Integer.MAX_VALUE,res = 0;
		while(left < right) {
			int sum = nums[left] + nums[right];
			if(Math.abs(sum) < Math.abs(closestSum)) {
				closestSum = sum;
				res = sum;
			}
			
			if(sum < 0) left++;
			else right--;
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		 int[] arr1 = {-8, -66, -60};
	        System.out.println(closestToZero(arr1, arr1.length)); // -68

	        int[] arr2 = {-21, -67, -37, -18, 4, -65};
	        System.out.println(closestToZero(arr2, arr2.length)); // -14
	}
}
