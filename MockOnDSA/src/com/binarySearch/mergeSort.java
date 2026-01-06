package com.binarySearch;

public class mergeSort {
	public static void main(String[] args) {
		
		int[] nums = {5,2,3,4,1};
		int n = nums.length;
		int low = 0;
		int high = n-1;
		
		merge(nums,low,high);
		
		for(int i=0;i<n;i++) {
			System.out.print(nums[i]+" ");
		}
	}
	
	private static void merge(int[] nums,int low,int high) {
		if(low < high) {
			int mid = low + (high-low)/2;
			merge(nums,low,mid);
			merge(nums,mid+1,high);
			mergesort(nums,low,mid,high);
		}
	}
	
	private static void mergesort(int[] nums,int low,int mid,int high) {
		int n1 = mid-low+1;
		int n2 = high-mid;
		
		int[] l = new int[n1];
		int[] r = new int[n2];
		
//		int[] res = new int[n1+n2];
		for(int i=0;i<n1;i++) {
			l[i] = nums[low+i];
		}
		
		for(int j=0;j<n2;j++) {
			r[j] = nums[mid+j+1];
		}
		
		
		int i = 0,j = 0,k = low;
		while(i < n1 && j < n2) {
			if(l[i] <= r[j]) {
				nums[k++] = l[i++];
			}else {
				nums[k++] = r[j++];
			}
		}
		
		while(i < n1) {
			nums[k++] = l[i++];
		}
		while(j < n2) {
			nums[k++] = r[j++];
		}
		
		
//		int ind = 0;
//		for(int i=0;i<res.length;i++) {
//			nums[ind++] = res[i];
//		}
		
	}
	
}

