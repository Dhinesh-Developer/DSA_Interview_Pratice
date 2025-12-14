package LEETCODE_QUEST.Day29;
import java.util.*;
/*
Q2. Minimum Weighted Subgraph With the Required Paths

You are given an integer n denoting the number of nodes of a weighted directed graph.
 The nodes are numbered from 0 to n - 1.

You are also given a 2D integer array edges where edges[i] = [fromi, toi, weighti] denotes that there exists a directed edge from fromi to toi with weight weighti.

Lastly, you are given three distinct integers src1, src2, and dest denoting three distinct nodes of the graph.

Return the minimum weight of a subgraph of the graph such that it is possible to reach dest from both src1 and src2 via a set of edges of this subgraph. In case such a subgraph does not exist, return -1.

A subgraph is a graph whose vertices and edges are subsets of the original graph. The weight of a subgraph is the sum of weights of its constituent edges.



Example 1:


Input: n = 6, edges = [[0,2,2],[0,5,6],[1,0,3],[1,4,5],[2,1,1],[2,3,3],[2,3,4],[3,4,2],[4,5,1]], src1 = 0, src2 = 1, dest = 5
Output: 9
Explanation:
The above figure represents the input graph.
The blue edges represent one of the subgraphs that yield the optimal answer.
Note that the subgraph [[1,0,3],[0,5,6]] also yields the optimal answer. It is not possible to get a subgraph with less weight satisfying all the constraints.
Example 2:


Input: n = 3, edges = [[0,1,1],[2,1,1]], src1 = 0, src2 = 1, dest = 2
Output: -1
Explanation:
The above figure represents the input graph.
It can be seen that there does not exist any path from node 1 to node 2, hence there are no subgraphs satisfying all the constraints.


Constraints:

3 <= n <= 105
0 <= edges.length <= 105
edges[i].length == 3
0 <= fromi, toi, src1, src2, dest <= n - 1
fromi != toi
src1, src2, and dest are pairwise distinct.
1 <= weight[i] <= 105
 */

public class program2 {


    class Solution {
        static final long INF = (long)1e18;

        public long minimumWeight(int n, int[][] edges, int src1, int src2, int dest) {
            List<int[]>[] graph = new ArrayList[n];
            List<int[]>[] revGraph = new ArrayList[n];

            for (int i = 0; i < n; i++) {
                graph[i] = new ArrayList<>();
                revGraph[i] = new ArrayList<>();
            }

            for (int[] e : edges) {
                int u = e[0], v = e[1], w = e[2];
                graph[u].add(new int[]{v, w});
                revGraph[v].add(new int[]{u, w});
            }

            long[] d1 = dijkstra(src1, graph, n);
            long[] d2 = dijkstra(src2, graph, n);
            long[] d3 = dijkstra(dest, revGraph, n);

            long ans = INF;
            for (int i = 0; i < n; i++) {
                if (d1[i] == INF || d2[i] == INF || d3[i] == INF) continue;
                ans = Math.min(ans, d1[i] + d2[i] + d3[i]);
            }

            return ans == INF ? -1 : ans;
        }

        private long[] dijkstra(int src, List<int[]>[] graph, int n) {
            long[] dist = new long[n];
            Arrays.fill(dist, INF);
            dist[src] = 0;

            PriorityQueue<long[]> pq =
                    new PriorityQueue<>(Comparator.comparingLong(a -> a[0]));
            pq.add(new long[]{0, src});

            while (!pq.isEmpty()) {
                long[] cur = pq.poll();
                long d = cur[0];
                int u = (int) cur[1];

                if (d > dist[u]) continue;

                for (int[] nei : graph[u]) {
                    int v = nei[0], w = nei[1];
                    if (dist[v] > d + w) {
                        dist[v] = d + w;
                        pq.add(new long[]{dist[v], v});
                    }
                }
            }
            return dist;
        }
    }

}
