package LEETCODE_QUEST.Day41;
import java.util.*;
/*
Q1. Climbing Stairs
You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Example 1:

Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
Example 2:

Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step


Constraints:

1 <= n <= 45


* */
public class program1 {
    class Solution {

        private int func(int ind,int[] dp){
            if(ind <=2) return ind;
            if(dp[ind] != -1){
                return dp[ind];
            }
            int left = func(ind-1,dp);
            int right = func(ind-2,dp);
            return dp[ind] = left+right;

        }
        public int climbStairs(int n) {
            if(n <=2) return n;
            int[] dp = new int[n+1];
            Arrays.fill(dp,-1);
            return func(n,dp);
        }
    }
}
