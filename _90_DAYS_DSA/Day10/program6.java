package Day10;

import java.util.*;

public class program6 {
    public static void main(String[] args) {

        // Sort Elements bu frequency
        int[] arr = {1,1,2,2,2,3,3,3,3,3,4,4,4,4,5,5,5,5,6,6,6,77,7};
        sortElementsByFrequency(arr);

    }

    static void sortElementsByFrequency(int[] arr){
        int n = arr.length;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        List<Integer> li = new ArrayList<>();
        for(int x : arr){
            li.add(x);
        }

        Collections.sort(li,(a,b) -> {
            int freq = map.get(b)-map.get(a);
            if(freq == 0){
                return a-b;
            }
            return freq;
        });

        for(int x : li){
            System.out.print(x+" ");
        }
    }
}
