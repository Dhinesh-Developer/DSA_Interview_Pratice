package com.binarySearch;

public class program1 {
	public static void main(String[] args) {
		
		int n = 7;  
		int[] arr = {2, 4, 4, 4, 6, 8, 9}; 
		int x = 4;
		
		int lb = findLowerBound(arr,n,x);
		if(lb == n || arr[lb] != x) {
			System.out.println(-1+" "+-1);
		}
		int ub = findUpperBound(arr,n,x);
		System.out.println(ub+" "+lb);
		
	}
	
	private static int findLowerBound(int[] arr,int n,int x) {
		int low = 0,high = n-1;
		int ans = -1;
		while(low <= high) {
			int mid = low + (high-low)/2;
			if(arr[mid] <= x) {
				ans = mid;
				low = mid+1;
			}else {
				high = mid-1;
			}
		}
		return ans;
	}
	
	private static int findUpperBound(int[] arr,int n,int x) {
		int low = 0,high = n-1;
		int ans = -1;
		while(low <= high) {
			int mid = low + (high-low)/2;
			if(arr[mid] >=x) {
				ans = mid;
				high = mid-1;
			}else {
				low = mid+1;
			}
		}
		return ans;
	}
}
