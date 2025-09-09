package com.pattern.TwoPointers;

// squares of a sorted array.
public class TP7 {
	
	private static int[] square(int[] nums) {
		int[] res = new int[nums.length];
		int left = 0,right=nums.length-1;
		for(int i=nums.length-1;i>=0;i--) {
			if(Math.abs(nums[left]) > Math.abs(nums[right])) {
				res[i] = nums[left] * nums[left];
				left++;
			}else {
				res[i] = nums[right] * nums[right];
				right--;
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		
		int[] nums = {-4,-1,0,3,10};
		int[] res = square(nums);
		
		for(int x : res) {
			System.out.print(x+" "); // 0 1 9 16 100
		}
	}
}
