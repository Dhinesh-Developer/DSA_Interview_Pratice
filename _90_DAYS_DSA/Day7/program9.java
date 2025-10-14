package Day7;
import java.util.*;
public class program9 {
    public static void main(String[] args) {

        // find duplicates in the array
        int[] arr = {1,1,12,3,4,3,2,2,2,3,4,3,2,2};
       findDuplicates(arr);
//        System.out.println(res);
    }

    static void findDuplicates(int[] arr){
       Map<Integer,Integer> map = new HashMap<>();
       for(int i=0;i<arr.length;i++){
           map.put(arr[i],map.getOrDefault(arr[i],0)+1);
       }

       for(Map.Entry<Integer,Integer> x : map.entrySet()){
           if(x.getValue() >1){
               System.out.print(x.getKey()+" ");
           }
       }
    }
}
