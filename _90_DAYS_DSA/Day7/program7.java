package Day7;

import javax.swing.plaf.SliderUI;

public class program7 {
    public static void main(String[] args) {

        // find the second largest element in the array
        int[] arr = {1,2,3,4,5};
        int res = findSecondLargestElement(arr);
        System.out.println(res);
    }

    static int findSecondLargestElement(int[] arr){
        int largest = arr[0];
        int sLargest = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > largest){
                sLargest = largest;
                largest = arr[i];
            }else if(arr[i] > sLargest && arr[i] != largest){
                sLargest=  arr[i];
            }
        }
        return sLargest;
    }
}
