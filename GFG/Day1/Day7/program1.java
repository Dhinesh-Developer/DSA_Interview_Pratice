package GFG.Day7;

import java.util.Arrays;
/*
Triplet Sum in Array
Difficulty: MediumAccuracy: 35.0%Submissions: 350K+Points: 4Average Time: 15m
Given an array arr[] and an integer target, determine if there exists a triplet in the array whose sum equals the given target.

Return true if such a triplet exists, otherwise, return false.

Examples:

Input: arr[] = [1, 4, 45, 6, 10, 8], target = 13
Output: true
Explanation: The triplet {1, 4, 8} sums up to 13.
Input: arr[] = [1, 2, 4, 3, 6, 7], target = 10
Output: true
Explanation: The triplets {1, 3, 6} and {1, 2, 7} both sum to 10.
Input: arr[] = [40, 20, 10, 3, 6, 7], target = 24
Output: false
Explanation: No triplet in the array sums to 24.
* */
public class program1 {
    class Solution {
        public boolean hasTripletSum(int arr[], int target) {
            // Approach 1:
            // int n = arr.length;
            // for(int i=0;i<n;i++){
            //     for(int j=i+1;j<n;j++){
            //         for(int k=j+1;k<n;k++){
            //             if(arr[i]+arr[j]+arr[k] == target){
            //                 return true;
            //             }
            //         }
            //     }
            // }
            // return false;

            // Approach 2:
            int n = arr.length;
            Arrays.sort(arr);
            for(int i=0;i<n;i++){
                int j=i+1;
                int k=n-1;
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
