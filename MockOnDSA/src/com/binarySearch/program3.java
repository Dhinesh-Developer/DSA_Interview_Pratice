package com.binarySearch;

public class program3 {
	public static void main(String[] args) {

		int[] arr = { 6, 7, 8, 1, 2, 3, 4, 5 };
		int x = 8;
		int n = arr.length;

		int index = findElementIndex(arr, n, x);
		System.out.println(index);

	}

	private static int findElementIndex(int[] arr, int n, int x) {
		int ind = -1;
		int low = 0, high = n - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			
			
			if (arr[low] <= arr[mid]) {
				if (arr[low] <= x && x <= arr[mid]) {

					ind = mid;
					high = mid = 1;
				} else {
					low = mid + 1;
				}
			} else {
				if (arr[mid] <= x && x <= arr[high]) {
					ind = mid;
					low = mid + 1;
				} else {
					high = mid - 1;
				}
			}
		}
		return ind;
	}
}
