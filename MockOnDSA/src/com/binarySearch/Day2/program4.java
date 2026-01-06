package com.binarySearch.Day2;

public class program4 {
	public static void main(String[] args) {

		// find the minimum in rotated sorted array
		int[] nums = { 11, 13, 15, 17, 3, 5, 7, 9 };

		int min = findMinimum(nums);
		System.out.println(min);
	}

	private static int findMinimum(int[] nums) {
		int n = nums.length;
		int ans = Integer.MAX_VALUE;

		int low = 0, high = n - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (nums[low] <= nums[mid]) {
				ans = Math.min(ans, nums[low]);
				low = mid + 1;
			} else {
				ans = Math.min(ans, nums[mid]);
				high = mid - 1;
			}
		}

		return ans;
	}
}
