package TUF.Day4;
/*
Koko eating bananas


A monkey is given n piles of bananas, where the 'ith' pile has nums[i] bananas. An integer h represents the total time in hours to eat all the bananas.
Each hour, the monkey chooses a non-empty pile of bananas and eats k bananas. If the pile contains fewer than k bananas,
 the monkey eats all the bananas in that pile and does not consume any more bananas in that hour.
Determine the minimum number of bananas the monkey must eat per hour to finish all the bananas within h hours.

Examples:
Input: n = 4, nums = [7, 15, 6, 3], h = 8
Output: 5

Explanation: If Koko eats 5 bananas/hr, he will take 2, 3, 2, and 1 hour to eat the piles accordingly.
 So, he will take 8 hours to complete all the piles.
* */
public class program1 {
    class Solution {
        public static int findMax(int[] arr){
            int max = Integer.MIN_VALUE;
            for(int i=0;i<arr.length;i++){
                if(arr[i] > max){
                    max = arr[i];
                }
            }
            return max;
        }

        public static int func(int[] arr,int hours){
            int totalHours = 0;
            for(int i=0;i<arr.length;i++){
                totalHours += Math.ceil((double)arr[i]/(double)hours);
            }
            return totalHours;
        }
        public int minimumRateToEatBananas(int[] arr, int h) {
            int low = 1;
            int high = findMax(arr);
            int ans = Integer.MAX_VALUE;
            while(low <= high){
                int mid = low + (high - low)/2;
                int totalHours = func(arr,mid);
                if(totalHours <= h){
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
