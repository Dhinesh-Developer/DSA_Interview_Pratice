package Day7;

public class program1 {
    public static void main(String[] args) {

        // find the maximum in the array
        int[] arr = {1,2,3,4,5};
        int res = findMax(arr);
        System.out.println(res);
    }

    static int findMax(int[] arr){
        int largest = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
    }
}
