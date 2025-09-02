package com.dk;
// sort 0's ,1's ,2's

public class program9 {
	
	private static void sorting(int[] nums) {
		
		int n = nums.length;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(nums[i] > nums[j]) {
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		int[] nums = {0,1,2,0,1,1,0,2};
		sorting(nums);
		
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i]+" "); //0 0 0 1 1 1 2 2 
		}
	}
}
