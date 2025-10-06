package Day2;

/*
🧩 Problem 3 – Check if Array Is Sorted

Statement:
Use linear traversal to determine whether the given array is sorted in non-decreasing order.

Input:
n = 5
arr = [2, 4, 6, 8, 10]
Output:
Array is sorted

Another Example Input:
arr = [1, 5, 3, 9]
Output:
Array is not sorted
* */

public class program3 {
    public static void main(String[] args) {

//        int[] arr = {2,4,6,8,10};
        int[] arr = {1, 5, 3, 9};
        boolean res = isSorted(arr);
        System.out.println(res);
    }

    private static boolean isSorted(int[] arr){

        // case 1: what if the arr is empty
        if(arr.length<=0) return false;

        // case 2: check is sorted or not
        // checking for each condition arr[i]>arr[i-1] i.e., 4>=2, 6>=4 like that to the end
        for(int i=1;i<arr.length;i++){
            if(arr[i] > arr[i-1]){

            }else{
                return false;
            }
        }

        // if the arr traversal at end means the array is sorted
        return true;
    }
}













