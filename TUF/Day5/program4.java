package TUF.Day5;
/* Maximum Consecutive Ones
* Given a binary array nums, return the maximum number of consecutive 1s in the array.
A binary array is an array that contains only 0s and 1s.
* */
public class program4 {
    class Solution {
        public int findMaxConsecutiveOnes(int[] nums) {
            int n = nums.length;

            int maxOnes = 0;
            int cnt = 0;
            for(int i=0;i<n;i++){
                if(nums[i] == 1){
                    cnt++;
                    maxOnes = Math.max(cnt,maxOnes);
                }
                else{
                    cnt = 0;
                }
            }
            return maxOnes;
        }
    }
}
