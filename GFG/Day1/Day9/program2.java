package GFG.Day9;
/*
Trapping Rain Water
Difficulty: HardAccuracy: 33.14%Submissions: 490K+Points: 8Average Time: 20m
Given an array arr[] with non-negative integers representing the height of blocks.
If the width of each block is 1, compute how much water can be trapped between the blocks during the rainy season.

Examples:

Input: arr[] = [3, 0, 1, 0, 4, 0 2]
Output: 10
Explanation: Total water trapped = 0 + 3 + 2 + 3 + 0 + 2 + 0 = 10 units.

Input: arr[] = [3, 0, 2, 0, 4]
Output: 7
Explanation: Total water trapped = 0 + 3 + 1 + 3 + 0 = 7 units.
Input: arr[] = [1, 2, 3, 4]
Output: 0
Explanation: We cannot trap water as there is no height bound on both sides.
Input: arr[] = [2, 1, 5, 3, 1, 0, 4]
Output: 9
Explanation: Total water trapped = 0 + 1 + 0 + 1 + 3 + 4 + 0 = 9 units.
Constraints:
1 < arr.size() < 105
0 < arr[i] < 103
* */
public class program2 {
    class Solution {
        public int maxWater(int arr[]) {
            // Approach 1:
            int n = arr.length;
            int left=0,right=n-1;
            if(n == 0) return 0;
            int leftMax = 0,rightMax = 0;
            int water = 0;

            while(left < right){
                if(arr[left] <= arr[right]){
                    if(arr[left] >= leftMax){
                        leftMax = arr[left];
                    }else{
                        water += leftMax - arr[left];
                    }
                    left++;
                }else{
                    if(arr[right] >= rightMax){
                        rightMax = arr[right];
                    }else{
                        water += rightMax - arr[right];
                    }
                    right--;
                }
            }
            return water;

        }
    }

}
