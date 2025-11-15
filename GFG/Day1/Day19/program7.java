package GFG.Day19;
import java.util.*;
/*
Frequencies in a Limited Array
You are given an array arr[] containing positive integers.
 The elements in the array arr[] range from  1 to n (where n is the size of the array),
 and some numbers may be repeated or absent.
  Your have to count the frequency of all numbers in the range 1 to n
   and return an array of size n such that result[i] represents the frequency of the number i (1-based indexing).

Examples:

Input: arr[] = [2, 3, 2, 3, 5]
Output: [0, 2, 2, 0, 1]
Explanation: We have: 1 occurring 0 times, 2 occurring 2 times, 3 occurring 2 times, 4 occurring 0 times, and 5 occurring 1 time.
Input: arr[] = [3, 3, 3, 3]
Output: [0, 0, 4, 0]
Explanation: We have: 1 occurring 0 times, 2 occurring 0 times, 3 occurring 4 times, and 4 occurring 0 times.
Input: arr[] = [1]
Output: [1]
Explanation: We have: 1 occurring 1 time, and there are no other numbers between 1 and the size of the array.
Constraints:
1 ≤ arr.size() ≤ 106
1 ≤ arr[i] ≤ arr.size()
* */
public class program7 {
    class Solution {
        public List<Integer> frequencyCount(int[] arr) {

            // Approach 1:
            int n = arr.length;
            Map<Integer,Integer> map = new TreeMap<>();
            for(int x : arr){
                if(x >= 1 && x <= n){
                    map.put(x,map.getOrDefault(x,0)+1);
                }
            }

            List<Integer> li = new ArrayList<>();
            for(int i=1;i<=n;i++){
                li.add(map.getOrDefault(i,0));
            }
            return li;
        }
    }

}
