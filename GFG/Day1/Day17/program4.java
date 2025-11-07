package GFG.Day17;
/*
Search in a sorted Matrix
Difficulty: MediumAccuracy: 56.27%Submissions: 147K+Points: 4
Given a strictly sorted 2D matrix mat[][] of size n x m and a number x. Find whether the number x is present in the matrix or not.
Note: In a strictly sorted matrix, each row is sorted in strictly increasing order, and the first element of the ith row (i!=0) is greater than the last element of the (i-1)th row.

Examples:

Input: mat[][] = [[1, 5, 9], [14, 20, 21], [30, 34, 43]], x = 14
Output: true
Explanation: 14 is present in the matrix, so output is true.
Input: mat[][] = [[1, 5, 9, 11], [14, 20, 21, 26], [30, 34, 43, 50]], x = 42
Output: false
Explanation: 42 is not present in the matrix.
Input: mat[][] = [[87, 96, 99], [101, 103, 111]], x = 101
Output: true
Explanation: 101 is present in the matrix.
Constraints:
1 ≤ n, m ≤ 1000
1 ≤ mat[i][j] ≤ 109
1 ≤ x ≤ 109
* */
public class program4 {
    class Solution {
        public boolean searchMatrix(int[][] mat, int x) {
            // Approach 1: Brute force
            // for(int i=0;i<mat.length;i++){
            //     for(int j=0;j<mat[i].length;j++){
            //         if(mat[i][j] == x){
            //             return true;
            //         }
            //     }
            // }
            // return false;

            // Approch 2: Binary search
            for(int[] row: mat){
                if(binary(row,x)){
                    return true;
                }
            }
            return false;
        }

        public boolean binary(int[] arr,int x){
            int low = 0,high = arr.length-1;
            while(low <= high){
                int mid = low + (high-low)/2;
                if(arr[mid] == x){
                    return true;
                }else if(arr[mid] < x){
                    low = mid+1;
                }else{
                    high = mid-1;
                }
            }
            return false;
        }
    }

}
