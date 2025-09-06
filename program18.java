package com.dk;

// sum of subarray equals k.

public class program18 {
	
	private static int findSubarrayCnt(int[] nums,int k) {
		
		int n = nums.length;
		int cnt = 0;
		for(int i=0;i<n;i++) {
			int sum = 0;
			for(int j=i;j<n;j++) {
				sum += nums[j];
				if(sum == k) cnt++;
			}
		}
		return cnt;
	}
	
	public static void main(String[] args) {
		
		int[] nums = {1,1,1};
		int k =2;
		int cnt = findSubarrayCnt(nums,k);
		System.out.println(cnt); // 2
	}
}
