package com.tuf.recursion;

// print name 5 times using the recursion
public class program1 {

	public static void main(String[] args) {
		int n = 5;
		String name = "kumar";
//		f(0,name,n);
		f2(name,n);
	}
	
	static void f(int i,String s,int n) {
		if(i == n) {
			return;
		}
		
		System.out.println(s);
		f(i+1,s,n);
	}
	
	static void f2(String s,int n) {
		if(n < 1) {
			return;
		}
		System.out.println(s);
		f2(s,n-1);
	}
}
