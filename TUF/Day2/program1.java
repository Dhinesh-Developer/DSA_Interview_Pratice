package TUF.Day2;
/*
First and last occurrence


117

100
Easy


Given an array of integers nums sorted in non-decreasing order,
 find the starting and ending position of a given target value.
 If the target is not found in the array, return [-1, -1].
Examples:
Input: nums = [5, 7, 7, 8, 8, 10], target = 8

Output: [3, 4]

Explanation:The target is 8, and it appears in the array at indices 3 and 4, so the output is [3,4]

Input: nums = [5, 7, 7, 8, 8, 10], target = 6

Output: [-1, -1]

Expalantion: The target is 6, which is not present in the array. Therefore, the output is [-1, -1].

Input: nums = [5, 7, 7, 8, 8, 10], target = 5

Output:
[0, 0]
Constraints:
  0 <= nums.length <= 105
  -109 <= nums[i] <= 109
  nums is a non-decreasing array.
  -109 <= target <= 109
* */
public class program1 {
    class Solution {
        public int lowerBound(int[] nums,int n,int target){
            int low = 0;
            int high = n-1;
            int ans = n;
            while(low <= high){
                int mid = low + (high - low) /2;
                if(nums[mid] >= target){
                    ans = mid;
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }
            return ans;
        }

        public int upperBound(int[] nums,int n,int target){
            int low = 0;
            int high = n-1;
            int ans = n;
            while(low <= high){
                int mid = low + (high-low)/2;
                if(nums[mid] > target){
                    ans = mid;
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }
            return ans;
        }
        public int[] searchRange(int[] nums, int target) {
            int n = nums.length;
            int lb = lowerBound(nums,n,target);
            if(lb == n || nums[lb] != target){
                return new int[]{-1,-1};
            }
            return new int[]{lb,upperBound(nums,n,target)-1};
        }
    }
}
