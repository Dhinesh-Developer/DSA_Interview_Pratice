package GFG.Day4;
/*
Rotate Array by One
Difficulty: BasicAccuracy: 69.6%Submissions: 341K+Points: 1Average Time: 20m
Given an array arr, rotate the array by one position in clockwise direction.

Examples:

Input: arr[] = [1, 2, 3, 4, 5]
Output: [5, 1, 2, 3, 4]
Explanation: If we rotate arr by one position in clockwise 5 come to the front and remaining those are shifted to the end.
Input: arr[] = [9, 8, 7, 6, 4, 2, 1, 3]
Output: [3, 9, 8, 7, 6, 4, 2, 1]
Explanation: After rotating clock-wise 3 comes in first position.
* */
public class program3 {
    // // User function Template for Java

    class Solution {
        public void rotate(int[] arr) {
            if(arr.length == 1){
                return;
            }

            int temp = arr[arr.length-1];
            for(int i=arr.length-2;i>=0;i--){
                arr[i+1] = arr[i];
            }

            arr[0] = temp;
        }
    }
}
