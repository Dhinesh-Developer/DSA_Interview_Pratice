package com.dk;
//Single Element in a Sorted Array
public class program28 {
	
	private static int unique(int[] nums) {
		int res = 0;
		for(int i=0;i<nums.length;i++) {
			res ^= nums[i];
		}
		return res;
	}
	
	public static void main(String[] args) {
		int[] nums = {1,1,2,3,3,4,4,8,8};
		int res = unique(nums);
		System.out.println(res);
		
	}
}
