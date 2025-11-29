package LEETCODE_QUEST.Day14;
import java.util.*;
/*
Q2. Sort an Array

Given an array of integers nums, sort the array in ascending order and return it.
You must solve the problem without using any built-in functions in O(nlog(n)) time complexity and
 with the smallest space complexity possible.



Example 1:
Input: nums = [5,2,3,1]
Output: [1,2,3,5]
Explanation: After sorting the array, the positions of some numbers are not changed (for example, 2 and 3), while the positions of other numbers are changed (for example, 1 and 5).
Example 2:
Input: nums = [5,1,1,2,0,0]
Output: [0,0,1,1,2,5]
Explanation: Note that the values of nums are not necessarily unique.


Constraints:

1 <= nums.length <= 5 * 104
-5 * 104 <= nums[i] <= 5 * 104
* */
public class program2 {
    class Solution {
        public void merge(int[] nums,int low,int mid,int high){
            List<Integer> li = new ArrayList<>();
            int left = low;
            int right = mid+1;
            while(left <= mid && right <=high){
                if(nums[left] <= nums[right]){
                    li.add(nums[left]);
                    left++;
                }else{
                    li.add(nums[right]);
                    right++;
                }
            }

            while(left<=mid){
                li.add(nums[left]);
                left++;
            }
            while(right<=high){
                li.add(nums[right]);
                right++;
            }

            for(int i=low;i<=high;i++){
                nums[i] = li.get(i-low);
            }
        }
        public void mergeHelper(int[] nums,int low,int high){
            if(low >= high) return;
            int mid = low + (high-low)/2;
            mergeHelper(nums,low,mid);
            mergeHelper(nums,mid+1,high);
            merge(nums,low,mid,high);
        }
        public int[] sortArray(int[] nums) {
            int n = nums.length;
            mergeHelper(nums,0,n-1);
            return nums;
        }
    }
}
