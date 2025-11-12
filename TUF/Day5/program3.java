package TUF.Day5;
/* Second Largest Element
Given an array of integers nums, return the second-largest element in the array.
 If the second-largest element does not exist, return -1.
* */
public class program3 {
    class Solution {
        public int secondLargestElement(int[] nums) {
            int largest = nums[0];
            int sLargest = -1;
            int n = nums.length;
            for(int i=0;i<n;i++){
                if(nums[i] > largest){
                    sLargest = largest;
                    largest = nums[i];
                }else if(nums[i] > sLargest && nums[i] != largest){
                    sLargest = nums[i];
                }
            }
            return sLargest;
        }
    }
}
