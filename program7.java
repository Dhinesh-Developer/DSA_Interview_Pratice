package com.dk;
// pow(x,n)

// Implement pow(x, n), which calculates x raised to the power n (i.e., xn).

public class program7 {
	
	private static double findPow(double x, int n) {
		
		if( n< 0) {
			n = -n;
			x = 1/x;
		}
		
		double pow = 1;
		while( n!=0) {
			if((n&1) != 0) {
				pow *= x;
			}
			x *=x;
			n >>>=1;
		}
		return pow;
	}
	
	public static void main(String[] args) {
		double x = 2.00000;
		int n = 10;
		
		double powRes = findPow(x,n);
		System.out.println(powRes); // 1024.0
	}
}
