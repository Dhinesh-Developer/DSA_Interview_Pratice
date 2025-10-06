package Day2;
/*
🧩 Problem 2 – Search for Maximum Element\
Statement:
Find the maximum element in the array using linear search (no built-ins).

Input:
n = 6
arr = [12, 45, 23, 51, 19, 8]

Output:
Maximum element = 51
*
* */
public class program2 {
    public static void main(String[] args) {

        int[] arr = {12, 45, 23, 51, 19, 8};
        int res = findMaximium(arr);
        System.out.println(res);
    }
    private static int findMaximium(int[] arr){

        // case 1: what if  the array is empty
        if(arr.length<=0) return -1;

        // case 2: find maximum Element in the array
        // if the array contains negative number also, so that why taking as MIN_VALUE
        // -or- use Maxi = arr[0]
        int Maxi=  Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > Maxi){
                Maxi = arr[i];
            }
        }


        // case 3: return the max value ,what if it maximum is in the MIN_VALUE;
        return Maxi==Integer.MIN_VALUE?-1:Maxi;

    }

}
