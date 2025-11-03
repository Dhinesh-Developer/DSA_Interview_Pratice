package GFG.Day13;
/*
Print matrix in diagonal pattern
Difficulty: MediumAccuracy: 63.72%Submissions: 38K+Points: 4Average Time: 15m
Given a square matrix mat[][] of n*n size, the task is to determine the diagonal pattern which is a linear arrangement of the elements of the matrix as depicted in the following example:



Example 1:

Input:
n = 3
mat[][] = {{1, 2, 3},
           {4, 5, 6},
           {7, 8, 9}}
Output: {1, 2, 4, 7, 5, 3, 6, 8, 9}
Explaination:
Starting from (0, 0): 1,
Move to the right to (0, 1): 2,
Move diagonally down to (1, 0): 4,
Move diagonally down to (2, 0): 7,
Move diagonally up to (1, 1): 5,
Move diagonally up to (0, 2): 3,
Move to the right to (1, 2): 6,
Move diagonally up to (2, 1): 8,
Move diagonally up to (2, 2): 9
There for the output is {1, 2, 4, 7, 5, 3, 6, 8, 9}.
Example 2:

Input:
n = 2
mat[][] = {{1, 2},
           {3, 4}}
Output: {1, 2, 3, 4}
Explaination:
Starting from (0, 0): 1,
Move to the right to (0, 1): 2,
Move diagonally down to (1, 0): 3,
Move to the right to (1, 1): 4
There for the output is {1, 2, 3, 4}.
Your Task:
You only need to implement the given function matrixDiagonally() which takes a matrix mat[][] of size n*n as an input and returns a list of integers containing the matrix diagonally. Do not read input, instead use the arguments given in the function.

Expected Time Complexity: O(n*n).
Expected Auxiliary Space: O(n*n).
* */
public class program2 {
    class Solution {
        public int[] matrixDiagonally(int[][] mat) {
            int n = mat.length,m=mat[0].length,row=0,col=0;
            int[] res = new int[n*m];
            for(int i=0;i<res.length;i++){
                res[i] = mat[row][col];
                if((row+col)%2==0){
                    if(col == n-1){
                        row++;
                    }else if(row == 0){
                        col++;
                    }else{
                        row--;
                        col++;
                    }
                }else{
                    if(row == n-1){
                        col++;
                    }else if(col == 0){
                        row++;
                    }else{
                        row++;
                        col--;
                    }
                }
            }
            return res;
        }
    }
}
