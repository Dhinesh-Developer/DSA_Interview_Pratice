package com.tuf.recursion;

public class program2 {
	public static void main(String[] args) {
		
		// print linearly from 1 to N
//		func(1,5);
		
		// print from N to 1
		func2(5);
		
	}
	
	static void func2(int n) {
		
		// base case
		if(n==0) {
			return;
		}
		
		System.out.println(n);
		func2(n-1);
	}
	
	
	static void func(int ind,int n) {
		if(ind == n) {
			System.out.println(ind);
			return;
		}
		System.out.println(ind);
		func(ind+1,n);
	}
}
