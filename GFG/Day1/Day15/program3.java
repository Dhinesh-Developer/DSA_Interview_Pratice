package GFG.Day15;

import java.util.ArrayList;
/*
First and Last Occurrences
Given a sorted array arr with possibly some duplicates, the task is to find the first and last occurrences of an element x in the given array.
Note: If the number x is not found in the array then return both the indices as -1.

Examples:

Input: arr[] = [1, 3, 5, 5, 5, 5, 67, 123, 125], x = 5
Output: [2, 5]
Explanation: First occurrence of 5 is at index 2 and last occurrence of 5 is at index 5
Input: arr[] = [1, 3, 5, 5, 5, 5, 7, 123, 125], x = 7
Output: [6, 6]
Explanation: First and last occurrence of 7 is at index 6
Input: arr[] = [1, 2, 3], x = 4
Output: [-1, -1]
Explanation: No occurrence of 4 in the array, so, output is [-1, -1]
Constraints:
1 ≤ arr.size() ≤ 106
1 ≤ arr[i], x ≤ 109
* */
public class program3 {

    class GFG {
        public int findOccurences(int[] arr,int x,boolean firstIndex){
            int start = 0;
            int end = arr.length-1;
            int ans = -1;

            while(start <= end){
                int mid = start+(end-start)/2;
                if(arr[mid] == x){
                    ans = mid;
                    if(firstIndex){
                        end = mid-1;
                    }else{
                        start = mid+1;
                    }
                }else if(arr[mid] < x){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }

            return ans;
        }
        ArrayList<Integer> find(int arr[], int x) {
            // brute force
            // ArrayList<Integer> li = new ArrayList<>();
            // int n = arr.length;
            // int first = -1,last = -1;
            // for(int i=0;i<n;i++){
            //     if(arr[i] == x){
            //         if(first == -1){
            //             first = i;
            //         }
            //         last = i;
            //     }
            // }
            // li.add(first);
            // li.add(last);
            // return li;

            // Approach 2: using binary search.
            ArrayList<Integer> li = new ArrayList<>();
            int firstIndex = findOccurences(arr,x,true);
            int lastIndex = findOccurences(arr,x,false);

            li.add(firstIndex);
            li.add(lastIndex);
            return li;

        }
    }

}
