package TUF.Day3;

import java.util.ArrayList;
/*
Find out how many times the array is rotated


89

100
Easy


Given an integer array nums of size n, sorted in ascending order with distinct values.
 The array has been right rotated an unknown number of times, between 0 and n-1 (including).
 Determine the number of rotations performed on the array.

Examples:
Input : nums = [4, 5, 6, 7, 0, 1, 2, 3]
Output: 4

Explanation: The original array should be [0, 1, 2, 3, 4, 5, 6, 7]. So, we can notice that the array has been rotated 4 times.
Input: nums = [3, 4, 5, 1, 2]

Output: 3

Explanation: The original array should be [1, 2, 3, 4, 5]. So, we can notice that the array has been rotated 3 times.

Input: nums = [4, 5, 1, 2]

Output:
2
Constraints:
 n == nums.length
 1 <= n <= 104
 -104 <= nums[i] <= 104
 All the integers of nums are unique.
* */
public class program1 {
    class Solution {
        public int findKRotation(ArrayList<Integer> nums) {
            int n = nums.size();
            int low = 0;
            int high = n-1;
            int ans = Integer.MAX_VALUE;
            int index = -1;
            while(low <= high){
                int mid = low + (high - low) /2;


                if(nums.get(low) <= nums.get(high)){
                    if(nums.get(low) < ans){
                        index = low;
                        ans = nums.get(low);
                    }
                    break;
                }
                if(nums.get(low) <= nums.get(mid)){
                    if(nums.get(low) < ans){
                        index = low;
                        ans = nums.get(low);
                    }
                    low = mid+1;
                }
                else{
                    if(nums.get(mid) < ans){
                        index = mid;
                        ans = nums.get(mid);
                    }
                    high = mid-1;
                }
            }
            return index;
        }
    }
}
