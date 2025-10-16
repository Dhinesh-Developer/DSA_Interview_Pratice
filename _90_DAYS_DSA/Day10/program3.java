package Day10;

public class program3 {
    public static void main(String[] args) {

        // find missing number in sorted sequence
        int[] arr = {1,2,3,4,6,7,8,9};
        int res = findMissingElement(arr);
        System.out.println(res);
    }

    static int findMissingElement(int[] arr){
        int n = arr.length+1;
        int sum = n*(n+1)/2;
        int cnt = 0;
        for(int i=0;i<arr.length;i++){
            cnt += arr[i];
        }

        return sum-cnt;
    }
}
