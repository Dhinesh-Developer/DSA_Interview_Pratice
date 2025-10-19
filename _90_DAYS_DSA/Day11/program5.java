package Day11;

public class program5 {
    public static void main(String[] args) {
        // maximum subarray sum (Kadane's algorithm)
        int[] arr = {1,2,3,4,5};
        int sum = maximumSubarraySum(arr);
        System.out.println(sum);
    }

    static int maximumSubarraySum(int[] arr){
        int n = arr.length;
        int maxSum = 0,sum = 0;
        for(int i=0;i<n;i++){
            sum += arr[i];
            if(sum < 0){
                sum = 0;
            }
            if(sum > maxSum){
                maxSum = sum;
            }
        }
        return maxSum;
    }
}
