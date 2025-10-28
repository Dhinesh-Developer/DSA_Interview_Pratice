package GFG.Day7;

import java.util.Arrays;
/*
Count the triplets
Difficulty: EasyAccuracy: 25.67%Submissions: 224K+Points: 2
Given an array arr, count the number of distinct triplets (a, b, c) such that:

a + b = c

Each triplet is counted only once, regardless of the order of a and b.

Examples:

Input: arr[] = [1, 5, 3, 2]
Output: 2
Explanation: There are 2 triplets: 1 + 2 = 3 and 3 +2 = 5
Input: arr[] = [2, 3, 4]
Output: 0
Explanation: No such triplet exits
Constraints:
1 ≤ arr.size() ≤ 103
1 ≤ arr[i] ≤ 105
* */
public class program3 {
    class Solution {
        int countTriplet(int arr[]) {
            // Approach 1: partial
            // Map<Integer,Integer> map = new HashMap<>();
            // for(int i=0;i<arr.length;i++){
            //     map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            // }

            // Arrays.sort(arr);
            // int n = arr.length;
            // int cnt =0;
            // for(int i=1;i<n;i++){
            //     int a = arr[i-1];
            //     int b = arr[i];
            //     int c = a+b;
            //     if(map.containsKey(c)){
            //         cnt++;
            //     }
            // }

            // return cnt;

            // Approach 2: passed
            int n = arr.length;
            Arrays.sort(arr);
            int cnt = 0;
            for(int i=n-1;i>=2;i--){
                int target = arr[i];
                int j = 0;
                int k = i-1;
                while(j<k){
                    int sum = arr[j]+arr[k];
                    if(sum == target){
                        cnt++;
                        j++;
                        k--;
                    }else if(sum < target){
                        j++;
                    }else{
                        k--;
                    }
                }
            }
            return cnt;
        }
    }
}
