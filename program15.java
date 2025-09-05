package com.dk;

import java.util.HashSet;
import java.util.Set;

// longest subString without repeating character
//Given a string s, find the length of the longest substring without duplicate characters
public class program15 {
	
	private static int findLength(String s) {
		if(s==null || s.length()==0) return 0;
		Set<Character> set = new HashSet<>();
		int maxLen = 0,start = 0;
		for(int i=0;i<s.length();i++) {
			while(set.contains(s.charAt(i))) {
				set.remove(s.charAt(start++));
			}
			set.add(s.charAt(i));
			maxLen = Math.max(maxLen, i-start+1);
		}
		return maxLen;
	}
	
	public static void main(String[] args) {
		
		String s = "abcabcbb";
		int len = findLength(s);
		System.out.println(len); // 3
	}
}
