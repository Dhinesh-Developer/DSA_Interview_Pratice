package com.pattern.TwoPointers;
// product of subarray less than k.

public class TP8 {
	
	private static int product(int[] nums,int k) {
		int n = nums.length;
		int cnt = 0;
		for(int i=0;i<n;i++) {
			int prod = 1;
			for(int j=i+1;j<n;j++) {
				prod *=  nums[j];
				if(prod < k) cnt++;
				else {
					break;
				}
			}
		}
		return cnt;
	}
	
	public static void main(String[] args) {
		
		int[] nums = {10,5,2,6};
		int k = 100;
		
		int res = product(nums,k);
		System.out.println(res);
	}
}
