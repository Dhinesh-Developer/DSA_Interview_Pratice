package LEETCODE_QUEST.Day13;
/*
Q1. Peak Index in a Mountain Array
You are given an integer mountain array arr of length n where the values increase to a peak element and then decrease.
Return the index of the peak element.
Your task is to solve it in O(log(n)) time complexity.

Example 1:
Input: arr = [0,1,0]
Output: 1

Example 2:
Input: arr = [0,2,1,0]
Output: 1

Example 3:
Input: arr = [0,10,5,2]
Output: 1

Constraints:

3 <= arr.length <= 105
0 <= arr[i] <= 106
arr is guaranteed to be a mountain array.
* */
public class program4 {
    class Solution {
        public int peakIndexInMountainArray(int[] arr) {
            int n = arr.length;
            int index = -1;
            for(int i=1;i<n-1;i++){
                if(arr[i] > arr[i-1] && arr[i] > arr[i+1]){
                    index = i;
                }
            }
            return index;
        }
    }
}
