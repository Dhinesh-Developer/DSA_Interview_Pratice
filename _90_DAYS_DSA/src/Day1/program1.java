package Day1;
//Given an array of integers and a key, find whether the key is present in the array or not.
/*
Input
n = 5
arr = [3, 8, 2, 7, 9]
key = 7
*
Output
* Element found at index 3

*/

import org.jetbrains.annotations.NotNull;

public class program1 {
    public static void main(String[] args) {

        int[] arr = {3,8,2,7,9};
        int target = -1;
        int res = linearSearch(arr,target);
        System.out.println("Element is fount at the index: "+res);
    }


    public static int linearSearch(int @NotNull [] arr, int target){
        int n = arr.length;

        // case1: if the arr length is empty or null
        if(arr.length == 0 ){
            return -1;
        }

        // case 2: // linear search for target is present the array or not
        for(int i=0;i<n;i++){
            if(arr[i] == target){
                return i;
            }
        }

        // case 3: what if the target element is not present in the array
        return -1;

    }
}
