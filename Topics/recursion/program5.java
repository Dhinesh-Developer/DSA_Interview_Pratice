package com.tuf.recursion;

import java.util.Arrays;

// problems solved using the recursion.
public class program5 {
	public static void main(String[] args) {
		
		// 1. factorial of a given N.
		int n = 5; // 5 fact is 120.
		
		// solved using the functional recursion
		int res = fact(n);
		System.out.println(res);
		
		
		//2. Reverse an array
//		int arr[] = {1,2,3,4,5};
//		int l = 0,r = arr.length-1;
//		reverse(arr,l,r);
//		System.out.println(Arrays.toString(arr));
		
		
		//3. check if the String is palindrome
		String s = "madam";
		int l = 0,r=s.length()-1;
		isPalin(0,s,l,r);
		System.out.println(flag);
	}
	
	static boolean flag;
	static void isPalin(int i,String s,int l,int r) {
		
		//base case
		if(i >= s.length()/2) {
			flag =  true;
			return;
		}
		//logic
		if(s.charAt(l)!=s.charAt(r)) {
			flag= false;
			return;
		}
		isPalin(i+1,s,l+1,r-1);
		
	}
	
	
	static void reverse(int[] arr,int l,int r) {
		
		// base case
		if(l >= r) {
			return;
		}
		
		swap(arr,l,r);
		//logic
		reverse(arr,l+1,r-1);
		
	}
	
	static void swap(int[] arr,int start,int end) {
		int temp = arr[start];
		arr[start]=arr[end];
		arr[end] = temp;
	}
	
	static int fact(int n) {
		
		// base case  put 1 because we are multiplying the data
		if(n <1) {
			return 1;
		}
		
		// logic
		return n*fact(n-1);
	}
}
