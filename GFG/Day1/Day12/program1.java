package GFG.Day12;
/*
74. Search a 2D Matrix

You are given an m x n integer matrix matrix with the following two properties:

Each row is sorted in non-decreasing order.
The first integer of each row is greater than the last integer of the previous row.
Given an integer target, return true if target is in matrix or false otherwise.

You must write a solution in O(log(m * n)) time complexity.


Example 1:

Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
Output: true
Example 2:

Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
Output: false


Constraints:

m == matrix.length
n == matrix[i].length
1 <= m, n <= 100
-104 <= matrix[i][j], target <= 104
* */
public class program1 {
    class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {
            // Approach 1: brute force -> passed
            // boolean flag = false;
            // int n = matrix.length;
            // int m = matrix[0].length;
            // for(int i=0;i<n;i++){
            //     for(int j=0;j<m;j++){
            //         if(matrix[i][j] == target){
            //             flag = true;
            //             break;
            //         }
            //     }
            // }
            // return flag;

            // Approch 2 : binary search
            int n = matrix.length,m = matrix[0].length;
            for(int i=0;i<n;i++){
                if(matrix[i][0] <= target && target <= matrix[i][m-1]){
                    return binarySearch(matrix[i],target);
                }
            }
            return false;
        }

        public boolean binarySearch(int[] matrix,int target){
            int low = 0,high = matrix.length-1;
            while(low <= high){
                int mid = low+(high-low)/2;
                if(matrix[mid] == target) return true;
                else if(matrix[mid] < target) low = mid+1;
                else high = mid-1;
            }
            return false;
        }
    }
}
