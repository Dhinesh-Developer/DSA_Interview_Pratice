package com.Interview;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

// Sort the matrix diagonally.

/*
A matrix diagonal is a diagonal line of cells starting from some cell 
in either the topmost row or leftmost column and going in the bottom-right direction until reaching the matrix's end. For example, the matrix diagonal starting from mat[2][0], where mat is a 6 x 3 matrix, includes cells mat[2][0], mat[3][1], and mat[4][2].

Given an m x n matrix mat of integers, sort each matrix diagonal 
in ascending order and return the resulting matrix.
 * */

public class Interview16 {
	
	private static int[][] sortDiagonally(int[][] A){
		int m = A.length;
		int n = A[0].length;
		
		Map<Integer,PriorityQueue<Integer>> map = new HashMap<>();
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				map.putIfAbsent(i-j,new PriorityQueue<>());
				map.get(i-j).add(A[i][j]);
			}
		}
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				A[i][j] = map.get(i-j).poll();
			}
		}
		
		return A;
	}
	
	public static void main(String[] args) {
		
		int[][] nums = {{3,3,1,1},{2,2,1,2},{1,1,1,2}};
		int[][] res = sortDiagonally(nums);
		
		for(int[] x : res) {
			for(int i : x) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
