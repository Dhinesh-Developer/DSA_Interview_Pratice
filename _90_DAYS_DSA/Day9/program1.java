package Day9;

import java.lang.reflect.Array;
import java.util.Arrays;

public class program1 {
    public static void main(String[] args) {

        // find min and max element in the array
        int[] arr = {1,2,3,4,5};
        int[] res = findMinMax(arr);
        System.out.println(Arrays.toString(res));
    }

    static int[] findMinMax(int[] arr){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i] > max){
                max = arr[i];
            }
        }

        return new int[]{min,max};
    }
}
