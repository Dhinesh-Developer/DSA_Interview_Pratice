package GFG.Day5;
import java.util.*;
/*
Array Subset
Difficulty: BasicAccuracy: 44.05%Submissions: 492K+Points: 1Average Time: 20m
Given two arrays a[] and b[], your task is to determine whether b[] is a subset of a[].

Examples:

Input: a[] = [11, 7, 1, 13, 21, 3, 7, 3], b[] = [11, 3, 7, 1, 7]
Output: true
Explanation: b[] is a subset of a[]
Input: a[] = [1, 2, 3, 4, 4, 5, 6], b[] = [1, 2, 4]
Output: true
Explanation: b[] is a subset of a[]
Input: a[] = [10, 5, 2, 23, 19], b[] = [19, 5, 3]
Output: false
Explanation: b[] is not a subset of a[]
Constraints:
1 <= a.size(), b.size() <= 105
1 <= a[i], b[j] <= 106
* */
public class program1 {

    class Solution {
        public boolean isSubset(int a[], int b[]) {
            // Approach 1: failed
            // Arrays.sort(a);
            // Arrays.sort(b);
            // int i=0,j=0;
            // while(i<a.length && j<b.length){
            //     if(a[i] == b[i]){
            //         i++;
            //         j++;
            //         continue;
            //     }else if(a[i] > b[i]){
            //         i++;
            //     }else{
            //         j++;
            //     }
            // }
            // return j==b.length?true:false;

            // Appraoch 2 : Using Map
            // Map<Integer,Integer> map = new HashMap<>();
            // for(int i=0;i<a.length;i++){
            //     map.put(a[i],map.getOrDefault(a[i],0)+1);
            // }

            // for(int i=0;i<b.length;i++){
            //     if(map.containsKey(b[i])){
            //         continue;
            //     }else{
            //         return false;
            //     }
            // }

            // return true;

            // Approach 3 : b contains duplicates also

            // Step 1: Sort both arrays
            Arrays.sort(a);
            Arrays.sort(b);

            int i = 0, j = 0;

            // Step 2: Traverse both arrays
            while (i < a.length && j < b.length) {
                if (a[i] == b[j]) {
                    // Found a match, move both
                    i++;
                    j++;
                } else if (a[i] < b[j]) {
                    // Move in 'a' until we find b[j]
                    i++;
                } else {
                    // a[i] > b[j], means b[j] not in a[]
                    return false;
                }
            }

            // If all elements of b[] were found
            return j == b.length;
        }
    }

}
