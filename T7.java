package com.dk.Top100;
/* Single number
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.
Example 1:

Input: nums = [2,2,1]

Output: 1

Example 2:

Input: nums = [4,1,2,1,2]

Output: 4
*/
public class T7 {

    private static int singleNumber(int[] nums){
        int res = 0;
        for(int i=0;i<nums.length;i++){
            res ^= nums[i];
        }
        return res;
    }
    public static void main(String[] args) {

        int[] nums = {2,2,1};
        int res = singleNumber(nums);
        System.out.println(res); // 1
    }
}
