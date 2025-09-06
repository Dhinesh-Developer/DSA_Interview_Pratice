package com.Interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Given an array of size N with repeated numbers, 
You Have to Find the top three repeated numbers.
 Note : If Number comes same number of times then our output is one who comes first in array
 * */

public class Interview28 {
	
	private static void findTop3(int[] nums) {
		Map<Integer,Integer> map = new HashMap<>();
		Map<Integer,Integer> first = new HashMap<>();
		
		for(int i=0;i<nums.length;i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
			first.putIfAbsent(nums[i], i);
		}
		
		List<Integer> number = new ArrayList<>(map.keySet());
		number.sort((a,b) -> {
			if(!map.get(a) .equals(map.get(b))) {
				return map.get(b)-map.get(a);
			}else {
				 return first.get(a)- first.get(b);
			}
		});
		
		
		System.out.println("Three top repeated Elements: ");
		for(int i=0;i<Math.min(3, number.size());i++) {
			System.out.print(number.get(i)+" ");
		}
	}
	
	public static void main(String[] args) {
		
		int arr1[] = {3, 4, 2, 3, 16, 3, 15, 16, 15, 15, 16, 2, 3};
        findTop3(arr1);
        System.out.println();

        int arr2[] = {2, 4, 3, 2, 3, 4, 5, 5, 3, 2, 2, 5};
        findTop3(arr2);
	}
}
/*Three top repeated Elements: 
3 16 15 
Three top repeated Elements: 
2 3 5 
 * */
