package LEETCODE_QUEST.Day34;
/*
416. Partition Equal Subset Sum

Given an integer array nums, return true if you can partition the array into two subsets such that the
 sum of the elements in both subsets is equal or false otherwise.

Example 1:

Input: nums = [1,5,11,5]
Output: true
Explanation: The array can be partitioned as [1, 5, 5] and [11].
Example 2:

Input: nums = [1,2,3,5]
Output: false
Explanation: The array cannot be partitioned into equal sum subsets.


Constraints:

1 <= nums.length <= 200
1 <= nums[i] <= 100
* */
public class program3 {
    class Solution {

        private boolean func(int ind,int k,int[][] dp,int[] nums){
            if(k==0) return true;

            if(ind == 0){
                return nums[0] == k;
            }

            if(dp[ind][k] != -1){
                return dp[ind][k] == 0?false:true;
            }

            boolean notTake = func(ind-1,k,dp,nums);
            boolean take = false;
            if(nums[ind] <= k){
                take=  func(ind-1,k-nums[ind],dp,nums);
            }

            dp[ind][k] = take||notTake?1:0;
            return take||notTake;
        }
        public boolean canPartition(int[] nums) {
            int total = 0;
            for(int i=0;i<nums.length;i++){
                total += nums[i];
            }

            int n = nums.length;
            if(total % 2==1) return false;
            else{
                int k = total/2;
                int[][] dp = new int[n][k+1];
                for(int[] x: dp){
                    Arrays.fill(x,-1);
                }

                return func(n-1,k,dp,nums);
            }
        }
    }
}
