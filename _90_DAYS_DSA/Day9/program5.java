package Day9;

public class program5 {
    public static void main(String[] args) {

        // check if the array is sorted
        int[] arr = {1,2,3,4,5};
        boolean res = isSorted(arr);
        System.out.println(res);
    }

    static boolean isSorted(int[] arr){
        boolean flag = true;
        for(int i=1;i<arr.length;i++){
            if(arr[i] > arr[i-1]){

            }else{
                flag = false;
            }
        }
        return flag;
    }
}
