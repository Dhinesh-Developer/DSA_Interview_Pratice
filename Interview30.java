package com.Interview;

import java.util.Arrays;

/* Total decode message
A message containing letters A-Z is being encoded to numbers using the following mapping:

'A' -> 1
'B' -> 2
...
'Z' -> 26

You are given a string digits. 
You have to determine the total number of ways that message can be decoded.
 * */
public class Interview30 {
	
	private static int decode(String s) {
		int[] dp = new int[s.length()];
		Arrays.fill(dp, -1);
		return solve(s,dp,0);
	}
	
	private static int solve(String s,int[] dp,int ind) {
		if (ind == s.length()) return 1;
        if (s.charAt(ind) == '0') return 0;
        if (dp[ind] != -1) return dp[ind];
        
        int res = solve(s, dp, ind + 1);
        
        if (ind + 1 < s.length()) {
            int num = (s.charAt(ind) - '0') * 10 + (s.charAt(ind + 1) - '0');
            if (num <= 26) {
                res += solve(s, dp, ind + 2);
            }
        }
        
        return dp[ind] = res;
	}
	
	public static void main(String[] args) {
		
		String s = "123";
		int res = decode(s);
		System.out.println(decode("123")); // 3
	}
}
