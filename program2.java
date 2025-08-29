package Array_Easy;

import java.util.HashMap;
import java.util.Map;

/*
 * you are given a 0-indexed 2D integer matrix grid of size n * n with values in the range [1, n2]. 
 * Each integer appears exactly once except a which appears twice and b which is missing. 
 * The task is to find the repeating and missing numbers a and b.

Return a 0-indexed integer array ans of size 2 where ans[0] equals to a and ans[1] equals to b.

 

Example 1:

Input: grid = [[1,3],[2,2]]
Output: [2,4]
Explanation: Number 2 is repeated and number 4 is missing so the answer is [2,4].*/

public class program2 {
	
	public static int[] repeatedAndMissing(int[][] grid) {
		Map<Integer,Integer> map = new HashMap<>();
		int n = grid.length;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				map.put(grid[i][j], map.getOrDefault(grid[i][j], 0)+1);
			}
		}
		
		int missing = -1,repeaded = -1;
		for(int i=1;i<=n*n;i++) {
			if(!map.containsKey(i)) {
				missing = i;
			}else if(map.get(i) == 2) {
				repeaded = i;
			}
		}
		
		return new int[] {repeaded,missing};
		
	}
	public static void main(String[] args) {
		
		int[][] grid = {{1,3},{2,2}};
		int[] res = repeatedAndMissing(grid);
		
		for(int x : res) {
			System.out.println(x);
		}
		
	}
}
