package com.Interview;

//Given two strings A and B, find if A is a subsequence of B.

public class Interview7 {

	private static int isSubSequence(String s1,String s2) {
		if(s1.length() == 0) return 1;
		
		int i=0,j=0;
		while(i < s1.length() && j < s2.length()) {
			if(s1.charAt(i) == s2.charAt(j)) {
				i++;
			}
			j++;
		}
		
		int res = -1;
		if(i == s1.length()) res = 1;
		else res = 0;
		
		return res;
	}

	public static void main(String[] args) {

		String s1 = "AXY";
		String s2 = "YADXCP";

		String A = "gksrek";
		String 	B = "geeksforgeeks";

		int x = isSubSequence(A,B);
		System.out.println(x);
	}
}
