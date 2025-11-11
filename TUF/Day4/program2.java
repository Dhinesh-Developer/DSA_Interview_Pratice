package TUF.Day4;
/*
Minimum days to make M bouquets
Given n roses and an array nums where nums[i] denotes that the 'ith' rose will bloom on the nums[i]th day,
 only adjacent bloomed roses can be picked to make a bouquet. Exactly k adjacent bloomed roses
 are required to make a single bouquet. Find the minimum number of days required to make at least m bouquets,
  each containing k roses. Return -1 if it is not possible.

Examples:
Input: n = 8, nums = [7, 7, 7, 7, 13, 11, 12, 7], m = 2, k = 3
Output: 12
Explanation: On the 12th the first 4 flowers and the last 3 flowers would have already bloomed. So, we can easily make 2 bouquets, one with the first 3 and another with the last 3 flowers.

Input: n = 5, nums = [1, 10, 3, 10, 2], m = 3, k = 2
Output: -1
Explanation: If we want to make 3 bouquets of 2 flowers each, we need at least 6 flowers. But we are given only 5 flowers, so, we cannot make the bouquets.
* */
public class program2 {

    class Solution {
        private boolean possible(int[] nums,int day,int m,int k){
            int n = nums.length;
            int cnt = 0;
            int noOfB = 0;
            for(int i=0;i<n;i++){
                if(nums[i] <= day){
                    cnt++;
                }else{
                    noOfB += (cnt/k);
                    cnt = 0;
                }
            }
            noOfB += (cnt/k);
            return noOfB >= m;
        }
        public int roseGarden(int n, int[] nums, int k, int m) {
            long val = (long) m*k;
            if(val > n) return -1;
            int mini = Integer.MAX_VALUE,maxi = Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                mini = Math.min(mini,nums[i]);
                maxi = Math.max(maxi,nums[i]);
            }

            int left = mini,right = maxi;
            int ans = -1;
            while(left <= right){
                int mid = left + (right-left)/2;
                if(possible(nums,mid,m,k)){
                    ans = mid;
                    right = mid-1;
                }else{
                    left = mid+1;
                }
            }
            return ans;
        }
    }



}
