package Day9;

import java.util.Arrays;

public class program2 {
    public static void main(String[] args) {

        // Find the second largest and second smallest element in the array
        int[] arr = {1,2,3,4,5};
        int[] res = findSecondLargestSmallest(arr);
        System.out.println(Arrays.toString(res));
    }

    static int[] findSecondLargestSmallest(int[] arr){
        int sLargest = Integer.MIN_VALUE;
        int sSmallest = Integer.MIN_VALUE;
        int largest = arr[0],smallest = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i] > largest){
                sLargest = largest;
                largest = arr[i];
            }else if(arr[i] > sLargest && arr[i] != largest){
                sLargest = arr[i];
            }
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i] < smallest){
                sSmallest = smallest;
                smallest = arr[i];
            }else if(arr[i] < sSmallest && arr[i] != smallest){
                sSmallest = arr[i];
            }
        }

        return new int[]{sLargest,sSmallest};
    }
}
