package TUF.Day3;
/*
Single element in sorted array
Given an array nums sorted in non-decreasing order.
Every number in the array except one appears twice.
 Find the single number in the array.


Examples:
Input :nums = [1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6]
Output:4

Explanation: Only the number 4 appears once in the array.

Input : nums = [1, 1, 3, 5, 5]
Output:3

Explanation: Only the number 3 appears once in the array.

Input :nums = [1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7]
Output:
7
Constraints:
  n == nums.length
  1 <= n <= 104
  -104 <= nums[i] <= 104
* */
public class program2 {
    class Solution {
        public int singleNonDuplicate(int[] nums) {
            int n = nums.length;
            if(n == 0) return nums[0];
            if(nums[0] != nums[1]) return nums[0];
            if(nums[n-1] != nums[n-2]) return nums[n-1];
            int low = 1;
            int high = n-2;
            while( low <= high){
                int mid = low + (high - low) /2;

                // check for mid case
                if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1]){
                    return nums[mid];
                }

                // left half
                if((mid % 2==1) && nums[mid-1] == nums[mid] ||
                        (mid % 2== 0 && nums[mid+1] == nums[mid])){
                    low = mid+1;
                }
                // right half
                else{
                    high = mid+1;
                }
            }
            return -1;
        }
    }
}
