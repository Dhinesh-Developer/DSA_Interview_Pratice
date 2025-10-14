package Day7;

public class program5 {
    public static void main(String[] args) {

        // Reverse an array
        int[] arr = {1,2,3,4,5};
        reverse(arr);
        for(int x : arr){
            System.out.print(x+" ");
        }
    }

    static void reverse(int[] arr){

        int left=0,right = arr.length-1;
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
