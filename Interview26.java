package com.Interview;
 
/* remove character
Given two strings str1 and str2, remove those characters from the first string(str1)
 which are present in the second string(str2). Both the strings are different and contain only lowercase characters.
NOTE: Size of the first string is always greater than the size of the second string( |str1| > |str2|).
 * */

public class Interview26 {
	
	private static String remove(String s1,String s2) {
		String res = "";
		int left = 0;
		int right =0;
		while(left < s1.length() && right<s2.length()) {
			if(s1.charAt(left) == s2.charAt(right)) {
				left++;
				right++;
			}else {
				res = res+s1.charAt(left);
				left++;
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		
		String s1 = "computer";
		String s2 = "cat";
		
		String res = remove(s1,s2);
		System.out.println(res); // omputer
	}
}
