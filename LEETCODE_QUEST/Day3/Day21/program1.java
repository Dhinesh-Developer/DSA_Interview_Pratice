package LEETCODE_QUEST.Day21;
import java.util.*;
/*
Q2. Largest Component Size by Common Factor
You are given an integer array of unique positive integers nums. Consider the following graph:

There are nums.length nodes, labeled nums[0] to nums[nums.length - 1],
There is an undirected edge between nums[i] and nums[j] if nums[i] and nums[j] share a common factor greater than 1.
Return the size of the largest connected component in the graph.



Example 1:


Input: nums = [4,6,15,35]
Output: 4
Example 2:


Input: nums = [20,50,9,63]
Output: 2
Example 3:


Input: nums = [2,3,6,7,4,12,21,39]
Output: 8


Constraints:

1 <= nums.length <= 2 * 104
1 <= nums[i] <= 105
All the values of nums are unique.
* */
public class program1 {
    class Solution {
        private List<Integer> getFactors(int num) {
            List<Integer> factors =new ArrayList<>();
            int x =num;
            for (int i = 2;i* i <= x; i++) {
                if (x %i ==0) {
                    factors.add(i);
                    while (x % i == 0) x/= i;
                }
            }
            if (x >1) factors.add(x);
            return factors;
        }
        public int largestComponentSize(int[] nums) {
            int n =nums.length;
            List<Integer>[] adj = new ArrayList[n];
            for (int i = 0;i < n;i++) adj[i] = new ArrayList<>();
            Map<Integer, Integer> factorMap = new HashMap<>();
            for (int i = 0;i <n;i++) {
                List<Integer> factors = getFactors(nums[i]);
                for (int f: factors) {
                    if (!factorMap.containsKey(f))
                        factorMap.put(f, i);
                    else{
                        int prevIndex =factorMap.get(f);
                        adj[prevIndex].add(i);
                        adj[i].add(prevIndex);
                    }
                }
            }
            boolean[] visited = new boolean[n];
            int largest = 0;
            for (int i = 0;i <n;i++) {
                if (!visited[i])
                    largest = Math.max(largest, bfs(i, adj, visited));
            }
            return largest;
        }

        private int bfs(int start,List<Integer>[] adj,boolean[] visited) {
            int size = 0;
            Queue<Integer> q= new LinkedList<>();
            q.add(start);
            visited[start] = true;
            while (!q.isEmpty()) {
                int node= q.poll();
                size++;
                for (int next: adj[node]) {
                    if (!visited[next]) {
                        visited[next] = true;
                        q.add(next);
                    }
                }
            }
            return size;
        }
    }

}
