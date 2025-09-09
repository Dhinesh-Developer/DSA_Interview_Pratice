package com.pattern.TwoPointers;

// Two sum.
public class TP1 {
	
	private static int[] twoSum(int[] nums,int target) {
		int n = nums.length;
		int left = 0,right = n-1;
		while(left < right) {
			int sum = nums[left] + nums[right];
			if(sum == target) {
				return new int[] {left,right};
			}else if(sum > target) {
				right--;
			}else {
				left++;
			}
		}
		return new int[] {-1,-1};
	}
	
	public static void main(String[] args) {
		
		int[] nums = {2,7,11,15};
		int target = 9;
		int[] res = twoSum(nums,target);
		
		for(int x : res) {
			System.out.print(x+" "); // 0 1
		}
	}
}
