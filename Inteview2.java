package com.Interview;

import java.util.ArrayList;
import java.util.List;

// Make a Discint digit array
//Given an array nums of positive integers of size N. Find all distinct digits present in nums.
public class Inteview2 {
	public static void main(String[] args) {
		
		//int[] nums = {131, 11, 48};
		int[] nums = {111, 222, 333, 4444, 666};
		List<Integer> li = new ArrayList<>();
		for(int i=0;i<nums.length;i++) {
			while(nums[i] >0) {
				if(!li.contains(nums[i]%10)) {
					li.add(nums[i]%10);
				}
				nums[i] /= 10;
			}
		}
		
		int[] res = new int[li.size()];
		int ind = 0;
		for(int x : li) {
			res[ind++] = x;
		}
		
		for(int x : res) {
			System.out.print(x+" "); // 1 2 3 4 6 
		}
		
	}
}
