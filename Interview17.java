package com.Interview;

import java.util.Arrays;

/* Count the number of possible triangles

Given an integer array arr[].
 Find the number of triangles that can be formed with three different array elements as lengths of three sides of the triangle. A triangle with three given sides is only possible 
if sum of any two sides is always greater than the third side.
 * */

public class Interview17 {
	
	private static int findTraingle(int[] nums) {
		int cnt = 0;
		if(nums.length < 0) return 0;
		Arrays.sort(nums);
		int n = nums.length;
		for(int i=n-1;i>=2;i--) {
			int left = 0;
			int right = i-1;
			while(left < right) {
				if(nums[left] + nums[right] > nums[i]) {
					cnt += right-left;
					right--;
				}else {
					left++;
				}
			}
		}
		return cnt;
	}
	
	public static void main(String[] args) {
		
		int[] nums = {4,6,3,7};
		int res = findTraingle(nums);
		System.out.println(res); // 3
	}
}
