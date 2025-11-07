package GFG.Day17;
/*
Peak element
You are given an array arr[] where no two adjacent elements are same, find the index of a peak element. An element is considered to be a peak if it is greater than its adjacent elements (if they exist).

If there are multiple peak elements, Return index of any one of them. The output will be "true" if the index returned by your function is correct; otherwise, it will be "false".

Note: Consider the element before the first element and the element after the last element to be negative infinity.

Examples :

Input: arr = [1, 2, 4, 5, 7, 8, 3]
Output: true
Explanation: arr[5] = 8 is a peak element because arr[4] < arr[5] > arr[6].
Input: arr = [10, 20, 15, 2, 23, 90, 80]
Output: true
Explanation: Element 20 at index 1 is a peak since 10 < 20 > 15. Index 5 (value 90) is also a peak, but returning any one peak index is valid.
Constraints:
1 ≤ arr.size() ≤ 106
-231 ≤ arr[i] ≤ 231 - 1


* */
public class program2 {
    class Solution {
        public int peakElement(int[] arr) {
            // Approach 1: Brute force
            // find index -> arr[] < arr[] > arr[]
            // last and first element will not be peak index

            // int max = arr[0];
            // int index =0 ;
            // for(int i=1;i<arr.length;i++){
            //     if(arr[i] > max){
            //         max = arr[i];
            //         index = i;
            //     }
            // }
            // return index;

            // Approach 2: Binary search
            int start = 1;
            int end = arr.length-2;
            int n = arr.length;
            if(n == 1){
                return 0;
            }

            while(start <= end){
                int mid = start + (end-start)/2;
                if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]){
                    return mid;
                }
                if(arr[mid] > arr[mid-1]){
                    start = mid+1; // search in right
                }else{
                    end = mid-1; // search in left;
                }
            }

            // last is greatest

            if(arr[n-1] > arr[n-2]){
                return n-1;
            }

            // First is greatest
            if(arr[0] > arr[1]){
                return 0;
            }
            return -1;



        }
    }
}
