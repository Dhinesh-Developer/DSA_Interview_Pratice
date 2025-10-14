package Day7;

public class program2 {
    public static void main(String[] args) {

        // find the minimum in the array
        int[] arr = {1,2,3,4,5};
        int res = findMin(arr);
        System.out.println(res);
    }

    static int findMin(int[] arr){
        int smallest = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }
        return smallest;
    }
}
