package TUF.Day6;
/*Search X in sorted array
Given a sorted array of integers nums with 0-based indexing,
find the index of a specified target integer. If the target is found in the array,
 return its index. If the target is not found, return -1.
* */
public class program1 {
    class Solution {
        public int search(int[] nums, int target) {
            int n = nums.length;
            int low =0;
            int high = nums.length-1;
            while(low <= high){
                int mid = (low+high)/2;
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
