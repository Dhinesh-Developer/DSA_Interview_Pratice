package com.Interview;

import java.util.ArrayList;
import java.util.List;

/* print all possbile words from a phone digit.
On an old phone keypad, each digit maps to a set of characters:

2 -> a b c
3 -> d e f
4 -> g h i
5 -> j k l
6 -> m n o
7 -> p q r s
8 -> t u v
9 -> w x y z


Given a number as a string of digits (like "23"), print all possible letter combinations that the number could represent.

🔹 Example

Input:
digits = "23"


Output:
ad ae af bd be bf cd ce cf
 * */

public class Interview31 {
	
	static final String mapping[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	
	
	private static void backTrack(String s,int ind,StringBuilder current,List<String> res) {
		if(ind == s.length()) {
			res.add(current.toString());
			return;
		}
		
		String letter = mapping[s.charAt(ind)-'0'];
		for(Character x : letter.toCharArray()) {
			current.append(x);
			backTrack(s,ind+1,current,res);
			current.deleteCharAt(current.length()-1);
		}
	}
	
	private static List<String> letterCombination(String s){
		List<String> res = new ArrayList<>();
		if(s==null || s.length() == 0) return res;
		backTrack(s,0,new StringBuilder(),res);
		return res;
	}
	
	
	
	public static void main(String[] args) {
		
		String s = "23";
		List<String> combinations = letterCombination(s);
		System.out.println(combinations); // [ad, ae, af, bd, be, bf, cd, ce, cf]
	}
}
