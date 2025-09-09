package com.pattern.TwoPointers;

// valid plaindrome

public class TP3 {
	
	private static boolean validPalindrome(String s) {
		s = s.toLowerCase();
		s= s.replaceAll("[^a-z0-9]", "");
		int n = s.length();
		int i=0,j=n-1;
		while(i<j) {
			if(s.charAt(i) == s.charAt(j)) {
				i++;
				j--;
			}else {
				return false;
			}
			
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		String s = "A man, a plan, a canal: panama";
		boolean res = validPalindrome(s);
		System.out.println(res); // true
	}
}
