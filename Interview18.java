package com.Interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* Sort elements on the basis of number of factors
Given an array of positive integers. 
Sort the given array in decreasing order of number of factors of each element,
 i.e., element having the highest number of factors should be the first to be displayed and the number having least number of factors should be the last one. Two elements with equal number of factors 
should be in the same order as in the original array. 
 * 
 **/

public class Interview18 {
	
	private static int countFactors(int n) {
		int cnt = 0;
		for(int i=1;i*i<=n;i++) {
			if(n%i ==0) {
				cnt++;
				if(i !=n/i) cnt++;
			}
		}
		return cnt;
	}
	
	public static void main(String[] args) {
		
		int[] nums=  {5, 11, 10, 20, 9, 16, 23};
		
		List<Integer> li = new ArrayList<>();
		for(int x : nums) li.add(x);
		
		li.sort((a,b) -> {
			int fa = countFactors(a);
			int fb = countFactors(b);
			
			if(fa == fb) return 0;
			return fb-fa;
		});
		
		for(int x : li) {
			System.out.print(x+" "); //20 16 10 9 5 11 23 
		}
	}
}
