package com.Interview;

/*
You are given an array arr[] of non-negative integers.
 You have to move all the zeros in the array to the right end 
 while maintaining the relative order of the non-zero elements.
  The operation must be performed in place, 
  meaning you should not use extra space for another array. 
 */

public class Interview11 {
	
	private static int[] moveZeroToEnd(int[] nums) {
		int[] res = new int[nums.length];
		int ind = 0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i] != 0) {
				res[ind++] = nums[i];
			}
		}
		
		while(ind < nums.length) {
			res[ind++] = 0;
		}
		
		return res;
	}
	
	public static void main(String[] args) {

		int[] nums = {1, 2, 0, 4, 3, 0, 5, 0};

		int[] res = moveZeroToEnd(nums);
		
		for(int x : res) {
			System.out.print(x+" "); // 1 2 4 3 5 0 0 0 
		}
	}
}
