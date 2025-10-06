package Day2;
/*
🧩 Problem 1 – Search in a 2D Array

Statement:
You’re given a 2D matrix of integers. Find whether a key exists in the matrix.
If found, print its row and column index.

input:
rows = 3, cols = 3
matrix = [
  [5, 9, 3],
  [8, 1, 6],
  [7, 4, 2]
]
key = 6

output:
Element found at (1, 2)

* */

import java.util.Arrays;

public class program1 {
    public static void main(String[] args) {
        int[][] arr = {
                {5,9,3},
                {8,1,6},
                {7,4,2}
        };
        int key=  6;
        int[] res = searchIn2DMatrix(arr,key);
        System.out.println(Arrays.toString(res));
    }

    public static int[] searchIn2DMatrix(int[][] arr,int key){

        // case 1: what if the matrix is empty
        if(arr.length == 0){
            return new int[]{-1};
        }

        // case 2: search in the 2D matrix
        for(int i=0;i<arr.length;i++){
            // what if the column size has different -> to traverse for each row every column
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j] == key){
                    return new int[]{i,j};
                }
            }
        }

        // case 3: what if the key is not present in the array
        return new int[]{-1,-1};
    }
}
