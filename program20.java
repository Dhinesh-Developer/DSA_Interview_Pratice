package com.dk;

/* Count inversion.
Given an integer array nums. Return the number of inversions in the array.

Two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j.

It indicates how close an array is to being sorted.
A sorted array has an inversion count of 0.
An array sorted in descending order has maximum inversion.
 * */

public class program20 {
	
	private static int countInversion(int[] nums) {
		int n = nums.length;
		int cnt = 0;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(nums[i] > nums[j]) {
					cnt ++;
				}
			}
		}
		return cnt;
	}
	
	public static void main(String[] args) {
		
		int[] nums = {2, 3, 7, 1, 3, 5};
		int res = countInversion(nums);
		System.out.println(res); // 5
	}
}
