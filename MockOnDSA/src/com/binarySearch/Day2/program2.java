package com.binarySearch.Day2;

public class program2 {
	public static void main(String[] args) {
		
		int[] nums = {2, 4, 4, 4, 6, 8, 10};
		int target = 4;
		
		// find the first occureneces of the given elemnt
		int index = findFirstOccurenceIndex(nums,target);
		System.out.println(index);
		
	}
	
	private static int findFirstOccurenceIndex(int[] nums,int target) {
		int n = nums.length;
		int low =0,high = n-1;
		int ans = -1;
		
		while(low <= high) {
			int mid = low + (high-low)/2;
			if(nums[mid] >= target) {
				ans = mid;
				high = mid-1;
			}else {
				low = mid+1;
				
			}
		}
		return ans;
	}
	
}
