package Day1;

/*
🧩 Problem 5: Linear Search for Minimum Element

Statement:
Without using built-in functions, find the minimum element in an array using linear traversal.

input:
n = 7
arr = [8, 3, 1, 9, 5, 2, 6]

output:
Minimum element = 1

* */

public class program5 {
    public static void main(String[] args) {

        // only positive values
        //int[] arr = {8, 3, 1, 9, 5, 2, 6};

        // what if the array element also will be in negative element also
        int[] arr = {-12,-21,12,123,1,-123,123,23,0,-1};
        int res = findMinimumElement(arr);
        System.out.println("Minimum Element: "+res);
    }

    public static int findMinimumElement(int[] arr){

        // case 1: what if the array is empty
        if(arr.length==0){
            return -1;
        }

        // case 2: what if the constraints is range from - to  +
        // in that case we need to initialize the min variable to Integer.MAX_VALUE

        // case 3: what if the array contains the duplicates , in that case there will no issue case

        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i] < min){

                // we need to return the element instead of index.
                min = arr[i];
            }
        }


        //case 4: what if the min contains the Integer.MAX_VALUE
        return min==Integer.MAX_VALUE?-1:min;
    }
}
