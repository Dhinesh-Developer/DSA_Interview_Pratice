package GFG.Day17;
/*
Binary matrix having maximum number of 1s
Difficulty: EasyAccuracy: 60.93%Submissions: 25K+Points: 2
Given a binary matrix (containing only 0 and 1) of order NxN. All rows are sorted already, We need to find the row number with the maximum number of 1s. Also, find the number of 1s in that row.
Note:

1. In case of a tie, print the smaller row number.
2. Row number should start from 0th index.

Example 1

Input:
N=3
mat[3][3] = {0, 0, 1,
              0, 1, 1,
              0, 0, 0}
Output:
Row number = 1
MaxCount = 2
Explanation:
Here, max number of 1s is in row number 1
and its count is 2.
Example 2

Input:
N=3
mat[3][3] = {1, 1, 1,
              1, 1, 1,
              0, 0, 0}
Output:
Row number = 0
MaxCount = 3
Your Task:
You don't need to read input or print anything. The task is to complete the function findMaxRow() which takes mat[][] as the 2D matrix and N as the size of matrix. Your task is to find the row number with the maximum number of 1s and find the number of 1s in that row and return the answer in a vector of size 2 where at 0th index will be the row number and at 1th index will be MaxCount.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

Constraints:
1 <= N <= 103
0 <= mat[][]<= 1


* */
public class program3 {
    // User function Template for Java

    class Solution {
        public int[] findMaxRow(int mat[][], int N) {
            // Brute force :
            // int[] res = new int[2];
            // int maxOnes = 0;
            // int index = 0;
            // for(int i=0;i<mat.length;i++){
            //     int ones = 0;
            //     for(int j=0;j<mat[i].length;j++){
            //         if(mat[i][j] == 1){
            //             ones++;
            //         }
            //     }
            //     if(ones > maxOnes){
            //         maxOnes = ones;
            //         index = i;
            //     }
            // }

            // res[0] = index;
            // res[1] = maxOnes;


            // return res;

            // Approach 2: Binary search

            int cnt=0,row=0,i=0,j=N-1;
            while(i<N && j >=0){
                if(mat[i][j] == 1){
                    cnt++;
                    row = i;
                    j--;
                }else{
                    i++;
                }
            }
            int[] ans = {row,cnt};
            return ans;
        }
    };
}
