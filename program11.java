package com.dk;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* 4 sum
Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:

0 <= a, b, c, d < n
a, b, c, and d are distinct.
nums[a] + nums[b] + nums[c] + nums[d] == target
You may return the answer in any order. 
 */

public class program11 {
	
	private static List<List<Integer>> _4Sum(int[] nums,int target){
		Set<List<Integer>> st = new HashSet<>();
		int n = nums.length;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				Set<Integer> set = new HashSet<>();
				for(int k = j+1;k<n;k++) {
					int sum = nums[i] + nums[j] + nums[k];
					int fourth = target-sum;
					if(set.contains(fourth)) {
						List<Integer> temp = new ArrayList<>();
						temp.add(nums[i]);
						temp.add(nums[j]);
						temp.add(nums[k]);
						temp.add(fourth);
						temp.sort(Integer::compareTo);
						st.add(temp);
					}
					set.add(nums[k]);
				}
			}
		}
		
		List<List<Integer>> li = new ArrayList<>(st);
		return li;
	}
	
	public static void main(String[] args) {
		
		int[] nums = {1,0,-1,0,-2,2};
		int target = 0;
		
		List<List<Integer>> res = _4Sum(nums,target);
		System.out.println(res); // [[-2, 0, 0, 2], [-1, 0, 0, 1], [-2, -1, 1, 2]]
	}
}
