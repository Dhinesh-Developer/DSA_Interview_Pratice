package TUF.Day5;
/* Linear search

* Given an array of integers nums and an integer target,
*  find the smallest index (0 based indexing) where the target appears in the array.
*  If the target is not found in the array, return -1.*/
public class program1 {
    class Solution {
        public int linearSearch(int nums[], int target) {
            int n = nums.length;
            for(int i=0;i<n;i++){
                if(nums[i] == target){
                    return i;
                }
            }
            return -1;
        }
    }
}
