package TUF.Day5;
/*Left Rotate Array by K Places
Given an integer array nums and a non-negative integer k, rotate the array to the left by k steps.
* */
public class program6 {
    class Solution {
        public void rotateArray(int[] nums, int k) {
            int n = nums.length;
            k = k%n;
            reverse(nums,0,k-1);
            reverse(nums,k,n-1);
            reverse(nums,0,n-1);
        }

        public static void reverse(int[] nums,int start,int end){
            while(start < end){
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }

    }
}
