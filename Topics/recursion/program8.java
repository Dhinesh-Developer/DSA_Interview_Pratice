package com.tuf.recursion;

import java.util.ArrayList;
import java.util.List;

// All kinds of patters related to subsequences
public class program8 {
	public static void main(String[] args) {

		// 1. printing subsequences where sum is k
		int[] arr = {1,2,1};
		int sum = 2;
		List<List<Integer>> res = new ArrayList<>();
		//		findSumEqualsSubsequence(0,arr,0,sum,arr.length,res,new ArrayList<>());
		//		System.out.println(res);

		
		
		// 2. need to print only one subsequence
//		findSumEqualsSubsequence(0,arr,0,sum,arr.length,res,new ArrayList<>());
//		System.out.println(res);
		
		
		
		// 3. count the number of subsequence where the sum equals k;
		int cnt = 0;
		int count = findSumEqualsSubsequence(0,arr,cnt,0,sum,arr.length);
		System.out.println(count);
	}

	// question no.3
	static int findSumEqualsSubsequence(int ind,int[] arr,int cnt,int s,int sum,int N) {
			// base case
			if(ind == N) {
				if(s == sum) {
					return 1;
				}
				else return 0;
			}
			
			// logic
			// take
			s += arr[ind];
			int l = findSumEqualsSubsequence(ind+1, arr,cnt, s, sum, N);
			// not take
			
			s-= arr[ind];
			int r = findSumEqualsSubsequence(ind+1, arr,cnt, s, sum, N);
			
			return l+r;
		}
	
	
	// question no.2
//	static boolean flag = false;
//	static void findSumEqualsSubsequence(int ind,int[] arr,int s,int sum,int N,List<List<Integer>> res,List<Integer> li) {
//		// base case
//
//		// stop the recursion if already one subsequence is found.
//		if(flag) return;
//		if(ind == N ) {
//			if(s == sum && !flag) {
//
//				res.add(new ArrayList<>(li));
//				flag = true;
//			}
//			return;
//		}
//
//
//		// logic
//		// take
//		s += arr[ind];
//		li.add(arr[ind]);
//		findSumEqualsSubsequence(ind+1, arr, s, sum, N, res, li);
//		// not take
//
//		s-= arr[ind];
//		li.remove(li.size()-1);
//		findSumEqualsSubsequence(ind+1, arr, s, sum, N, res, li);
//	}

	// question number 1
	//	static void findSumEqualsSubsequence(int ind,int[] arr,int s,int sum,int N,List<List<Integer>> res,List<Integer> li) {
	//		// base case
	//		if(ind == N) {
	//			if(s == sum) {
	//				res.add(new ArrayList<>(li));
	//			}
	//			return;
	//		}
	//		
	//		
	//		// logic
	//		// take
	//		s += arr[ind];
	//		li.add(arr[ind]);
	//		findSumEqualsSubsequence(ind+1, arr, s, sum, N, res, li);
	//		// not take
	//		
	//		s-= arr[ind];
	//		li.remove(li.size()-1);
	//		findSumEqualsSubsequence(ind+1, arr, s, sum, N, res, li);
	//	}
}	
