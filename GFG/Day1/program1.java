package GFG.Day10;
import java.util.*;
/*
Count Inversions
Difficulty: MediumAccuracy: 16.93%Submissions: 721K+Points: 4
Given an array of integers arr[]. You have to find the Inversion Count of the array.
Note : Inversion count is the number of pairs of elements (i, j) such that i < j and arr[i] > arr[j].

Examples:

Input: arr[] = [2, 4, 1, 3, 5]
Output: 3
Explanation: The sequence 2, 4, 1, 3, 5 has three inversions (2, 1), (4, 1), (4, 3).
Input: arr[] = [2, 3, 4, 5, 6]
Output: 0
Explanation: As the sequence is already sorted so there is no inversion count.
Input: arr[] = [10, 10, 10]
Output: 0
Explanation: As all the elements of array are same, so there is no inversion count.
Constraints:
1 ≤ arr.size() ≤ 105
1 ≤ arr[i] ≤ 104
*/
public class program1 {
    class Solution {
        static int inversionCount(int arr[]) {

            // Approach 1: Partial -> time limit exceed
            // int cnt = 0;
            // for(int i=0;i<arr.length;i++){
            //     for(int j=0;j<arr.length;j++){
            //         if( i<j && arr[i] > arr[j]){
            //             cnt++;
            //         }
            //     }
            // }
            // return cnt;

            // Approch 2 : Merge technique
            int n = arr.length;
            return m(arr,0,n-1);
        }
        public static int m(int[] arr,int low,int high){
            int cnt =0 ;
            if(low >= high) return cnt;
            int mid = (low+high)/2;
            cnt += m(arr,low,mid); // left half
            cnt += m(arr,mid+1,high); //right half
            cnt += merge(arr,low,mid,high); // merge step
            return cnt;
        }

        public static int merge(int[] arr,int low,int mid,int high){
            ArrayList<Integer> li = new ArrayList<>();
            int left=low,right=mid+1,cnt=0;
            while(left <= mid && right <= high){
                if(arr[left] <= arr[right]){
                    li.add(arr[left]);
                    left++;
                }else{
                    li.add(arr[right]);
                    cnt += (mid-left+1); // count inversions
                    right++;
                }
            }

            while(left <= mid){
                li.add(arr[left]);
                left++;
            }

            while(right <= high){
                li.add(arr[right]);
                right++;
            }

            for(int i=low;i<=high;i++){
                arr[i] = li.get(i-low);
            }
            return cnt;
        }
    }
}
