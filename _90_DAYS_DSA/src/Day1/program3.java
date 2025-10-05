package Day1;

/*
🧩 Problem 3: Find First and Last Occurrence
Statement:
Find the first and last index of a given element using linear search.

input
n = 8
arr = [5, 1, 2, 5, 7, 5, 9, 5]
key = 5

output
First Occurrence: 0
Last Occurrence: 7

* */

import java.util.Arrays;

public class program3 {
    public static void main(String[] args) {

        int[] arr = {5};
        int key = 5;
        int[] res = findOccurences(arr,key);
        System.out.println(Arrays.toString(res));
    }

    public static int[] findOccurences(int[] arr,int key){

        int[] res = new int[2];

        // case 1 :what if the arr contains one element that element is the target element na
        if(arr.length==1 && arr[0] == key){
            res[0] = 0;
            res[1] = 0;
            return res;
        }

        // case 2: count occurences
        int first = -1;
        int last = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == key){
                if(first == -1){
                    first = i;
                }else if(first != -1){
                    last = i;
                }
            }
        }

        res[0] = first;
        res[1] = last;
        return res;

    }
}
