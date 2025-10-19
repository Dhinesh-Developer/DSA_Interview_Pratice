package Day11;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class program6 {
    public static void main(String[] args) {

        // longest substring with given sum
        int[] arr = {10, 5, 2, 7, 1, 9};
        int k = 15;
        int res = longestSubstringWithGivenSum(arr,k); // 4
        System.out.println(res);
    }

    static int longestSubstringWithGivenSum(int[] arr,int k){
        int n = arr.length;
        int sum = 0;
        int maxLen = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            sum += arr[i];
            if(sum == k){
                maxLen = i+1;
            }

            if(map.containsKey(sum-k)){
                maxLen = Math.max(maxLen,i-map.get(sum-k));
            }

            map.putIfAbsent(sum,i);
        }
        return maxLen;

    }
}
