package com.dk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 3 sum.
Given an integer array nums, return all the triplets
 [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.
 * */

public class program10 {
	
	private static List<List<Integer>> ThreeSum(int[] nums){
		List<List<Integer>> res = new ArrayList<>();
		int n = nums.length;
		Arrays.sort(nums);
		for(int i=0;i<n;i++) {
			if(i >0 && nums[i] == nums[i-1]) i++;
			int left = i+1;
			int right = n-1;
			while(left < right) {
				int sum = nums[i] + nums[left] + nums[right];
				if(sum == 0) {
					res.add(Arrays.asList(nums[i] , nums[left] , nums[right]));
					left++;
					right--;
					while(left < right && nums[left] == nums[left-1]) left++;
					while(left < right && nums[right] == nums[right+1]) right--;
				}else if(sum > 0) {
					right--;
				}else {
					left++;
				}
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		
		int[] nums = {-1,0,1,2,-1,-4};
		List<List<Integer>> res = ThreeSum(nums);
		System.out.println(res); // [[-1, -1, 2], [-1, 0, 1]]
		
	}
}
