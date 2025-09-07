package com.dk;

// REverse pair
public class program23 {
	
	private static int reversePair(int[] nums) {
		int n = nums.length;
		int cnt =0 ;
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(nums[i] > 2*nums[j]) {
					cnt++;
				}
			}
		}
		return cnt;
	}
	
	public static void main(String[] args) {
		
		int[] nums = {1,3,2,3,1};
		int res = reversePair(nums);
		System.out.println(res); // 2
	}
}
