package Day2;

/*
🧩 Problem 5 – Search for Closest Element
Statement:
Given an array and a number x, find the element closest to x.

Input:
n = 6
arr = [2, 5, 9, 12, 15, 18]
x = 10

Output:
Closest element = 9
* */
public class program5 {
    public static void main(String[] args) {
//        int[] arr = {2,5,9,12,15,18};
        int[] arr = {5,5,5,5,5,5};
        int key = 10;
        int res = findClosest(arr,key);
        System.out.println("Closest Element: "+res);
    }

    private static int findClosest(int[] arr,int key){

        // case 1: what if the arr is empty
        if(arr.length <=0) return -1;


        // case 2: traverse and check the possibilities
        // case 3: what if the array contains the same element like this .. 5,5,5,5,5,5
        // in that case the element should be the answer
        // check if the key is greater than tht closest element -> This is the condition.
        int maxi = 0;
        int isPossible = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] < key){
                isPossible = arr[i];
                maxi = Math.max(maxi,isPossible);
            }
        }

        // case 4: what if the max if zero i.e., in arr the key is smaller that the all arr element
        return maxi==0?-1:maxi;

        // return the closest element for that particular key
      //  return maxi;
    }
}
