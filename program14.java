package com.dk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// merge intervals
public class program14 {
	
	private static int[][] mergeIntervals(int[][] nums){
		int n = nums.length;
		Arrays.sort(nums,(a,b) -> a[0]-b[0]);
		List<int[]> li = new ArrayList<>();
		
		for(int i=0;i<n;i++) {
			int start = nums[i][0];
			int end = nums[i][1];
			if(li.isEmpty() || li.get(li.size()-1)[1] < start) {
				li.add(new int[] {start,end});
			}else {
				li.get(li.size()-1)[1] = Math.max(li.get(li.size()-1)[1], end);
			}
		}
		return li.toArray(new int[li.size()][]);
	}
	
	public static void main(String[] args) {
		
		int[][] nums = {{1,3},{2,6},{8,10},{15,18}};
		
		int[][] res = mergeIntervals(nums);
		
		for(int[] x : res) {
			for(int i : x) {
				System.out.print(i+",");
			}
			System.out.println();
		}
		
	}
}
