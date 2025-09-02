package com.Interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/*
 * Given an array A[] of integers, sort the array according to frequency of elements. That is elements that have higher frequency come first. If frequencies of two elements are same, then smaller number comes first.

Input:
The first line of input contains an integer T denoting the number of test cases. The description of T test cases follows. The first line of each test case contains a single integer N denoting the size of array. The second line contains N space-separated integers A1, A2, ..., AN denoting the elements of the array.

Output:
For each testcase, in a new line, print each sorted array in a seperate line. For each array its numbers should be seperated by space.*/
public class Interview6 {
	
	private static void sortingFreq(int[] nums) {
		
		
		Map<Integer,Integer> map = new HashMap<>();
		List<Integer> li = new ArrayList<>();
		for(int i=0;i<nums.length;i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
			li.add(nums[i]);
		}
		
		Collections.sort(li,(n1,n2) -> {
			int freq1 = map.get(n1);
			int freq2 = map.get(n2);
			if(freq1 != freq2) return freq2-freq1;
			return n1-n2;
		});
		
		System.out.println();
		for(int i=0;i<li.size();i++) {
			System.out.print(li.get(i)+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		
		while( t-->0) {
			int n = in.nextInt();
			int[] arr = new int[n];
			for(int i=0;i<n;i++)
			{
				arr[i] = in.nextInt();
			}
			sortingFreq(arr);
		}
		in.close();
		
		
	}
}
