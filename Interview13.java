package com.Interview;

import java.util.HashMap;
import java.util.Map;

/* Single Number II
Given an integer array nums where every element appears three times except for one,
 which appears exactly once. Find the single element and return it.

You must implement a solution with a linear runtime complexity and use only constant extra space.
 * */

public class Interview13 {
	
	private static int findSingleNumber(int[] nums) {
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<nums.length;i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
		}
		
		int res = -1;
		for(Map.Entry<Integer, Integer> x : map.entrySet()) {
			if(x.getValue() == 1) {
				res = x.getKey();
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		
		int[] nums = {2,2,3,2};
		int res = findSingleNumber(nums);
		System.out.println(res); // 3
	}
}
