package com.dk;

import java.util.ArrayList;
import java.util.List;

// Median of two sorted array.
/*
*Given two sorted arrays nums1 and nums2 of size m and n respectively,
*  return the median of the two sorted arrays.
The overall run time complexity should be O(log (m+n)).

Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
* */
public class program31 {

    private static double findMedian(int[] nums1,int[] nums2){
        List<Integer> li = new ArrayList<>();
        for(int x : nums1) li.add(x);
        for(int x : nums2) li.add(x);

        int res = 0;
        int n = li.size();
        for(int x : li){
            res += x;
        }

        return (double) res/n;
    }

    public static void main(String[] args) {

        int[] nums1 = {1,3};
        int[] nums2 = {2};
        double res = findMedian(nums1,nums2);
        System.out.println(res); // 2.0

    }
}
