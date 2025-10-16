package Day9;

import java.util.Arrays;

public class program8 {
    public static void main(String[] args) {

        // first and last occurences of an element
        int[] arr = {1,1,13,4,3,3,2,2,1};
        int target = 1;
        int[] res = findOccurences(arr,target);
        System.out.println(Arrays.toString(res));
    }

    static int[] findOccurences(int[] arr,int target){
        int[] res = new int[2];
        int first = -1,last=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target && first == -1){
                first = i;
            }else if(arr[i] == target && first != -1){
                last = i;
            }
        }
        res[0] = first;
        res[1] = last;
        return res;
    }
}
