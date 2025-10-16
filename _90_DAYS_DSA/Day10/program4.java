package Day10;

import java.util.Arrays;

public class program4 {
    static void sort(int[] arr){
        int low=0,mid=0,high=arr.length-1;
        while(mid <= high){
            if(arr[mid] == 0){
                int temp = arr[low];
                arr[low++] = arr[mid];
                arr[mid++] = temp;
            }else if(arr[mid] == 1){
                mid++;
            }else{
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high--] = temp;
            }
        }
    }

    public static void main(String[] args) {
        // Sort 0'1,1's,2's using using Dutch National flag algorithm
        int[] arr = {3,4,2,1,5};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort012(int[] nums){
        int low =0 ,mid=0,high = nums.length-1;
        while(mid <= high){
            if(nums[mid] == 0){
                int temp = nums[low];
                nums[low++] =nums[mid];
                nums[mid++] = temp;
            }else if(nums[mid] == 1){
                mid++;
            }else{
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high--] = temp;
            }
        }
    }
}
