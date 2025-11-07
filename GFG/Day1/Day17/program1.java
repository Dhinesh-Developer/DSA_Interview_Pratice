package GFG.Day17;
/*
Find Kth Rotation
Given an increasing sorted rotated array arr[] of distinct integers. The array is right-rotated k times. Find the value of k.
Let's suppose we have an array arr[] = [2, 4, 6, 9], if we rotate it by 2 times it will look like this:
After 1st Rotation : [9, 2, 4, 6]
After 2nd Rotation : [6, 9, 2, 4]

Examples:

Input: arr[] = [5, 1, 2, 3, 4]
Output: 1
Explanation: The given array is [5, 1, 2, 3, 4]. The original sorted array is [1, 2, 3, 4, 5]. We can see that the array was rotated 1 times to the right.
Input: arr = [1, 2, 3, 4, 5]
Output: 0
Explanation: The given array is not rotated.
Constraints:
1 ≤ arr.size() ≤105
1 ≤ arr[i] ≤ 107
* */
public class program1 {
    class Solution {
        public int findKRotation(int arr[]) {
            // Approach 1: Brute force
            // if(arr.length ==0 || arr.length ==1){
            //     return 0;
            // }

            // for(int i=0;i<arr.length-1;i++){
            //     if(arr[i] > arr[i+1]){
            //         return i+1;
            //     }
            // }
            // return 0;

            // Approach 2: Optimal using binary search
            int pivot = findPivot(arr);
            if(pivot == -1){
                return 0;
            }else{
                return pivot+1;
            }


        }

        public int findPivot(int[] arr){
            int start = 0;
            int end = arr.length-1;
            while(start <= end){
                int mid = start + (end - start) /2;
                if(mid < end && arr[mid] > arr[mid+1]){
                    return mid;
                }
                if(mid > start && arr[mid] < arr[mid-1]){
                    return mid-1;
                }

                if(arr[mid] > arr[start]){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }
            return -1;
        }
    }
}
