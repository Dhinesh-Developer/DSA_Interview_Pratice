package LEETCODE_QUEST.Day15;
import java.util.*;
/*
Q1. Beautiful Array

An array nums of length n is beautiful if:
nums is a permutation of the integers in the range [1, n].
For every 0 <= i < j < n, there is no index k with i < k < j where 2 * nums[k] == nums[i] + nums[j].
Given the integer n, return any beautiful array nums of length n.
 There will be at least one valid answer for the given n.



Example 1:

Input: n = 4
Output: [2,1,4,3]
Example 2:

Input: n = 5
Output: [3,1,2,5,4]


Constraints:

1 <= n <= 1000
* */
public class program1 {
    class Solution {
        public int[] beautifulArray(int n) {
            List<Integer> res = helper(n);
            int[] ans = new int[n];
            for (int i = 0; i < n; i++) {
                ans[i] = res.get(i);
            }
            return ans;
        }

        private List<Integer> helper(int n) {
            List<Integer> ans= new ArrayList<>();
            if (n == 1) {
                ans.add(1);
                return ans;
            }

            List<Integer> odd = helper((n +1) / 2);
            for (int x :odd) ans.add(2 * x- 1);

            List<Integer> even = helper(n / 2);
            for (int x: even) ans.add(2* x);

            return ans;
        }
    }

}
