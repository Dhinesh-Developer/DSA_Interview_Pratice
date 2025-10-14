package Day7;

import java.util.Arrays;

public class program8 {
    public static void main(String[] args) {

        //  count even and odd numbers in the array
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] res = countEvenOdd(arr);
        System.out.println(Arrays.toString(res));
    }

    static int[] countEvenOdd(int[] arr){
        int[] res = new int[2];
        int odd = 0;
        int even = 0;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                even++;
            }else{
                odd++;
            }
        }
        res[0] = odd;
        res[1] = even;
        return res;
    }
}
