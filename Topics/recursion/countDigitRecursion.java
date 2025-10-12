package com.recursion;

public class countDigitRecursion {
	public static void main(String[] args) {
		
		// count the number of digits in the number using the recursion
		int n = 89789;
		int cnt = extract(n,0);
		System.out.println(cnt);
	}
	
	static int extract(int n,int cnt) {
		
		
		// base case if the number is 0 then hit the base case
		if(n < 0) {
			return cnt;
		}
		
		
		return extract(n/10,cnt+1);
	}
}
