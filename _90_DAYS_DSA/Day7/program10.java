package Day7;

import java.util.Arrays;

public class program10 {
    public static void main(String[] args) {

        // Rotate array by 1
        int[] arr = {1,2,3,4,5};
        rotateArray(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void rotateArray(int[] arr){
        int temp = arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
    }
}
