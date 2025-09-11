package com.dk;

import java.util.Arrays;

// valid anagram.

/*
 Given two strings s and t, return true if t is an anagram of s, and false otherwise.

Example 1:

Input: s = "anagram", t = "nagaram"

Output: true

Example 2:

Input: s = "rat", t = "car"

Output: false

 

Constraints:

1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.
 * 
 * */
public class program30 {
	
	private static boolean isAnagram(String s,String t) {
		char[] s1 = s.toCharArray();
		char[] s2 = t.toCharArray();
		
		Arrays.sort(s1);
		Arrays.sort(s2);
		
		return (Arrays.equals(s1, s2));
	}
	
	public static void main(String[] args) {

		String s = "anagram";
		String t = "nagaram";
		
		boolean res = isAnagram(s,t);
		System.out.println(res); // true.
		
	}
}
