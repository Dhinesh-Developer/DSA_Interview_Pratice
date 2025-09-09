package com.pattern.TwoPointers;

import java.util.HashSet;
import java.util.Set;

// longest substring without repeating character.

public class TP11 {
	
	private static int func(String s) {
		int n = s.length();
		int res =0, start=0;
		Set<Character> set = new HashSet<>();
		for(int i=0;i<n;i++) {
			if(set.contains(s.charAt(i))) {
				set.remove(s.charAt(start++));
			}
			set.add(s.charAt(i));
			res = Math.max(res,i-start+1);
		}
		return res;
	}
	
	public static void main(String[] args) {
		
		String s = "cadbzabcd";
		int res = func(s);
		System.out.println(res);
	}
}
