package TUF.Day1;
/*
Search X in sorted array


127

100
Easy


Given a sorted array of integers nums with 0-based indexing, find the index of a specified target integer. If the target is found in the array, return its index. If the target is not found, return -1.


Examples:
Input: nums = [-1,0,3,5,9,12], target = 9

Output: 4

Explanation: The target integer 9 exists in nums and its index is 4

Input: nums = [-1,0,3,5,9,12], target = 2

Output: -1

Explanation: The target integer 2 does not exist in nums so return -1

Input: nums = [-1,0,3,5,9,12], target = -1

Output:
0
Constraints:
  1 <= nums.length <= 105
  -105 < nums[i], target < 105
  nums is sorted in ascending order.

Similar Problems
* */
public class program1 {
    class Solution {
        public int search(int[] nums, int target) {
            int n = nums.length;
            int low = 0;
            int high = nums.length-1;
            while(low <= high){
                int mid = low+(high-low)/2;
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
    }
}
