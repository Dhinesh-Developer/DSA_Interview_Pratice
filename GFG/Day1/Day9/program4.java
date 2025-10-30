package GFG.Day9;
/*
Kadane's Algorithm
Difficulty: MediumAccuracy: 36.28%Submissions: 1.2MPoints: 4Average Time: 20m
You are given an integer array arr[].
You need to find the maximum sum of a subarray (containing at least one element) in the array arr[].

Note : A subarray is a continuous part of an array.

Examples:
Input: arr[] = [2, 3, -8, 7, -1, 2, 3]
Output: 11
Explanation: The subarray [7, -1, 2, 3] has the largest sum 11.

Input: arr[] = [-2, -4]
Output: -2
Explanation: The subarray [-2] has the largest sum -2.

Input: arr[] = [5, 4, 1, 7, 8]
Output: 25
Explanation: The subarray [5, 4, 1, 7, 8] has the largest sum 25.

Constraints:
1 ≤ arr.size() ≤ 105
-104 ≤ arr[i] ≤ 104


* */
public class program4 {
    class Solution {
        int maxSubarraySum(int[] arr) {

            // Approch 1 : passed
            //   int curSum = arr[0];
            //   int maxSum = arr[0];
            //   for(int i=1;i<arr.length;i++){
            //       curSum = Math.max(arr[i],curSum+arr[i]);
            //       maxSum = Math.max(curSum,maxSum);
            //   }
            //   return maxSum;

            // Approch 2: Kadane's Algorithm
            int curSum = 0;
            int maxSum = Integer.MIN_VALUE;
            for(int i=0;i<arr.length;i++){
                curSum += arr[i];
                if(curSum > maxSum){
                    maxSum = curSum;
                }
                if(curSum < 0){
                    curSum = 0;
                }
            }
            return maxSum;

        }
    }

}
