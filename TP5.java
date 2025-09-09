package com.pattern.TwoPointers;

// move zeros to end
public class TP5 {
	
	private static void moveZeroToEnd(int[] nums) {
		int n = nums.length;
		int j = 0;
		for(int i=0;i<n;i++) {
			if(nums[i] !=0) {
				int temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;
				j++;
			}
		}
	}
	
	public static void main(String[] args) {
		
		int[] nums = {0,1,0,3,12};
		 moveZeroToEnd(nums);
		
		for(int x : nums) {
			System.out.print(x+" "); //1 3 12 0 0 
		}
 	}
}
