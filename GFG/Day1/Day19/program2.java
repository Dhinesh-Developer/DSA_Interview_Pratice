package GFG.Day19;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;
/*
Array Duplicates
Given an array arr[] of size n, containing elements from the range 1 to n, and each element appears at most twice,
 return an array of all the integers that appears twice.
Note: You can return the elements in any order but the driver code will print them in sorted order.

Examples:

Input: arr[] = [2, 3, 1, 2, 3]
Output: [2, 3]
Explanation: 2 and 3 occur more than once in the given array.
Input: arr[] = [3, 1, 2]
Output: []
Explanation: There is no repeating element in the array, so the output is empty.
Constraints:
1 ≤ n ≤ 106
1 ≤ arr[i] ≤ n
* */
public class program2 {
    class Solution {
        public ArrayList<Integer> findDuplicates(int[] arr) {

            // Approach 1: brute force
            // Arrays.sort(arr);
            // ArrayList<Integer> li = new ArrayList<>();
            // for(int i=0;i<arr.length-1;i++){
            //   if(arr[i] == arr[i+1]){
            //         li.add(arr[i]);
            //     }
            // }
            // return li;

            // Approach 2: Using set
            ArrayList<Integer> li = new ArrayList<>();
            Set<Integer> set = new TreeSet<>();
            for(int i=0;i<arr.length;i++){
                if(set.contains(arr[i])){
                    li.add(arr[i]);
                }else{
                    set.add(arr[i]);
                }
            }
            return li;

        }
    }
}
