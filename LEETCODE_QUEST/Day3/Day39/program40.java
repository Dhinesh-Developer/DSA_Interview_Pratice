package LEETCODE_QUEST.Day39;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
/*
Q2. Min Cost to Connect All Points
Solved
Medium
Topics
premium lock icon
Companies
Hint
You are given an array points representing integer coordinates of some points on a 2D-plane, where points[i] = [xi, yi].

The cost of connecting two points [xi, yi] and [xj, yj] is the manhattan distance between them: |xi - xj| + |yi - yj|, where |val| denotes the absolute value of val.

Return the minimum cost to make all points connected. All points are connected if there is exactly one simple path between any two points.



Example 1:


Input: points = [[0,0],[2,2],[3,10],[5,2],[7,0]]
Output: 20
Explanation:

We can connect the points as shown above to get the minimum cost of 20.
Notice that there is a unique path between every pair of points.
Example 2:

Input: points = [[3,12],[-2,5],[-4,1]]
Output: 18


Constraints:

1 <= points.length <= 1000
-106 <= xi, yi <= 106
All pairs (xi, yi) are distinct.
* */
class Solution {
    public int minCostConnectPoints(int[][] points) {
        int n = points.length;
        int min_cost = 0;
        boolean[] visited = new boolean[n];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]); // [cost, vertex]
        Map<Integer, Integer> cache = new HashMap<>();
        pq.offer(new int[]{0, 0});

        while (!pq.isEmpty()) {
            int[] edge = pq.poll();
            int cost = edge[0];
            int u = edge[1];

            if (visited[u]) {
                continue;
            }

            visited[u] = true;
            min_cost += cost;

            for (int v = 0; v < n; v++) {
                if (!visited[v]) {
                    int dist = Math.abs(points[u][0] - points[v][0]) + Math.abs(points[u][1] - points[v][1]);
                    if (dist < cache.getOrDefault(v, Integer.MAX_VALUE)) {
                        cache.put(v, dist);
                        pq.offer(new int[]{dist, v});
                    }
                }
            }
        }

        return min_cost;
    }
}