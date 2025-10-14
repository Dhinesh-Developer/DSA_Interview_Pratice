package Day7;

public class program3 {
    public static void main(String[] args) {

        // find sum of array element
        int[] arr = {1,2,3,4,5};
        int res = findSum(arr);
        System.out.println(res);
    }
    static int findSum(int[] arr){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        return sum;
    }
}
