package Day11;

import java.util.Arrays;

public class program3 {
    public static void main(String[] args) {

        // subarray sum = k (positive numbers)
        int[] arr = {1,2,3,7,5};
        int k = 12;
        int[] res = subarray(arr,k);
        System.out.println(Arrays.toString(res)); //[1, 3]
    }

    static int[] subarray(int[] arr,int k){
        int n = arr.length;
        int left = 0,sum = 0;
        for(int right = 0;right < n;right++){
            sum += arr[right];
            while(sum >k && left <= right){
                sum -= arr[left];
                left++;
            }
            if(sum == k){
                return new int[]{left,right};
            }
        }
        return new int[]{};
    }
}
