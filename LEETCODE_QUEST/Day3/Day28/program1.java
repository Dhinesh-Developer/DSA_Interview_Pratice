package LEETCODE_QUEST.Day28;
import java.util.*;
/*
Q3. Shortest Path with Alternating Colors
You are given an integer n, the number of nodes in a directed graph where the nodes are labeled from 0 to n - 1.
Each edge is red or blue in this graph, and there could be self-edges and parallel edges.

You are given two arrays redEdges and blueEdges where:

redEdges[i] = [ai, bi] indicates that there is a directed red edge from node ai to node bi in the graph, and
blueEdges[j] = [uj, vj] indicates that there is a directed blue edge from node uj to node vj in the graph.
Return an array answer of length n, where each answer[x] is the length of the shortest path from node 0 to node x such that the edge colors alternate along the path, or -1 if such a path does not exist.



Example 1:

Input: n = 3, redEdges = [[0,1],[1,2]], blueEdges = []
Output: [0,1,-1]
Example 2:

Input: n = 3, redEdges = [[0,1]], blueEdges = [[2,1]]
Output: [0,1,-1]


Constraints:

1 <= n <= 100
0 <= redEdges.length, blueEdges.length <= 400
redEdges[i].length == blueEdges[j].length == 2
0 <= ai, bi, uj, vj < n
* */
public class program1 {


    class Solution {
        public int[] shortestAlternatingPaths(int n, int[][] redEdges, int[][] blueEdges) {

            List<Integer>[] redAdj = new ArrayList[n];
            List<Integer>[] blueAdj = new ArrayList[n];

            for (int i = 0; i < n; i++) {
                redAdj[i] = new ArrayList<>();
                blueAdj[i] = new ArrayList<>();
            }

            for (int[] e : redEdges) {
                redAdj[e[0]].add(e[1]);
            }

            for (int[] e : blueEdges) {
                blueAdj[e[0]].add(e[1]);
            }

            int[][] dist = new int[n][2]; // 0 = red,1 = blue
            for (int i = 0; i < n; i++) {
                Arrays.fill(dist[i], Integer.MAX_VALUE);
            }

            Queue<int[]> q = new LinkedList<>();

            dist[0][0] = 0;
            dist[0][1] = 0;
            q.offer(new int[]{0, 0}); // last color red
            q.offer(new int[]{0, 1}); // last color blue

            while (!q.isEmpty()) {
                int[] cur = q.poll();
                int node = cur[0];
                int color = cur[1];

                if (color == 0) {
                    for (int next : blueAdj[node]) {
                        if (dist[next][1] == Integer.MAX_VALUE) {
                            dist[next][1] = dist[node][0] + 1;
                            q.offer(new int[]{next, 1});
                        }
                    }
                } else {
                    for (int next : redAdj[node]) {
                        if (dist[next][0] == Integer.MAX_VALUE) {
                            dist[next][0] = dist[node][1] + 1;
                            q.offer(new int[]{next, 0});
                        }
                    }
                }
            }

            int[] ans = new int[n];
            for (int i = 0; i < n; i++) {
                int min = Math.min(dist[i][0], dist[i][1]);
                ans[i] = (min == Integer.MAX_VALUE) ? -1 : min;
            }

            return ans;
        }
    }

}
