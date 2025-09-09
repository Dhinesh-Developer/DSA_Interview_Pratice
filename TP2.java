package com.pattern.TwoPointers;
// remove duplicates from a sorted array.

public class TP2 {
	
	private static void removeDuplicates(int[] nums)
	{
		int n = nums.length;
		int j=1;
		for(int i=0;i<n;i++) {
			if(nums[i] != nums[j-1]) {
				nums[j++] = nums[i];
			}
		}
		
		System.out.println(j);
	}
	public static void main(String[] args) {
		
		int[] nums = {0,0,1,1,2,2,3,3,3};
		removeDuplicates(nums);
		
	}
}
