package Day9;

public class program7 {
    public static void main(String[] args) {

        // binary search in the sorted array
        int[] arr = {1,2,3,4,5};
        int target = 3;
        int index = findSearchElement(arr,target);
        System.out.println(index);
    }

    static int findSearchElement(int[] arr,int target){

        int left =0,right = arr.length-1;
        while(left <= right){
            int mid = left+(right-left)/2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] > target){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return -1;
    }
}
