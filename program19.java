package com.dk;

import java.util.LinkedHashMap;
import java.util.Map;

/* Find duplicate number in the array.
Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and using only constant extra space.
 * 
 * */


public class program19 {
	
	private static int findDuplicate(int[] nums) {
		Map<Integer,Integer> map = new LinkedHashMap<>();
		for(int i=0;i<nums.length;i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
		}
		
		int num = -1;
		for(Map.Entry<Integer, Integer> x : map.entrySet()) {
			if(x.getValue() > 1) {
				num = x.getKey();
			}
		}
		
		return num;
	}
	
	public static void main(String[] args) {
		
		int[] nums = {1,3,4,2,2};
		int res = findDuplicate(nums);
		System.out.println(res); // 2
	}
}
