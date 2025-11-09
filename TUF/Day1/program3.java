package TUF.Day1;
/*
Upper Bound

Given a sorted array of nums and an integer x, write a program to find the upper bound of x.
The upper bound of x is defined as the smallest index i such that nums[i] > x.
If no such index is found, return the size of the array.
Examples:
Input : n= 4, nums = [1,2,2,3], x = 2
Output:3
Explanation:
Index 3 is the smallest index such that arr[3] > x.
* */
public class program3 {
    class Solution {
        public int upperBound(int[] nums, int x) {
            int n = nums.length;
            int low = 0,high = n-1,ans = n;
            while(low <= high){
                int mid = low+(high - low)/2;
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
