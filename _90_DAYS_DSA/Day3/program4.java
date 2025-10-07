package Day3;

import java.util.Arrays;

public class program4 {
    public static void main(String[] args) {

        int[] arr = {2, 3, 5, 5, 14, 16, 18};
        int target = 5;
        findFirstAndLastOccurences(arr, target);

    }

    private static void findFirstAndLastOccurences(int[] arr,int target){
        int[] ans = {-1,-1};

        ans[0] = binarySearch(arr,target,true);
        if(ans[0] != -1){
            ans[1] = binarySearch(arr,target,false);
        }

        System.out.println(Arrays.toString(ans));
    }

    private static int binarySearch(int[] arr,int target,boolean findFirstIndex){

        int start =0 ;
        int end = arr.length-1;
        int ans = -1;

        while(start <= end){
            int mid = start + (end-start)/2;
            if(target < arr[mid]){
                end = mid-1;
            }else if(target > arr[mid]){
                start = mid+1;
            }else{
                ans = mid;
                if(findFirstIndex){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
        }

        return ans;
    }
}
