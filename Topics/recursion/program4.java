package com.tuf.recursion;


// sum of first n natural number using recursion(parameterized and non-parameterized)
public class program4 {
	public static void main(String[] args) {
		
		int n = 5;
		int sum = 0;
		// using the parameter
		func(n,sum);
		
		// using the functional
		int res = func2(n);
		System.out.println(res);
	}
	
	
	// using the functional recursion
	static int func2(int n) {
		
		// base case
		if(n < 1) {
			return 0;
		}
		
		//logic
		return n+func2(n-1);
	}
	
	
	// using the parameterized recursion.
	static void func(int n,int sum) {
		
		// base case
		if(n <1) {
			System.out.println(sum);
			return;
		}
		
		// logic
		func(n-1,sum+n);
	}
}
