package GFG.Day4;
/*
Sort 0s, 1s and 2s
Difficulty: MediumAccuracy: 50.58%Submissions: 818K+Points: 4Average Time: 10m
Given an array arr[] containing only 0s, 1s, and 2s. Sort the array in ascending order.
Note: You need to solve this problem without utilizing the built-in sort function.

Examples:

Input: arr[] = [0, 1, 2, 0, 1, 2]
Output: [0, 0, 1, 1, 2, 2]
Explanation: 0s, 1s and 2s are segregated into ascending order.
Input: arr[] = [0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1]
Output: [0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2]
Explanation: 0s, 1s and 2s are segregated into ascending order.
Follow up: Could you come up with a one-pass algorithm using only constant extra space?

Constraints:
1 ≤ arr.size() ≤ 106
0 ≤ arr[i] ≤ 2
* */
public class program1 {
    class Solution {
        public void sort012(int[] arr) {
            // code here
            int cnt0=0,cnt1=0,cnt2=0;
            for(int i=0;i<arr.length;i++){
                if(arr[i] == 0) cnt0++;
                else if(arr[i] == 1) cnt1++;
                else if(arr[i] == 2) cnt2++;
            }

            int ind = 0;
            for(int i=0;i<arr.length;i++){
                if(cnt0 > 0){
                    arr[ind++] = 0;
                    cnt0--;
                }
                else if(cnt1 > 0) {
                    arr[ind++] = 1;
                    cnt1--;
                }
                else if(cnt2 >0) {
                    arr[ind++] = 2;
                    cnt2--;
                }
            }
        }
    }
}
