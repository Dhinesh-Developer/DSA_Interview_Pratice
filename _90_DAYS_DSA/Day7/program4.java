package Day7;

public class program4 {
    public static void main(String[] args) {

        // find average of array element
        int[] arr = {1,2,3,4,5};
        int res = findAverage(arr);
        System.out.println(res);
    }
    static int findAverage(int[] arr){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }

        int n = arr.length;
        return sum/n;
    }
}
