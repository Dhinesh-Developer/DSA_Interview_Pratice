package Day3;

public class program1 {
    public static void main(String[] args) {

        // binary search problem
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int target = 5;
        int index = binarySearch(arr,target);
        System.out.println("Element found at the index: "+index);
    }

    private static int binarySearch(int[] arr,int target){


        // case 1: if the arr is empty
        if(arr.length<=0) return 0;

        // case 2:initialize variables
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            // handled the range error
            int mid=  start+(end-start)/2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] > target){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }

        // if the target is not present in the array
        return -1;
    }
}
