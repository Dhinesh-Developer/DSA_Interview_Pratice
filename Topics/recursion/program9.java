package com.tuf.recursion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class program9 {
	public static void main(String[] args) {

		// Combination Sum I — return all combinations whose sum equals target
//		int[] arr = {2,3,6,7};
//		int target = 7;

//		List<List<Integer>> res = new ArrayList<>();
		//        findCombination(0, arr, target, res, new ArrayList<>());
		//        System.out.println(res); // [[2, 2, 3], [7]]

		// Combination Sum II — return all combinations whose sum equals target -> eliminates duplicates
		int[] arr = {1,1,1,2,2};
		int target = 4;
		Set<List<Integer>> res = new HashSet<>();
		findCombination(0, arr, target, res, new ArrayList<>());
		System.out.println(res); 

	}

	static void findCombination(int ind, int[] arr, int target, Set<List<Integer>> res, List<Integer> li) {

		// base case
		if (ind == arr.length) {
			if (target == 0) {
				res.add(new ArrayList<>(li));
			}
			return;
		}

		// pick the current element
		if (arr[ind] <= target) {
			li.add(arr[ind]);
			findCombination(ind, arr, target - arr[ind], res, li); // can reuse same index
			li.remove(li.size() - 1); // backtrack
		}

		// not pick the current element
		findCombination(ind + 1, arr, target, res, li);
	}

	//    static void findCombination(int ind, int[] arr, int target, List<List<Integer>> res, List<Integer> li) {
	//
	//        // base case
	//        if (ind == arr.length) {
	//            if (target == 0) {
	//                res.add(new ArrayList<>(li));
	//            }
	//            return;
	//        }
	//
	//        // pick the current element
	//        if (arr[ind] <= target) {
	//            li.add(arr[ind]);
	//            findCombination(ind, arr, target - arr[ind], res, li); // can reuse same index
	//            li.remove(li.size() - 1); // backtrack
	//        }
	//
	//        // not pick the current element
	//        findCombination(ind + 1, arr, target, res, li);
	//    }
}
