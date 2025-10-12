package com.tuf.recursion;

import java.util.*;

// Generating subsequences
public class program7 {
	public static void main(String[] args) {
		
		// print all subsequences
		int[] arr = {3,1,2};
		List<List<Integer>> res = new ArrayList<>();
		printAllSubsequences(0,arr,arr.length,res,new ArrayList<>());
		System.out.println(res);
		
 	}
	
	static void printAllSubsequences(int ind,int[] arr,int N,List<List<Integer>> res,List<Integer> li) {
		
		// base case
		if(ind == N) {
			res.add(new ArrayList<>(li));
			return;
		}
		
		
		// pick
		li.add(arr[ind]);
		printAllSubsequences(ind+1,arr,N,res,li);
		
		// not pick
		li.remove(li.size()-1);
		printAllSubsequences(ind+1, arr, N, res, li);
	}
	//[[3, 1, 2], [3, 1], [3, 2], [3], [1, 2], [1], [2], []]
}
