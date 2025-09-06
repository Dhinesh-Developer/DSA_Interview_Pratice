package com.dk;

/*Product of Array Except Self
Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation
 * */

public class program17 {
	
	private static int[] productOfArray(int[] nums) {
		int n = nums.length;
		int[] res = new int[n];
		int[] prefix = new int[n];
		int[] suffix = new int[n];
		
		prefix[0] = 1;
		suffix[n-1] = 1;
		
		for(int i=1;i<n;i++) {
			prefix[i] = prefix[i-1] * nums[i-1];
		}
		
		for(int i=n-2;i>=0;i--) {
			suffix[i] = suffix[i+1] * nums[i+1];
		}
		
		for(int i=0;i<n;i++) {
			res[i] = prefix[i] * suffix[i];
		}
		
		return res;
	
	}
	
	public static void main(String[] args) {
		
		int[] nums = {1,2,3,4};
		int[] res = productOfArray(nums);
		
		for(int x : res) {
			System.out.print(x+" "); // 24 12 8 6
		}
	}
}
