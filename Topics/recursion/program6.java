package com.tuf.recursion;

public class program6 {
	public static void main(String[] args) {
		
		// multiple recursion calls.
		// find the fibonacci nTh term
		int n = 6;
		int res = printFibonnacci(n);
		System.out.println(res);
	}
	
	static int printFibonnacci(int ind) {
		// base case
		if(ind <= 1) {
			return ind;
		}
		
		// logic
		int last = printFibonnacci(ind-1);
		int secondLast = printFibonnacci(ind-2);
		return last+secondLast;
	}
}
