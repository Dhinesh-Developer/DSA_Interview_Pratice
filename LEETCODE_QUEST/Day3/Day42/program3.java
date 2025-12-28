package LEETCODE_QUEST.Day42;

import java.util.Arrays;
/*
Q1. K-Concatenation Maximum Sum

Given an integer array arr and an integer k, modify the array by repeating it k times.

For example, if arr = [1, 2] and k = 3 then the modified array will be [1, 2, 1, 2, 1, 2].

Return the maximum sub-array sum in the modified array. Note that the length of the sub-array can be 0 and its sum in that case is 0.

As the answer can be very large, return the answer modulo 109 + 7.



Example 1:

Input: arr = [1,2], k = 3
Output: 9
Example 2:

Input: arr = [1,-2,1], k = 5
Output: 2
Example 3:

Input: arr = [-1,-2], k = 7
Output: 0


Constraints:

1 <= arr.length <= 105
1 <= k <= 105
-104 <= arr[i] <= 104
 
* */
public class program3 {
    class Solution {
        public int kConcatenationMaxSum(int[] arr, int k) {
            final int MOD = 1000000007;
            long sumOfArray = Arrays.stream(arr).sum();
            if (k == 1) {
                return Math.max((int) kadane(arr), 0);
            } else {
                int[] newArr = new int[arr.length * 2];
                int index = 0;
                for (int j = 0; j < 2; j++) {
                    for (int x : arr) {
                        newArr[index++] = x;
                    }
                }
                long newKadane = kadane(newArr);
                if (newKadane < 0) {
                    return 0;
                } else if (sumOfArray < 0) {
                    return (int) (newKadane % MOD);
                } else {
                    return (int) ((newKadane + ((k - 2) * sumOfArray) % MOD) % MOD);
                }
            }
        }

        public long kadane(int[] arr) {
            final int MOD = 1000000007;
            long res = arr[0];
            long max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                max = Math.max(max + arr[i], arr[i]);
                res = Math.max(res, max);
            }
            return res;
        }
    }
}
