package com.tuf.dp;

public class program2 {
	public static void main(String[] args) {
		
		
		 // question 1: 1D array -> climbing stair
		// we need to count the no.of ways to reach the last stair.
		int n = 3;
		int res = f(n); 
		System.out.println("No. of ways to reach the last stair: "+res);
	}
	
	// space optimization case
	static int f(int ind) {
		
		int prev = 1;
		int prev2 = 0;
		for(int i=1;i<=ind;i++) {
			int curi = prev2+prev;
			prev2 = prev;
			prev = curi;
		}
		
		return prev;
	}
	
}
