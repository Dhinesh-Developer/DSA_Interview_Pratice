package GFG.Day9;
/*
169. Majority Element

Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times.
You may assume that the majority element always exists in the array.

Example 1:
Input: nums = [3,2,3]
Output: 3

Example 2:
Input: nums = [2,2,1,1,1,2,2]
Output: 2


Constraints:

n == nums.length
1 <= n <= 5 * 104
-109 <= nums[i] <= 109
* */
public class program3 {
    class Solution {
        public int majorityElement(int[] nums) {
            // Approach 1: passed
            if(nums.length ==0) return 0;
            // Map<Integer,Integer> map = new HashMap<>();
            // for(int i=0;i<nums.length;i++){
            //     map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            // }
            // int n = nums.length;
            // int k = n/2;
            // for(Map.Entry<Integer,Integer> x : map.entrySet()){
            //     if(x.getValue() > k){
            //         return x.getKey();
            //     }
            // }
            // return -1;

            // Approach 2:
            int res=0,majority =0;
            for(int n : nums){
                if(majority == 0){
                    res = n;
                }
                majority += n==res?1:-1;
            }
            return res;
        }
    }
}
