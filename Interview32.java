package com.Interview;

/* Find equilibrium point.
Given an array of integers arr[], the task is to find the first equilibrium point in the array.

The equilibrium point in an array is an index (0-based indexing) 
such that the sum of all elements before that index is the 
same as the sum of elements after it. 
Return -1 if no such point exists. 
 * */

public class Interview32 {
	
	private static int findPoint(int[] nums) {
		int sum=0,cur=0;
		for(int x : nums) sum +=x;
		sum -= nums[0];
		for(int i=1;i<nums.length-1;i++) {
			sum -= nums[i-1];
			cur += nums[i];
			if(sum == cur) return i;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		int[] nums = {1,2,0,3}; //2
		int[] num = {-7, 1, 5, 2, -4, 3, 0}; // 3
		int res = findPoint(num);
		System.out.println(res); 
	}
}
