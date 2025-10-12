package com.recursion;

public class SumRecursion {
	public static void main(String[] args) {
		
		int n = 10;
		int res = findSum(n,0);
		System.out.println(res);
	}
	
	static int findSum(int n,int res) {
		
		if(n == 1) {
			res += n;
			return res;
		}
		
		// sum of the new number into old sum
		
		return findSum(n-1,res+n);
		
	}
}
