package GFG.Day12;
/*
Rotate by 90 degree
Difficulty: MediumAccuracy: 56.88%Submissions: 130K+Points: 4Average Time: 20m
Given a square matrix mat[][] of size n x n.
 The task is to rotate it by 90 degrees in an anti-clockwise direction without using any extra space.

Examples:

Input: mat[][] = [[0, 1, 2],
                [3, 4, 5],
                [6, 7, 8]]
Output: [[2, 5, 8],
        [1, 4, 7],
        [0, 3, 6]]
Input: mat[][] = [[1, 2],
                [3, 4]]
Output: [[2, 4],
        [1, 3]]
Constraints:
1 ≤ n ≤ 102
0 ≤ mat[i][j] ≤ 103
* */
public class program2 {
    class Solution {
        public void rotateMatrix(int[][] mat) {

            // Approach 1 : brute force
            int n = mat.length;
            int[][] ans = new int[n][n];

            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    ans[i][n-1-j] = mat[n-1-j][n-1-i];
                }
            }

            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    mat[i][j] = ans[i][j];
                }
            }
        }
    }
}
