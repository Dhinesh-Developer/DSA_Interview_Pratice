package com.recursion;

public class NumberRecursion {
	public static void main(String[] args) {
		
		int n = 1;
		print(n);
	}
	
	static void print(int n) {
		// base conditions
		if(n==10) {
			System.out.println(n);
			return;
		}
		
		// print the numbers from 1 to 5;
		System.out.print(n+" ");
		print(n+1);
	}
}
