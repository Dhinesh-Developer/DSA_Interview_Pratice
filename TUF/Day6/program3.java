package TUF.Day6;
/* Upper bound
Given a sorted array of nums and an integer x, write a program to find the upper bound of x
The upper bound of x is defined as the smallest index i such that nums[i] > x.
If no such index is found, return the size of the array.
* */
public class program3 {
    class Solution {
        public int upperBound(int[] nums, int x) {
            int n = nums.length;
            int low = 0;
            int high = n-1;
            int ans = n;
            while(low <= high){
                int mid = (low+high)/2;
                if(nums[mid] > x){
                    ans = mid;
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }
            return ans;
        }
    }

}
