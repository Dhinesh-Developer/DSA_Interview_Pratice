package com.Interview;

import java.util.ArrayList;
import java.util.List;

/// Next greater Element
public class Interview27 {
	
	private static List<Integer> nextGreater(int[] arr) {
		  int n = arr.length;
	        ArrayList<Integer> list = new ArrayList<>();

	        for(int i=0;i<n;i++){
	            int found = 0;
	            for(int j=i+1;j<n;j++){
	                if(arr[j] > arr[i]){
	                    list.add(arr[j]);
	                    found = 1;
	                    break;
	                }
	            }
	            if(found == 0){
	                list.add(-1);
	            }
	        }

	        return list;
	}
	
	public static void main(String[] args) {
		
		int[] nums = {1,3,2,4};
		List<Integer> res = nextGreater(nums);
		
		for(int x : res) {
			System.out.print(x+" "); // 3 4 4 -1
		}
	}
}
