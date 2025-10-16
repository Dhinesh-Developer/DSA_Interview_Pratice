package Day9;

import java.util.*;

public class program4 {
    public static void main(String[] args) {

        // Find frequency of each element in the array
        int[] arr = {1,1,1,2,3,3,2,4,5,3,3,2,4,5,4,3,4,5,67,6,5,4,4,4,54,6,6,4,4,3};
        findFrequency(arr);
    }
    static void findFrequency(int[] arr){
        Map<Integer,Integer> map  =new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        System.out.println(map);
    }
}
