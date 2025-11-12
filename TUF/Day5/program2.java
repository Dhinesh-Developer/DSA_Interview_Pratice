package TUF.Day5;
/* Largest Element
* Given an array of integers nums, return the value of the largest element in the array*/
public class program2 {
    class Solution {
        public int largestElement(int[] nums) {
            int largest = Integer.MIN_VALUE;
            int n = nums.length;
            for(int i=0;i<n;i++){
                if(nums[i] > largest){
                    largest = nums[i];
                }
            }
            return largest;
        }
    }
}
