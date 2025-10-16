package Day10;

import java.util.Arrays;

public class program5 {
    public static void main(String[] args) {

        // Find kth largest/smallest Element in the array
        int[] arr = {1,2,3,4,5,6};
        int k = 3;
        int res = findKthLargest(arr,k);
        int res2 = findKthSmallest(arr,k);
        System.out.println(res2);
        System.out.println(res);
    }

    static int findKthLargest(int[] arr,int k){
        Arrays.sort(arr);
        return arr[arr.length-k];
    }

    static int findKthSmallest(int[] arr,int k){
        Arrays.sort(arr);
        return arr[k-1];
    }
}
