package Day2;

/*
🧩 Problem 4 – Search for Multiple Keys
Statement:
Given an array and two keys, print whether both are present in the array.

Input:
n = 7
arr = [11, 5, 7, 9, 3, 2, 10]
key1 = 7
key2 = 4

Output:
Key1 found
Key2 not found
* */

import java.util.Arrays;

public class program4 {
    public static void main(String[] args) {

        int[] arr = {11, 5, 7, 9, 3, 2, 10};
        int key1 = 7;
        int key2 = 4;
        boolean[] res = isContains(arr,key1,key2);
        System.out.println(Arrays.toString(res));
    }

    private static boolean[] isContains(int[] arr,int key1,int key2){
        int n = arr.length;
        boolean[] res = new boolean[2];

        // what if the array is empty
        if(n <=0) return new boolean[]{false};

        // case 2: check for both the keys are present
        for(int i=0;i<n;i++){
            if(arr[i] == key1){
                res[0] = true;
//                System.out.println("Key1 found");
            }
            if(arr[i] == key2){
                res[1] = true;
//                System.out.println("Key2 found");
            }
        }

        // case 3: if the keys are not found in the array
        return res;
    }
}
