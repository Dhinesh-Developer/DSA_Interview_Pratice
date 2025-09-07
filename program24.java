package com.dk;
 // largest rectangle in histogram
public class program24 {
	
	private static int findLargest(int[] nums) {
		int n = nums.length;
		int maxi = 0;
		
		for(int i=0;i<n;i++) {
			int height = nums[i];
			int left=i,right=i;
			
			while(left > 0 && nums[left - 1] >= height) left--;
			while(right < n-1 && nums[right+1] >= height) right++;
			
			int width = right - left+1;
			int area = height * width;
			maxi = Math.max(maxi, area);
		}
		return maxi;
	}
	
	public static void main(String[] args) {
		
		int[] nums = {2,1,5,6,2,3};
		int res = findLargest(nums);
		System.out.println(res); // 10
	}
}
