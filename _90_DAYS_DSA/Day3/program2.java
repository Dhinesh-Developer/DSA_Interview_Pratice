package Day3;
// ceiling number using the binary search
public class program2 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        int ans = ceiling(arr, target);
        System.out.println(ans);
    }

    // return the index of smallest number >= target
    static int ceiling(int[] arr,int target){

        // what if the target is greater than the greatest element in the array
        if(target > arr[arr.length-1]){
            return -1;
        }

        int start = 0,end = arr.length-1;
        while(start <= end){
            // where (start+end) might be the possible to exceeds the range in java (int)
            int mid = start + (end-start)/2;
            if(target < arr[mid]){
                end = mid-1;
            }else if(target > arr[mid]){
                start = mid+1;
            }else{
                return mid;
            }
        }
        return start;
    }
}
