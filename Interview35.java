package com.Interview;

import java.util.Arrays;

/*
 * Sort an Array of Strings in Lexicographical order
 * 
 * Input: arr[] = ["banana", "apple", "cherry"]
Output: ["apple", "banana", "cherry"]
Explanation: All strings are sorted alphabetically. "apple" comes before "banana", and "banana" before "cherry".

Input: arr[] = ["dog", "cat", "bat"]
Output: ["bat", "cat", "dog"]
Explanation: "bat" is the smallest, followed by "cat", and then "dog" in lexicographical order.

Input: arr[] = ["geeks", "for", "geeksforgeeks"] 
Output: ["for", "geeks", "geeksforgeeks"]
 * */
public class Interview35 {
	
	private static String[] sorting(String[] nums) {
		
		Arrays.sort(nums);
		return nums;
	}
	
	public static void main(String[] args) {
		
		 String[] arr = {"geeksforgeeks", "geeks", "for"};
		 String[] res = sorting(arr);
		 
		 for(String x : res) {
			 System.out.println(x);
		 }
		 /*
		  * for
			geeks
			geeksforgeeks
			*/
	}
}
