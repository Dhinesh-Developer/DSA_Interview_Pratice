package Day12;

public class program1 {
    public static void main(String[] args) {

        // Maximum product subarray
        int[] arr = {1,2,3,4,5};
        int res = maximumProductSubarray(arr);
        System.out.println(res);
    }

    static int maximumProductSubarray(int[] arr){
        int n = arr.length;
        int max = arr[0];
        int min = arr[0];
        int res = arr[0];
        for(int i=0;i<n;i++){
            int num = arr[i];
            if(num < 0){
                int temp = max;
                max = min;
                min = temp;
            }

            max = Math.max(num,max);
            min = Math.min(num,min);
            res = Math.max(res,max);
        }
        return res;
    }

}
