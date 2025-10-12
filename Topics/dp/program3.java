package com.tuf.dp;

import java.util.Arrays;

public class program3 {
	public static void main(String[] args) {


		// question 2: frog jump.
		int[] arr = {10,20,30,10};
		// minimum energy required to reach the last index
		int[] dp = new int[arr.length+1];
		Arrays.fill(dp, -1);
		int res = f1(arr.length-1,arr,dp);
		System.out.println("Minimum energy required to reach the last index: "+res);

	}


	// normal recursion -or- memoization.
	static int f(int ind,int[] arr,int[] dp) {

		// base case
		if(ind == 0) {
			return 0;
		}
		if(dp[ind] != -1) {
			return  dp[ind];
		}
		int left= f(ind-1,arr,dp)+Math.abs(arr[ind] - arr[ind-1]);
		int right = Integer.MAX_VALUE;
		if(ind > 1) {
			right = f(ind-2,arr,dp) + Math.abs(arr[ind] - arr[ind-2]);
		}

		return dp[ind] = Math.min(left, right);

	}

	// tabulation

	static int f1(int ind,int[] arr,int[] dp) {

		dp[0] = 0;
		for(int i=1;i<=ind;i++) {
			int left = dp[ind-1] + Math.abs(arr[ind] - arr[ind-1]);
			int right = Integer.MAX_VALUE;
			if(ind > 1) {
				right = dp[ind-2] + Math.abs(arr[ind] - arr[ind-2]);
			}
			dp[ind] = Math.min(left, right);
		}

		return dp[ind];

	}
}
