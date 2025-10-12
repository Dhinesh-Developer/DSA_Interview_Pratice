package com.tuf.dp;

import java.util.Arrays;

/*
Input: money = [2, 1, 4, 9]
Output: 10

Explanation:
[2, 1, 4, 9] The underlined houses would give the maximum loot.
Note that we cannot loot the 1st and 4th houses together. 
 * */
public class program4 {
	public static void main(String[] args) {
		
		int[] arr = {2,1,4,9};
		int res = houseRobber(arr);
		System.out.println("maximum amount of money that the robber can loot without alerting the police: "+res);
	}
	
	static int f(int ind,int[] ar,int[] dp) {
		if(ind == 0) return ar[0];
		if(ind < 0) return 0;
		
		if(dp[ind] != -1) {
			return dp[ind];
		}
		
		int pick = ar[ind] + f(ind-2,ar,dp);
		
		// not pick
		int notPick = 0 + f(ind-1,ar,dp);
		return Math.max(pick, notPick);
	}
	
	static int houseRobber(int[] arr) {
		int n = arr.length;
		if(n == 1) return arr[0];
		if(n == 0) return 0;
		
		int[] ar1 = new int[n];
		int[] ar2 = new int[n];
		for(int i=0;i<n;i++) {
			if(i!=n-1) {
				ar1[i] = arr[i];
			}
			if(i!=0) {
				ar2[i-1] = arr[i];
			}
		}
		
		int[] dp1 = new int[n+1];
		Arrays.fill(dp1, -1);
		int res1 = f(ar1.length-1,ar1,dp1);
		
		int[] dp2 = new int[n+1];
		Arrays.fill(dp2, -1);
		int res2 = f(ar2.length-1,ar2,dp2);
		
		return Math.max(res1, res2);
	}
}
