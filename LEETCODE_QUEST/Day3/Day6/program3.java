package LEETCODE_QUEST.Day6;

import java.util.Collections;
import java.util.PriorityQueue;
/*
Q3. Construct Target Array With Multiple Sums
You are given an array target of n integers. From a starting array arr consisting of n 1's,
 you may perform the following procedure :

let x be the sum of all elements currently in your array.
choose index i, such that 0 <= i < n and set the value of arr at index i to x.
You may repeat this procedure as many times as needed.
Return true if it is possible to construct the target array from arr, otherwise, return false.



Example 1:

Input: target = [9,3,5]
Output: true
Explanation: Start with arr = [1, 1, 1]
[1, 1, 1], sum = 3 choose index 1
[1, 3, 1], sum = 5 choose index 2
[1, 3, 5], sum = 9 choose index 0
[9, 3, 5] Done
Example 2:

Input: target = [1,1,1,2]
Output: false
Explanation: Impossible to create target array from [1,1,1,1].
Example 3:

Input: target = [8,5]
Output: true


Constraints:

n == target.length
1 <= n <= 5 * 104
* */
public class program3 {
    class Solution {
        public boolean isPossible(int[] target) {
            long total = 0;
            PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

            for(int x :target) {
                maxHeap.add(x);
                total += x;
            }

            while (true) {
                int maxVal = maxHeap.poll();
                long rest = total - maxVal;
                if (maxVal == 1 || rest == 1)
                    return true;
                if (rest == 0 || maxVal <= rest)
                    return false;
                long prev = maxVal % rest;

                if (prev == 0)
                    return false;

                total = rest + prev;
                maxHeap.add((int) prev);
            }
        }
    }

}
