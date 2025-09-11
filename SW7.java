package com.pattern.slidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//  Find All Anagrams in a String
/*
Given two strings s and p, return an array of all the start indices of p's anagrams in s. 
You may return the answer in any order.
 
Example 1:

Input: s = "cbaebabacd", p = "abc"
Output: [0,6]
Explanation:
The substring with start index = 0 is "cba", which is an anagram of "abc".
The substring with start index = 6 is "bac", which is an anagram of "abc".
Example 2:

Input: s = "abab", p = "ab"
Output: [0,1,2]
Explanation:
The substring with start index = 0 is "ab", which is an anagram of "ab".
The substring with start index = 1 is "ba", which is an anagram of "ab".
The substring with start index = 2 is "ab", which is an anagram of "ab".

 * */
public class SW7 {
	
	private static void findAllAnagrams(String s,String p) {
		List<Integer> li = new ArrayList<>();
		int[] pcnt = new int[26];
		int[] scnt = new int[26];
		
		for(char x : p.toCharArray()) {
			pcnt[x-'a']++;
		}
		int window = p.length();
		for(int i=0;i<s.length();i++) {
			scnt[s.charAt(i)-'a']++;
			if(i>=window) {
				scnt[s.charAt(i-window)-'a']--;
			}
			if(Arrays.equals(pcnt, scnt)) {
				li.add(i-window+1);
			}
		}
		
		for(int x : li) {
			System.out.println(x);
		}
	}
	
	public static void main(String[] args) {
		
		String s = "cbaebabacd";
		String p = "abc";
		
		findAllAnagrams(s,p); //[0,6]
	}
}
