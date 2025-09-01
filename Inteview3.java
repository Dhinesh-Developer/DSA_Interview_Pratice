package com.Interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* sort in specific order.
Given an array arr[] of positive integers. 
Your have to sort them so that the first part 
of the array contains odd numbers sorted in descending order,and the rest
 of the portion contains even numbers sorted in ascending order.
 * */
public class Inteview3 {
	
	private static int[] sortInOrder(int[] nums) {
		List<Integer> odd = new ArrayList<>();
		List<Integer> even = new ArrayList<>();
		for(int i=0;i<nums.length;i++) {
			if(nums[i] %2== 0) {
				even.add(nums[i]);
			}else {
				odd.add(nums[i]);
			}
		}
		Collections.reverse(odd);
		
		int[] res = new int[nums.length];
		int ind = 0;
		for(int x : odd) res[ind++] = x;
		for(int x : even) res[ind++] = x;
		
		return res;
	}
	
	public static void main(String[] args) {
		
		int[] nums = {1, 2, 3, 5, 4, 7, 10};
		
		int[] res = sortInOrder(nums);
		
		for(int x: res) {
			System.out.print(x+" "); // 7 5 3 1 2 4 10 
		}
	}
}
