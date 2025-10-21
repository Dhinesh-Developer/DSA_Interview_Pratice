package Day12;
import java.util.*;
public class program4 {
    public static void main(String[] args) {

        // sliding window : count distinct elements in the every window of size k
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int k= 3;
        List<Integer> res = count(arr,k);
        System.out.println(res);
    }

    static List<Integer> count(int[] nums,int k){
        List<Integer> li = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        li.add(map.size());

        for (int i = k; i < n; i++) {
            int outGoing = nums[i - k];
            map.put(outGoing, map.get(outGoing) - 1);
            if (map.get(outGoing) == 0) {
                map.remove(outGoing);
            }
            int incoming = nums[i];
            map.put(incoming, map.getOrDefault(incoming, 0) + 1);
            li.add(map.size());
        }

        return li;

    }
}
