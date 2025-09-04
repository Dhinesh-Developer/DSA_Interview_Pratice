package com.Interview;

import java.util.Stack;

// decode String

public class Interview21 {
	
	private static String decodeString(String s) {
		Stack<StringBuilder> stringStack = new Stack<>();
		Stack<Integer> countStack = new Stack<>();
		
		StringBuilder current  = new StringBuilder();
		int k = 0;
		for(char c : s.toCharArray()) {
			if(Character.isDigit(c)) {
				k = k*10 + (c-'0');
			}else if(c=='[') {
				countStack.push(k);
				stringStack.push(current);
				k = 0;
				current = new StringBuilder();
			}else if(c == ']'){
				int repeat = countStack.pop();
				StringBuilder decode = stringStack.pop();
				for(int i=0;i<repeat;i++) {
					decode.append(current);
				}
				current = decode;
			}else {
				current.append(c);
			}
		}
		
		return current.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(decodeString("3[a]2[bc]"));     // aaabcbc
        System.out.println(decodeString("3[a2[c]]"));      // accaccacc
        System.out.println(decodeString("2[abc]3[cd]ef")); // abcabccdcdcdef
    
	}
}
