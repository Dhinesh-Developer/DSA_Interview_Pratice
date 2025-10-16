package Day10;

public class program2 {
    public static void main(String[] args) {

        // Find peak element
        int arr[] = {1,2,3,4,5,4,3,2};
        int res = findPeakElement(arr);
        System.out.println(res);
    }

    static int findPeakElement(int[] arr){
        for(int i=1;i<arr.length-1;i++){
            if(arr[i] > arr[i-1] && arr[i] > arr[i+1]){
                return arr[i];
            }
        }
        return -1;
    }
}
