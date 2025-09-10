package com.pattern.slidingWindow;

import java.util.HashSet;
import java.util.Set;

//Longest Substring Without Repeating Characters
/*
Given a string s, find the length of the longest substring without duplicate characters.

Example 1:
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.

Example 2:
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
 * */

public class SW1 {
	
	private static int longestSubstring(String s) {
		if(s==null || s.length() == 0) return 0;
		int n = s.length();
		Set<Character> set = new HashSet<>();
		int left=0,maxLen = 0;
		for(int right = 0;right<n;right++) {
			if(set.contains(s.charAt(right))) {
				set.remove(s.charAt(left++));
			}
			set.add(s.charAt(right));
			maxLen = Math.max(maxLen, right-left+1);
		}
		return maxLen;
	}
	
	public static void main(String[] args) {
		
		String s = "abcabcbb";
		int res = longestSubstring(s);
		System.out.println(res); // 3.
	}
}
