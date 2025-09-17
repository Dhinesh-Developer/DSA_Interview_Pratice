package com.dk.Top100;
/* Binary search
Given an array of integers nums which is sorted in ascending order,
and an integer target, write a function to search target in nums.
If target exists, then return its index. Otherwise, return -1.

You must write an algorithm with O(log n) runtime complexity.
* */
public class T5 {
    private static int binarySearch(int[] nums,int target){
        int n = nums.length-1;
        int low =0 ,high = n-1;
        while(low <= high){
            int mid = (low+high)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        int ind = binarySearch(nums,target);
        System.out.println(ind);
    }
}
