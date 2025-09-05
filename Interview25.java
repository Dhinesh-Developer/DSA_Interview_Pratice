package com.Interview;

import java.util.HashSet;
import java.util.Set;

/*
You are given a string s and a list dictionary[] of words.
 Your task is to determine whether the string s can be formed by concatenating one or more words from the dictionary[].

Note: From dictionary[], any word can be taken any number of times and in any order
 * */

public class Interview25 {

	private static boolean find(String[] dict,String s) {

		Set<String> set = new HashSet<>();
		int maxLength =0;
		for(String word :dict){
			set.add(word);
			maxLength = Math.max(word.length(), maxLength);
		}

		int n = s.length();
		boolean dp[] = new boolean[n+1];
		dp[0] = true;

		for (int i = 1; i <= n; i++) {
			for (int j = i-1; j >= Math.max(0,i-maxLength); j--) {
				if (dp[j] && set.contains(s.substring(j, i))) {
					dp[i] = true;
					break;
				}
			}
		}
		return dp[n];

	}

	public static void main(String[] args) {

		String[] dict =  {"i", "like", "gfg"};
		String target = "ilike";

		boolean res = find(dict,target);
		System.out.println(res);
	}
}
