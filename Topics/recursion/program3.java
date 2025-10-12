package com.tuf.recursion;

public class program3 {
	public static void main(String[] args) {
		
		// print linearly from 1 to N (but using backtracking)
		func(0);
		
		// print reverse from N to 1 (but using backtracking)
//		func2(5);
	}
	
	// reverse na -  and base case 0
	static void func2(int n) {
		if(n == 0) {
			return;
		}
		
		System.out.println(n);
		func2(n-1);
	}
	
	// linear na + and base vase n
	static void func(int n) {
		
		if(n == 5) {
			System.out.println(n);
			return;
		}
		
		System.out.println(n);
		func(n+1);
	}
}
