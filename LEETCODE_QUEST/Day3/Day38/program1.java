package LEETCODE_QUEST.Day38;
import java.util.*;
public class program1 {
    class Solution {
        class UnionFind{
            int [] parent;
            public UnionFind(int n){
                parent = new int[n];
                for(int i = 0;i < n;i++) parent[i] = i;
            }
            public int prtFnd(int child){
                if(child == parent[child]) return child;
                return parent[child] = prtFnd(parent[child]);
            }
            public void union(int ch1, int ch2){
                int prt1 = prtFnd(ch1);
                int prt2 = prtFnd(ch2);
                parent[prt1] = prt2;
            }
        }
        public List<List<Integer>> findCriticalAndPseudoCriticalEdges(int n, int[][] edges) {
            int len = edges.length;
            ArrayList<int[]> arr = new ArrayList<>();
            for(int i = 0;i < len;i++){
                arr.add(new int[]{edges[i][0], edges[i][1], edges[i][2], i});
            }
            arr.sort((a, b) -> {
                return a[2] - b[2];
            });

            UnionFind uf = new UnionFind(n);
            long minSum = 0;
            for(int[] edge :arr){
                int prt1 = uf.prtFnd(edge[0]);
                int prt2 = uf.prtFnd(edge[1]);
                if(prt1 != prt2){
                    minSum += edge[2];
                    uf.union(prt1, prt2);
                }
            }

            Set<Integer> restricted = new HashSet<>();
            for(int i = 0;i < len;i++){
                uf = new UnionFind(n);
                long tempSum = 0;
                for(int j = 0;j < len;j++){
                    if(j != i){
                        int prt1 = uf.prtFnd(arr.get(j)[0]);
                        int prt2 = uf.prtFnd(arr.get(j)[1]);
                        if(prt1 != prt2){
                            tempSum += arr.get(j)[2];
                            uf.union(prt1, prt2);
                        }
                    }
                }
                if(tempSum > minSum || tempSum < minSum) restricted.add(arr.get(i)[3]);
            }

            Set<Integer> critRestrict = new HashSet<>();
            for(int i = 0;i < len;i++){
                if(restricted.contains(arr.get(i)[3])) continue;

                uf = new UnionFind(n);
                long tempSum = arr.get(i)[2];
                uf.union(arr.get(i)[0], arr.get(i)[1]);

                for(int j = 0;j < len;j++){
                    if(j == i) continue;
                    int prt1 = uf.prtFnd(arr.get(j)[0]);
                    int prt2 = uf.prtFnd(arr.get(j)[1]);
                    if(prt1 != prt2){
                        tempSum += arr.get(j)[2];
                        uf.union(prt1, prt2);
                    }
                }
                if(tempSum == minSum) critRestrict.add(arr.get(i)[3]);
            }

            List<List<Integer>> res = new ArrayList<>();
            res.add(new ArrayList<>(restricted));
            res.add(new ArrayList<>(critRestrict));

            return res;
        }
    }
}
