package TUF.Day1;
/* Floor and Ceil in Sorted Array
Given a sorted array nums and an integer x. Find the floor and ceil of x in nums.
 The floor of x is the largest element in the array which is smaller than or equal to x.
  The ceiling of x is the smallest element in the array greater than or equal to x.
   If no floor or ceil exists, output -1.

Examples:
Input : nums =[3, 4, 4, 7, 8, 10], x= 5

Output: 4 7

Explanation: The floor of 5 in the array is 4, and the ceiling of 5 in the array is 7.
* */
public class program5 {
    class Solution {

        public int findFloor(int[] nums,int x){
            int n = nums.length;
            int low = 0;
            int high = n-1;
            int ans = -1;
            while(low <= high){
                int mid = low + (high - low) /2;
                if(nums[mid] <= x){
                    ans = nums[mid];
                    low = mid+1;
                }else{
                    high = mid-1;
                }
            }
            return ans;
        }

        public int findCeil(int[] nums,int x){
            int n = nums.length;
            int low=0,high=n-1,ans = -1;
            while(low <= high){
                int mid = low + (high - low)/2;
                if(nums[mid] >= x){
                    ans = nums[mid];
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }
            return ans;
        }

        public int[] getFloorAndCeil(int[] nums, int x) {

            int floor = findFloor(nums,x);
            int ceil = findCeil(nums,x);
            int[] res = {floor,ceil};
            return res;

        }
    }
}
