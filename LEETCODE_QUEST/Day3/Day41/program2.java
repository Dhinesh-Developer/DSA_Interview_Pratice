package LEETCODE_QUEST.Day41;
import java.util.*;
/*
Q2. Target Sum

You are given an integer array nums and an integer target.

You want to build an expression out of nums by adding one of the symbols '+' and '-'
before each integer in nums and then concatenate all the integers.

For example, if nums = [2, 1], you can add a '+' before 2 and a '-' before 1 and concatenate them to build the expression
 "+2-1".
Return the number of different expressions that you can build, which evaluates to target.



Example 1:

Input: nums = [1,1,1,1,1], target = 3
Output: 5
Explanation: There are 5 ways to assign symbols to make the sum of nums be target 3.
-1 + 1 + 1 + 1 + 1 = 3
+1 - 1 + 1 + 1 + 1 = 3
+1 + 1 - 1 + 1 + 1 = 3
+1 + 1 + 1 - 1 + 1 = 3
+1 + 1 + 1 + 1 - 1 = 3
Example 2:

Input: nums = [1], target = 1
Output: 1


Constraints:

1 <= nums.length <= 20
0 <= nums[i] <= 1000
0 <= sum(nums[i]) <= 1000
-1000 <= target <= 1000
* */

public class program2 {
    class Solution {
        int[][]t;
        public int findTargetSumWays(int[] nums, int target) {
            int sum=0;
            for(int i:nums){
                sum+=i;
            }
            if(sum<Math.abs(target))  return 0;
            if((target+sum) %2 !=0) return 0;
            int equi_sum=(target+sum)/2;

            int n=nums.length;
            t=new int[n+1][equi_sum+1];
            for(int i=0;i<n;i++){
                Arrays.fill(t[i],-1);
            }
            return t[n][equi_sum]=find_count(nums,equi_sum,n-1,t);
        }
        public int find_count(int[]nums,int target,int index,int[][]t){
            if(index<0)
                return (target==0) ? 1:0;

            if(t[index][target]!=-1)
                return t[index][target];

            int ways=0;

            if(nums[index]<=target){
                ways+=find_count(nums,target-nums[index],index-1,t);
            }
            ways+=find_count(nums,target,index-1,t);

            return t[index][target]=ways;
        }
    }
}
