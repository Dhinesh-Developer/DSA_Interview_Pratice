package com.dk;
 // Search in a 2D matrix
public class program12 {
	
	private static boolean searhInMatrix(int[][] nums,int target) {
		int n = nums.length;
		int m = nums[0].length;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(nums[i][j] == target) {
					return true;
				}
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		int[][] nums = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
		int target = 3;
		
		boolean res = searhInMatrix(nums,target);
		System.out.println(res); // true
		
	}
}
