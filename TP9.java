package com.pattern.TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 3 sum.

public class TP9 {
	
	private static List<List<Integer>> Triplets(int[] nums){
		List<List<Integer>> res = new ArrayList<>();
		Arrays.sort(nums);
		int n = nums.length;
		for(int i=0;i<n;i++) {
			if(i>0 && nums[i-1] == nums[i]) continue;
			int j = i+1;
			int k = n-1;
			while( j< k) {
				int sum = nums[i]+nums[j]+nums[k];
				if(sum == 0) {
					res.add(Arrays.asList(nums[i],nums[j],nums[k]));
					j++;
					while(j<k && nums[j] == nums[j-1]) j++;
				}else if(sum < 0) {
					j++;
				}else {
					k--;
				}
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		
		int[] nums = {-1,0,1,2,-1,4};
		List<List<Integer>> li = Triplets(nums);
		System.out.println(li);
	}
}
