package LEETCODE_QUEST.Day30;
import java.util.*;import java.util.*;
public class program2 {
    // Q4. Find the City With the Smallest Number of Neighbors at a Threshold Distance
// Approach: Run Dijkstra from every city (n ≤ 100)



    class Solution {
        public int findTheCity(int n, int[][] edges, int distanceThreshold) {
            List<int[]>[] adj = new ArrayList[n];
            for (int i = 0; i < n; i++) adj[i] = new ArrayList<>();

            for (int[] e : edges) {
                adj[e[0]].add(new int[]{e[1], e[2]});
                adj[e[1]].add(new int[]{e[0], e[2]});
            }

            int answer = -1;
            int minReachable = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                int reachable = dijkstra(i, adj, n, distanceThreshold);
                if (reachable <= minReachable) {
                    minReachable = reachable;
                    answer = i;
                }
            }
            return answer;
        }

        private int dijkstra(int src, List<int[]>[] adj, int n, int limit) {
            int[] dist = new int[n];
            Arrays.fill(dist, Integer.MAX_VALUE);
            dist[src] = 0;

            PriorityQueue<int[]> pq =
                    new PriorityQueue<>((a, b) -> a[1] - b[1]);
            pq.add(new int[]{src, 0});

            while (!pq.isEmpty()) {
                int[] cur = pq.poll();
                int node = cur[0];
                int d = cur[1];

                if (d > dist[node]) continue;

                for (int[] next : adj[node]) {
                    int v = next[0];
                    int w = next[1];
                    if (dist[v] > d + w) {
                        dist[v] = d + w;
                        pq.add(new int[]{v, dist[v]});
                    }
                }
            }

            int count = 0;
            for (int i = 0; i < n; i++) {
                if (i != src && dist[i] <= limit) {
                    count++;
                }
            }
            return count;
        }
    }

}
