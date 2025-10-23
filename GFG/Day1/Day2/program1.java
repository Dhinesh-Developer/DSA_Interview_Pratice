package GFG.Day2;

import java.util.ArrayList;
/*
Min and Max in Array
Difficulty: BasicAccuracy: 68.55%Submissions: 385K+Points: 1Average Time: 10m
Given an array arr[]. Your task is to find the minimum and maximum elements in the array.

Examples:

Input: arr[] = [1, 4, 3, -5, -4, 8, 6]
Output: [-5, 8]
Explanation: minimum and maximum elements of array are -5 and 8.
Input: arr[] = [12, 3, 15, 7, 9]
Output: [3, 15]
Explanation: minimum and maximum element of array are 3 and 15.
Constraints:
1 ≤ arr.size() ≤ 105
1 ≤ arr[i] ≤ 109
* */
public class program1 {
    class Solution {
        public ArrayList<Integer> getMinMax(int[] arr) {
            // code Here
            ArrayList<Integer> li = new ArrayList<>();
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;

            for(int i=0;i<arr.length;i++){
                if(arr[i] > max){
                    max = arr[i];
                }

                if(arr[i] < min){
                    min = arr[i];
                }
            }

            li.add(min);
            li.add(max);


            return li;
        }
    }

}
