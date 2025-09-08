package com.Interview;

/* Add digit
Given an integer num, 
repeatedly add all its digits until the result has only one digit, and return it.

Example 1:

Input: num = 38
Output: 2
Explanation: The process is
38 --> 3 + 8 --> 11
11 --> 1 + 1 --> 2 
Since 2 has only one digit, return it.
Example 2:

Input: num = 0
Output: 0

 * */

public class Interview33 {
	
	private static int addDigit(int num) {
		if(num == 0) return 0;
		return 1+(num-1)%9;
	}
	
	public static void main(String[] args) {
		
		int num = 38;
		int res = addDigit(num);
		System.out.println(res); // 2
	}
}
