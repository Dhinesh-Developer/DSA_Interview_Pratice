package GFG.Day7;

import java.util.Arrays;
/*
Find triplets with zero sum
Difficulty: MediumAccuracy: 25.81%Submissions: 349K+Points: 4Average Time: 20m
Given an array arr[] of integers, determine whether it contains a triplet whose sum equals zero. Return true if such a triplet exists, otherwise, return false.

Examples:

Input: arr[] = [0, -1, 2, -3, 1]
Output: true
Explanation: The triplet [0, -1, 1] has a sum equal to zero.
Input: arr[] = [1, 2, 3]
Output: false
Explanation: No triplet with a sum of zero exists.
Input: arr[] = [-5, 3, 2, -1, 0, 1]
Output: true
Explanation: The triplet [-5, 3, 2] has a sum equal to zero.
Constraints:
1 ≤ arr.size() ≤ 103
-106 ≤ arr[i] ≤ 106
* */
public class program2 {
    class Solution {
        public boolean findTriplets(int[] arr) {
            int n = arr.length;
            // Approach 1: working
            // for(int i=0;i<n;i++){
            //     for(int j=i+1;j<n;j++){
            //         for(int k=j+1;k<n;k++){
            //             if(arr[i]+arr[j]+arr[k] == 0){
            //                 return true;
            //             }
            //         }
            //     }
            // }

            // return false;

            // Approach 2:
            int target = 0;
            Arrays.sort(arr);
            for(int i=0;i<n;i++){
                int j = i+1;
                int k = n-1;
                while(j < k){
                    int sum = arr[i]+arr[j]+arr[k];
                    if(sum < target) j++;
                    else if(sum > target) k--;
                    else return true;
                }
            }
            return false;
        }
    }
}
