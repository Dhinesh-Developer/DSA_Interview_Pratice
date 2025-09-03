package com.Interview;
/* Minimum Moves to Convert String
You are given a string s consisting of n characters which are either 'X' or 'O'.

A move is defined as selecting three consecutive characters of s and converting them to 'O'. 
Note that if a move is applied to the character 'O', it will stay the same.

Return the minimum number of moves required so that all the characters of s are converted to 'O'.
 * */
public class Interview14 {
	
	private static int findSteps(String s) {
		int i = 0;
		int step = 0;
		while(i < s.length()) {
			if(s.charAt(i) == 'X') {
				i = i+3;
				step++;
			}else {
				i++;
			}
		}
		return step;
	}
	
	public static void main(String[] args) {
		
		String s = "XXX";
		String t = "XX0X";
		int res = findSteps(s);
		System.out.println(res); // 2
	}
}
