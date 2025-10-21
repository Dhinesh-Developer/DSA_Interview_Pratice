package Day12;

public class program2 {
    public static void main(String[] args) {

        // sliding window : maximum sum subarray of size k
        int[] arr = {1,2,3,4,5};
        int k = 2;
        int res = slidinwWindow(arr,k);
        System.out.println(res);
    }

    static int slidinwWindow(int[] arr,int k){
        int n = arr.length;
        int maxSum = 0;
        int windowSum = 0;
        for(int x : arr) windowSum += x;

        maxSum = windowSum;
        for(int i=k;i<n;i++){
            windowSum += arr[i] - arr[i-k];
            maxSum = Math.max(windowSum,maxSum);
        }

        return maxSum;
    }
}
