package GFG.Day3;
/*
Missing in Array
Difficulty: EasyAccuracy: 29.59%Submissions: 1.5MPoints: 2Average Time: 15m
You are given an array arr[] of size n - 1 that contains distinct integers in the range from 1 to n (inclusive). This array represents a permutation of the integers from 1 to n with one element missing. Your task is to identify and return the missing element.

Examples:

Input: arr[] = [1, 2, 3, 5]
Output: 4
Explanation: All the numbers from 1 to 5 are present except 4.
Input: arr[] = [8, 2, 4, 5, 3, 7, 1]
Output: 6
Explanation: All the numbers from 1 to 8 are present except 6.
* */
public class program2 {
    class Solution {
        int missingNum(int arr[]) {
            // code here

            int n = arr.length+1;
            int sum = n*(n+1)/2;

            int cnt = 0;
            for(int i=0;i<arr.length;i++){
                cnt += arr[i];
            }

            return sum-cnt;
        }
    }
}
