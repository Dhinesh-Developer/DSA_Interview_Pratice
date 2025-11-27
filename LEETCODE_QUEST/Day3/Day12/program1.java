package LEETCODE_QUEST.Day12;

import java.util.*;
/*
Q3. Merge Intervals
Given an array of intervals where intervals[i] = [starti, endi],
 merge all overlapping intervals, and return an array of the non-overlapping intervals
  that cover all the intervals in the input.

Example 1:

Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
Example 2:

Input: intervals = [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considered overlapping.
Example 3:

Input: intervals = [[4,7],[1,4]]
Output: [[1,7]]
Explanation: Intervals [1,4] and [4,7] are considered overlapping.


Constraints:

1 <= intervals.length <= 104
intervals[i].length == 2
0 <= starti <= endi <= 104
* */
public class program1 {
    class Solution {
        public int[][] merge(int[][] intervals) {
            int n = intervals.length;
            Arrays.sort(intervals,(a,b) -> a[0]-b[0]);
            List<int[]> li = new ArrayList<>();
            for(int i=0;i<n;i++){
                int start = intervals[i][0];
                int end = intervals[i][1];

                if(li.isEmpty() || li.get(li.size()-1)[1] < start){
                    li.add(new int[]{start,end});
                }
                else{
                    li.get(li.size()-1)[1] = Math.max(li.get(li.size()-1)[1],end);
                }
            }
            return li.toArray(new int[li.size()][]);
        }
    }
}
