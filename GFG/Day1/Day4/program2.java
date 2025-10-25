package GFG.Day4;

import java.util.Arrays;
/*
Check Equal Arrays
Difficulty: EasyAccuracy: 42.18%Submissions: 412K+Points: 2Average Time: 30m
Given two arrays a[] and b[] of equal size, the task is to find whether the elements in the arrays are equal.
Two arrays are said to be equal if both contain the same set of elements, arrangements (or permutations) of elements may be different though.
Note: If there are repetitions, then counts of repeated elements must also be the same for two arrays to be equal.

Examples:

Input: a[] = [1, 2, 5, 4, 0], b[] = [2, 4, 5, 0, 1]
Output: true
Explanation: Both the array can be rearranged to [0,1,2,4,5]
Input: a[] = [1, 2, 5], b[] = [2, 4, 15]
Output: false
Explanation: a[] and b[] have only one common value.
* */
public class program2 {
    class Solution {
        public static boolean checkEqual(int[] a, int[] b) {
            // code here
            Arrays.sort(a);
            Arrays.sort(b);
            //return Arrays.equals(a,b);

            int i=0,j=0;
            while(i < a.length && j < b.length){
                if(a[i] != b[j]){
                    return false;
                }
                i++;
                j++;
            }

            return true;
        }
    }
}
