package LEETCODE_QUEST.Day6;
import java.util.*;
/*
Q2. Find K Pairs with Smallest Sums
Solved
Medium
Topics
premium lock icon
Companies
You are given two integer arrays nums1 and nums2 sorted in non-decreasing order and an integer k.

Define a pair (u, v) which consists of one element from the first array and one element from the second array.

Return the k pairs (u1, v1), (u2, v2), ..., (uk, vk) with the smallest sums.



Example 1:

Input: nums1 = [1,7,11], nums2 = [2,4,6], k = 3
Output: [[1,2],[1,4],[1,6]]
Explanation: The first 3 pairs are returned from the sequence: [1,2],[1,4],[1,6],[7,2],[7,4],[11,2],[7,6],[11,4],[11,6]
Example 2:

Input: nums1 = [1,1,2], nums2 = [1,2,3], k = 2
Output: [[1,1],[1,1]]
Explanation: The first 2 pairs are returned from the sequence: [1,1],[1,1],[1,2],[2,1],[1,2],[2,2],[1,3],[1,3],[2,3]


Constraints:

1 <= nums1.length, nums2.length <= 105
-109 <= nums1[i], nums2[i] <= 109
nums1 and nums2 both are sorted in non-decreasing order.
* */
public class program2 {
    class Solution {
        public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
            List<List<Integer>> result = new ArrayList<>();
            if (nums1.length == 0 || nums2.length == 0 || k == 0) return result;
            PriorityQueue<int[]> pq = new PriorityQueue<>(
                    (a, b) -> (nums1[a[0]] + nums2[a[1]]) - (nums1[b[0]] + nums2[b[1]])
            );
            for (int i = 0; i < Math.min(k, nums1.length); i++) {
                pq.add(new int[]{i, 0});
            }

            while (k > 0 && !pq.isEmpty()) {
                int[] top = pq.poll();
                int i = top[0], j = top[1];

                result.add(Arrays.asList(nums1[i], nums2[j]));
                k--;

                // Push next pair in the row: (nums1[i], nums2[j+1])
                if (j + 1 < nums2.length) {
                    pq.add(new int[]{i, j + 1});
                }
            }

            return result;
        }
    }

}
