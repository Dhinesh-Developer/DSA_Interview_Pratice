package GFG.Day8;
import java.util.*;
/*
Remove Duplicates Sorted Array
Difficulty: EasyAccuracy: 38.18%Submissions: 330K+Points: 2Average Time: 20m
You are given a sorted array arr[] containing positive integers. Your task is to remove all duplicate elements from this array such that each element appears only once. Return an array containing these distinct elements in the same order as they appeared.
Examples :

Input: arr[] = [2, 2, 2, 2, 2]
Output: [2]
Explanation: After removing all the duplicates only one instance of 2 will remain i.e. [2] so modified array will contains 2 at first position and you should return array containing [2] after modifying the array.
Input: arr[] = [1, 2, 4]
Output: [1, 2, 4]
Explation:  As the array does not contain any duplicates so you should return [1, 2, 4].
Constraints:
1 ≤ arr.size() ≤ 105
1 ≤ arr[i] ≤ 106
* */
public class program3 {
    class Solution {
        // Function to remove duplicates from the given array.
        ArrayList<Integer> removeDuplicates(int[] arr) {
            // Approach 1:
            // ArrayList<Integer> li = new ArrayList<>();
            // Set<Integer> set = new TreeSet<>();
            // for(int x : arr) set.add(x);

            // for(int x : set){
            //     li.add(x);
            // }

            // return li;

            // Approach 2:

            ArrayList<Integer> li = new ArrayList<>();
            // First element will always be unique
            li.add(arr[0]);
            for(int i=1;i<arr.length;i++){
                if(arr[i-1] != arr[i]){
                    li.add(arr[i]);
                }
            }
            return li;
        }
    }

}
