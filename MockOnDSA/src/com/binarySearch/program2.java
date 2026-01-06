package com.binarySearch;

public class program2 {
	public static void main(String[] args) {

//		arr = [7, 9, 12, 1, 3, 5]

//		int[] arr = { 7, 9,12, 1, 3, 5 };
		int[] arr = {4, 5, 6, 7, 0, 1, 2, 3};
		int n = arr.length;

		int minElement = findMinElementInRotatedSortedArray(arr, n);
		System.out.println(minElement);

	}

	private static int findMinElementInRotatedSortedArray(int[] arr, int n) {
		int low = 0, high = n - 1;
		int ans = Integer.MAX_VALUE;

		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (arr[low] <= arr[mid]) {
				ans = Math.min(ans, arr[low]);
				low = mid + 1;
			} else {
				ans = Math.min(ans, arr[mid]);
				high = mid - 1;
			}

		}

		return ans;
	}
}
