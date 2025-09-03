package com.Interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * You have given two sorted arrays arr1[] & arr2[] of distinct elements. 
 * The first array has one element extra added in between. 
 * Return the index of the extra element.
 * */

public class Interview10 {
	
	private static int findIndex(int[] ar1,int[] ar2) {
		
		int n = ar1.length;
		for(int i=0;i<n;i++) {
			if(ar1[i] != ar2[i]) {
				return i;
			}
		}
		return -1; // dummy.
	}
	
	private static int findExtra(int[] ar1,int[] ar2) {
		List<Integer> li = new ArrayList<>();
		for(int x : ar1) li.add(x);
		for(int x : ar2) li.add(x);
		
		Collections.sort(li);
		
		int res = 0;
		for(int i=0;i<li.size();i++) {
			res ^= li.get(i);
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		
		int[] ar1 = {2,4,6,8,9,10,12};
		int[] ar2 = {2,4,6,9,10,12};
		
		int res = findExtra(ar1,ar2); // to find which element  //8
		int ans = findIndex(ar1,ar2);
		System.out.println(res);
		System.out.println(ans);
	}
}
