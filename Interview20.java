package com.Interview;

/* Special Array Reversal
Given a string S, containing special characters and all the alphabets,
 reverse the string without
affecting the positions of the special characters
 * */

public class Interview20 {
	
	static boolean isAlphabet(char ch) {
		return Character.isLetter(ch);
	}
	
	private static String reverseString(String s) {
		char[] arr = s.toCharArray();
		
		int left = 0,right = arr.length-1;
		while(left < right) {
			if(!isAlphabet(arr[left])) left++;
			else if(!isAlphabet(arr[right])) right--;
			else {
				char temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}
		return new String(arr);
	}
	
	public static void main(String[] args) {
		
		//String s = "A&B"; // B&A
		String s = "a,b$c"; // c,b$a
		String res = reverseString(s);
		System.out.println(res);
	}
}
