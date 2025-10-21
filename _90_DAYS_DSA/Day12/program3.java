package Day12;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class program3 {
    public static void main(String[] args) {

        // sliding window : first negative number in every window of size k
//        arr = [12, -1, -7, 8, -15, 30, 16, 28], k = 3
        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;
        int[] res = slidingWindow2(arr);
        System.out.println(Arrays.toString(res));
    }

    static int[] slidingWindow2(int[] nums){
        Deque<Integer> dq = new LinkedList<>();
        int n = nums.length;
        int[] res = new int[n];
        int ind = 0, k = 0;
        for (int i = 0; i < nums.length; i++) {
            while (!dq.isEmpty() && dq.peekFirst() < i - k + 1) {
                dq.pollFirst();
            }

            if (nums[i] < 0) {
                dq.offerLast(i);
            }
            if (i >= k - 1) {
                if (!dq.isEmpty()) {
                    res[ind++] = nums[dq.pollFirst()];
                }
            }
        }
        return res;

    }
}
