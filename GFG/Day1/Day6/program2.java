package GFG.Day6;
/*
Two Sum - Pair with Given Sum
Difficulty: EasyAccuracy: 30.61%Submissions: 425K+Points: 2Average Time: 20m
Given an array arr[] of integers and another integer target. Determine if there exist two distinct indices such that the sum of their elements is equal to the target.

Examples:

Input: arr[] = [0, -1, 2, -3, 1], target = -2
Output: true
Explanation: arr[3] + arr[4] = -3 + 1 = -2
Input: arr[] = [1, -2, 1, 0, 5], target = 0
Output: false
Explanation: None of the pair makes a sum of 0
Input: arr[] = [11], target = 11
Output: false
Explanation: No pair is possible as only one element is present in arr[]
* */
public class program2 {
    class Solution {
        boolean twoSum(int arr[], int target) {
            // code here

            // case 1 : if arr.length == 1 return false;
            // case 2 : Appraoch -> two pointer
            // case 3 : left ans right pointer
            if(arr.length <= 1){
                return false;
            }
            // Appraoch 1
            // Arrays.sort(arr);

            // int left=0,right=arr.length-1;
            // while(left < right){
            //     int sum = arr[left] + arr[right];
            //     if(sum == target){
            //         return true;
            //     }else if(sum < target){
            //         right--;
            //     }else{
            //         left++;
            //     }
            // }

            // return false;

            // Approch 2 : two loop
            for(int i=0;i<arr.length;i++){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[i]+arr[j] == target){
                        return true;
                    }
                }
            }

            return false;
        }
    }
}
