package Day11;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class program4 {
    public static void main(String[] args) {

        // subarray sum = k (with negative numbers)
        int[] arr = {3,4,-7,1,3};
        int k = 7;
        int[] res = subarray(arr,k);
        System.out.println(Arrays.toString(res));  // [0, 1]
    }

    static int[] subarray(int[] arr,int k){
        int n = arr.length;
        Map<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        map.put(0,-1);
        for(int i=0;i<n;i++){
            sum += arr[i];
            if(map.containsKey(sum-k)){
                return new int[]{map.get(sum-k)+1,i};
            }
            map.putIfAbsent(sum,i);
        }
        return new int[]{};
    }
}
