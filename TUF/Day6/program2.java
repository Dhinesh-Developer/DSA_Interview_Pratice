package TUF.Day6;
/* Lower bound
Given a sorted array of nums and an integer x, write a program to find the lower bound of x.
The lower bound algorithm finds the first and smallest index in a sorted array
where the value at that index is greater than or equal to a given key i.e. x.
If no such index is found, return the size of the array.
* */
public class program2 {
    class Solution {
        public int lowerBound(int[] nums, int x) {
            int n = nums.length;
            int low = 0;
            int high = n-1;
            int ans = n;
            while(low <= high){
                int mid = (low+high)/2;
                if(nums[mid] >= x){
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
