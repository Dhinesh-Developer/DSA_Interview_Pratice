package GFG.Day13;
/**
 Rotate Each Row of Matrix K Times
 Difficulty: MediumAccuracy: 41.89%Submissions: 43K+Points: 4Average Time: 30m
 You are given an integer k and matrix mat. Rotate the elements of the given matrix to the left k times and return the resulting matrix.

 Examples:

 Input: k=1, mat=[[1,2,3]
 [4,5,6]
 [7,8,9]]
 Output: [[2, 3, 1]
 [5, 6, 4]
 [8, 9, 7]]
 Explanation: Rotate the matrix by one
 1 2 3       2 3 1
 4 5 6  =>  5 6 4
 7 8 9       8 9 7
 Input: k=2, mat=[[1, 2, 3]
 [4, 5, 6]
 [7, 8, 9]]
 Output: [[3, 1, 2]
 [6, 4, 5]
 [9, 7, 8]]
 Explanation: After rotating the matrix looks like
 1 2 3       2 3 1       3 1 2
 4 5 6  =>  5 6 4  =>   6 4 5
 7 8 9       8 9 7       9 7 8
 Expected Time Complexity: O(n*m)
 Expected Auxillary Space: O(n*m)

 Constraints:
 1<=k<=104
 1<= mat.size(), mat[0].size, mat[i][j] <=1000
*/
public class program1 {
    // User function template for java

    class Solution {
        int[][] rotateMatrix(int k, int mat[][]) {

            // optimal approach

            int m = mat.length;
            int n = mat[0].length;

            k = k%n;
            int[][] matrix = new int[m][n];
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    int new_j = (j+n-k)%n;
                    matrix[i][new_j] = mat[i][j];
                }
            }
            return matrix;
        }
    }
}
