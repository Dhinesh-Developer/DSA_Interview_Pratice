package com.dk;

// Next permutation.

public class program13 {
	
	private static void nextPermuatations(int[] nums) {
		int i = nums.length-1;
		while(i >0 && nums[i-1] >= nums[i]) i--;
		if(i==0) {
			reverse(nums,0,nums.length-1);
			return;
		}
		
		int j = nums.length-1;
		while(j >=i && nums[j] <= nums[i-1]) j--;
		swap(nums,i-1,j);
		reverse(nums,i,nums.length-1);
	}
	
	public static void swap(int[] nums,int i,int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
	
	public static void reverse(int[] nums,int start,int end) {
		while(start < end) {
			swap(nums,start,end);
			start++;
			end--;
		}
	}
	
	public static void main(String[] args) {
		
		int[] nums = {1,2,3};
		nextPermuatations(nums);
		
		for(int x : nums) {
			System.out.print(x+" "); // 1 3 2 
		}
	}
}
