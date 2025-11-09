package TUF.Day2;

import java.util.ArrayList;
/*
Find minimum in Rotated Sorted Array

Given an integer array nums of size N, sorted in ascending order with distinct values,
 and then rotated an unknown number of times (between 1 and N), find the minimum element in the array.


Examples:
Input : nums = [4, 5, 6, 7, 0, 1, 2, 3]
Output: 0

Explanation: Here, the element 0 is the minimum element in the array.

Input : nums = [3, 4, 5, 1, 2]
Output: 1

Explanation:Here, the element 1 is the minimum element in the array.
* */
public class program4 {
    class Solution {
        public int findMin(ArrayList<Integer> arr) {
            int low =0;
            int high = arr.size()-1;
            int ans = Integer.MAX_VALUE;
            while(low <= high){
                int mid = low + (high-low) /2;

                // check for sorted half and picking the smallest among them
                if(arr.get(low) <= arr.get(mid)){
                    ans = Math.min(ans,arr.get(low));
                    low = mid+1;
                }else{
                    ans = Math.min(ans,arr.get(mid));
                    high = mid-1;
                }
            }
            return ans;
        }
    }

}
