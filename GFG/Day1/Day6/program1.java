package GFG.Day6;
import java.util.*;
public class program1 {
    class Solution {
        public List<Integer> frequencyCount(int[] arr) {
            // code here

            // case 1 : res array with size n
            int n = arr.length;
            //  index->i count
            Map<Integer,Integer> map = new TreeMap<>();
            // case 2 : create a map with the size n
            for(int x : arr){
                if(x >= 1 && x <= n)
                    map.put(x,map.getOrDefault(x,0)+1);
            }

            List<Integer> li = new ArrayList<>();
            for(int i=1;i<=n;i++){
                li.add(map.getOrDefault(i,0));
            }
            return li;
            // case 3 : store the data in the map i,arr[i]->count
            // case 4 : traverse in the map and return the value
        }
    }

}
