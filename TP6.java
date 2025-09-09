package com.pattern.TwoPointers;
// reverse a String.

public class TP6 {
	
	private static void reverseString(String s) {
		char[] c = s.toCharArray();
		int left = 0;
		int right = c.length-1;
		while(left < right) {
			char temp = c[left];
			c[left] = c[right];
			c[right] = temp;
			left++;
			right--;
		}
		
		for(char x : c) {
			System.out.print(x);
		}
	}
	
	public static void main(String[] args) {
		
		String s = "hello";
		reverseString(s); // olleh
	}
}
