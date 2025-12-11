package LEETCODE_QUEST.Day27;

import java.util.*;
/*
Q1. Map of Highest Peak

You are given an integer matrix isWater of size m x n that represents a map of land and water cells.
If isWater[i][j] == 0, cell (i, j) is a land cell.
If isWater[i][j] == 1, cell (i, j) is a water cell.
You must assign each cell a height in a way that follows these rules:
The height of each cell must be non-negative.
If the cell is a water cell, its height must be 0.
Any two adjacent cells must have an absolute height difference of at most 1.
 A cell is adjacent to another cell if the former is directly north, east, south, or west of the latter
 (i.e., their sides are touching).
Find an assignment of heights such that the maximum height in the matrix is maximized.
Return an integer matrix height of size m x n where height[i][j] is cell (i, j)'s height.
If there are multiple solutions, return any of them.

Example 1:

Input: isWater = [[0,1],[0,0]]
Output: [[1,0],[2,1]]
Explanation: The image shows the assigned heights of each cell.
The blue cell is the water cell, and the green cells are the land cells.
Example 2:



Input: isWater = [[0,0,1],[1,0,0],[0,0,0]]
Output: [[1,1,0],[0,1,1],[1,2,2]]
Explanation: A height of 2 is the maximum possible height of any assignment.
Any height assignment that has a maximum height of 2 while still meeting the rules will also be accepted.


Constraints:

m == isWater.length
n == isWater[i].length
1 <= m, n <= 1000
isWater[i][j] is 0 or 1.
There is at least one water cell.

* */

public class program1 {
    class Solution {
        public int[][] highestPeak(int[][] isWater) {
            int m = isWater.length;
            int n = isWater[0].length;

            int[][] height = new int[m][n];
            boolean[][] visited = new boolean[m][n];
            Queue<int[]> q = new LinkedList<>();

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (isWater[i][j] == 1) {
                        q.add(new int[]{i, j});
                        visited[i][j] = true;
                        height[i][j] = 0;
                    } else {
                        height[i][j] = -1;
                    }
                }
            }

            int[][] dirs = {{1,0}, {-1,0}, {0,1}, {0,-1}};

            while (!q.isEmpty()) {
                int[] cell = q.poll();
                int x = cell[0];
                int y = cell[1];

                for (int[] d : dirs) {
                    int nx = x + d[0];
                    int ny = y + d[1];
                    if (nx >= 0 && nx < m && ny >= 0 && ny < n && !visited[nx][ny]) {
                        visited[nx][ny] = true;
                        height[nx][ny] = height[x][y] + 1;
                        q.add(new int[]{nx, ny});
                    }
                }
            }

            return height;
        }
    }

}
