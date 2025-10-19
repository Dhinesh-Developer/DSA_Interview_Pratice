package Day11;

import java.util.Arrays;

public class program1 {
    public static void main(String[] args) {

        // prefix sum array
        int[] arr = {1,2,3,4,5};
        int[] res = prefixSum(arr);
        System.out.println(Arrays.toString(res)); // [1, 3, 6, 10, 15]

    }

    static int[] prefixSum(int[] arr){
        int n = arr.length;
        int[] res = new int[n];
        int ind = 0;
        res[ind++] = arr[0];
        for(int i=1;i<n;i++){
            res[ind++] = res[i-1]+arr[i];
        }
        return res;
    }
}
