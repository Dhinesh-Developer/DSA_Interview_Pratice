package com.dk;

// Set matrix zero.
//Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.

public class program16 {
	
	private static void setMatrixZero(int[][] nums) {
		int n = nums.length;
		int m = nums[0].length;
		int[] row=  new int[n];
		int[] col = new int[m];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(nums[i][j] == 0) {
					row[i] = 1;
					col[i] = 1;
				}
			}
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(row[i] == 1 || col[j] == 1) {
					nums[i][j] = 0;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		int[][] nums = {{1,1,1},{1,0,1},{1,1,1}};
		setMatrixZero(nums);
		
		for(int[] x : nums) {
			for(int i: x) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
