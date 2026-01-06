package com.binarySearch.Day2;

public class program1 {
	public static void main(String[] args) {
		
		// normal bs
		int[] nums = {3, 7, 11, 18, 25, 31};
		int target = 18;
		
		int index = findTargetIndex(nums,target);
		System.out.println(index);
	}
	
	private static int findTargetIndex(int[] nums,int target) {
		int n = nums.length;
		int low =0,high = n-1;
		while(low <= high) {
			int mid = low + (high-low)/2;
			if(nums[mid] == target) return mid;
			else if(nums[mid] > target) high = mid-1;
			else low = mid+1;
		}
		return -1;
	}
}
