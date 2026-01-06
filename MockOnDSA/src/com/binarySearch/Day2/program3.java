package com.binarySearch.Day2;

public class program3 {
	public static void main(String[] args) {
		
		int[] nums = {1, 3, 20, 4, 1, 0};
		
		int index = findPeakElement(nums);
		System.out.println(index);
	}
	
	private static int findPeakElement(int[] nums) {
		int n = nums.length;
		
		int ind = -1;
		
//		if(nums[0] > nums[])
		
		for(int i=1;i<nums.length-1;i++) {
			if(nums[i-1] < nums[i] && nums[i] > nums[i+1]) {
				ind = i;
			}
		}
		if(nums[nums.length-2] < nums[nums.length-1]) ind = nums.length-1;
		
		return ind;
	}
	
	
//	private static int findPeakElement(int[] nums) {
//		int n = nums.length;
//		
//		int low = 0,high = n-1;
//		int ind = -1;
//		while(low <= high) {
//			int mid = low + (high-low)/2;
//			if(nums[mid-1] < nums[mid] && nums[mid] > nums[mid+1]) {
//				ind = mid;
//			}else if(nums[mid] > nums[mid+1]) {
//				low = mid+1;
//			}else {
//				high = mid-1;
//			}
//		}
//		return ind;
//	}
}
