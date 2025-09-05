package com.Interview;

import java.util.ArrayList;
import java.util.List;

/* Modify the array.
Given an array arr. Return the modified array in such a way that 
if the current and next numbers are valid numbers and are equal
 then double the current number value and replace the next number with 0. 
 After the modification, 
rearrange the array such that all 0's are shifted to the end.
 * */

public class Interview22 {
	
	private static List<Integer> modify(int[] nums){
		
		for(int i=0;i<nums.length-1;i++) {
			if(nums[i]!=0 && nums[i+1] !=0) {
				if(nums[i] == nums[i+1]) {
					nums[i] *=2;
					nums[i+1] = 0;
				}
			}
		}
		
		List<Integer> li = new ArrayList<>();
		int ind = 0;
		for(int x : nums) {
			if(x != 0) {
				li.add(x);
				ind++;
			}
		}
		
		for(int i=ind;i<nums.length;i++) {
			li.add(0);
			ind++;
			
		}
		
		return li;
	}
	
	public static void main(String[] args) {
		
		int[] nums = {2,2,0,4,0,8};
		List<Integer> li = modify(nums);
		
		for(int x : li) {
			System.out.print(x+" "); // 4 4 8 0 0 0 
		}
 		
	}
}
