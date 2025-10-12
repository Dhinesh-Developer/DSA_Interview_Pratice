package com.tuf.dp;

import java.util.Arrays;

public class program1 {
	public static void main(String[] args) {
		
		// 1. fibonacci using the dp -> we need to find the nth fibonacci series
		int n = 5;
//		int res = f(n);
		
		// i figured out that they having overlapping subproblems
		// so that i move on to memoization
	
		// step 1 -> declare dp[n+1] size
		int[] dp = new int[n+1];
		
		// 
		Arrays.fill(dp, -1);
//		int res = f1(ind,dp);
//		int res = f2(n,dp);
		int res = f3(n);
		System.out.println(res);
		
	}
	
	// normal recursion and memoization
	static int f(int ind,int[] dp) {
		
		// base case
		if(ind<=1) return ind;
		
		// check if already precomputed or not
		if(dp[ind] != -1) {
			return dp[ind];
		}
		
		//logic
		// step 2-<> store it in dp
		return dp[ind] = f(ind-1,dp)+f(ind-2,dp);
	}
	
	// tabulation
	static int f2(int ind,int[] dp) {
		
		//step1: base case to store as default values
		// store the values in dp
		dp[0] = 0;
		dp[1] = 1;
		
		//step2: instead of recursion converting to iteration reducing the space complexity
		for(int i=2;i<=ind;i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}
		
		// return the value -> i.e., the final -or- required output is present in the last value
		return dp[ind];//5
		
	}
	
	// space optimation
	static int f3(int ind) {
		
		// step 1: declaring variables
		int prev = 1;
		int prev2 = 0;
		
		for(int i=2;i<=ind;i++) {
			int curi = prev + prev2;
			prev2 = prev;
			prev = curi;
		}
		
		return prev; // 5
		// . . . . . .
		//         p2 p curi -> curi ->exceeds the last index that why returning the prev as ans
		
		
	}
	
	
}
