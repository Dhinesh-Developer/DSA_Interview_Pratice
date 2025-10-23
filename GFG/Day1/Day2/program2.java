package GFG.Day2;

import java.util.Arrays;

public class program2 {
    class Solution {
        int thirdLargest(int arr[]) {

            // Arrays.sort(arr);

            // // initalize three variables
            // int fLargest = arr[0];
            // int sLargest = -1;
            // int tLargest = -1;

            // for(int i=0;i<arr.length;i++){
            //     if(arr[i] > fLargest){
            //         tLargest = sLargest;
            //         sLargest = fLargest;
            //         fLargest = arr[i];
            //     }else if(arr[i] > tLargest && arr[i] != sLargest && arr[i] != fLargest){
            //         tLargest = arr[i];
            //     }
            // }

            // return tLargest;

            if(arr.length < 3) return -1;
            Arrays.sort(arr);
            return arr[arr.length-3];
        }
    }
}
