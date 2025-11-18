package LEETCODE_QUEST.Day4;
import java.util.*;
/*
Q3. Largest Rectangle in Histogram
Solved
Hard
Topics
premium lock icon
Companies
Given an array of integers heights representing the histogram's bar height where the width of each bar is 1,
 return the area of the largest rectangle in the histogram.

Example 1:


Input: heights = [2,1,5,6,2,3]
Output: 10
Explanation: The above is a histogram where width of each bar is 1.
The largest rectangle is shown in the red area, which has an area = 10 units.
Example 2:


Input: heights = [2,4]
Output: 4


Cons
* */
public class program3 {
    class Solution {
        private int[] findNSE(int[] arr){
            int n = arr.length;
            int[] ans = new int[n];
            Stack<Integer> st = new Stack<>();
            for(int i=n-1;i>=0;i--){
                int currEle = arr[i];
                while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                    st.pop();
                }
                ans[i] = !st.isEmpty()?st.peek():n;
                st.push(i);
            }
            return ans;
        }

        private int[] findPSE(int[] arr){
            int n = arr.length;
            int[] ans = new int[n];
            Stack<Integer> st = new Stack<>();
            for(int i=0;i<n;i++){
                int currEle = arr[i];
                while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                    st.pop();
                }
                ans[i] = !st.isEmpty()?st.peek():-1;
                st.push(i);
            }
            return ans;
        }
        public int largestRectangleArea(int[] heights) {
            int[] nse = findNSE(heights);
            int[] pse = findPSE(heights);

            int total = 0;
            int area;
            for(int i=0;i<heights.length;i++){
                area = heights[i]*(nse[i]-pse[i]-1);
                total = Math.max(total,area);
            }
            return total;
        }
    }
}
