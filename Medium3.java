
import java.util.*;

public class Medium3 {

    private static int[] prefixSum(int[] nums) {
        int[] res = new int[nums.length];
        int n = nums.length;
        int ind = 0;
        res[ind++] = nums[0];
        for (int i = 1; i < n; i++) {
            res[ind++] = res[i - 1] + nums[i];
        }
        return res;
    }

    private static int equilbriumIndex(int[] nums) {
        int n = nums.length;
        int totalSum = 0;
        for (int x : nums) {
            totalSum += x;
        }
        int leftSum = 0;
        for (int i = 0; i < n; i++) {
            int rightSum = totalSum - leftSum - nums[i];
            if (rightSum == leftSum) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }

    private static int[] subarraySum(int[] nums) {
        int left = 0;
        int sum = 0;
        int n = nums.length;
        int k = 12;
        for (int right = 0; right < n; right++) {
            sum += nums[right];
            while (sum > k && left <= right) {
                sum -= nums[left];
                left++;
            }

            if (sum == k) {
                return new int[]{left, right};
            }
        }
        return new int[]{};
    }

    private static int[] subarraySumNegative(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int k = 7;
        map.put(0, -1);
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            if (map.containsKey(sum - k)) {
                return new int[]{map.get(sum - k) + 1, i};
            }
            map.putIfAbsent(sum, i);
        }
        return new int[]{};
    }

    private static int maximumSum(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int maxSum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];

            if (sum > maxSum) {
                maxSum = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return maxSum;
    }

    private static int maximumProductSubarray(int[] nums) {
        int n = nums.length;
        int max = nums[0];
        int min = nums[0];
        int res = nums[0];
        for (int i = 0; i < n; i++) {
            int num = nums[i];
            if (num < 0) {
                int temp = max;
                max = min;
                min = temp;
            }

            max = Math.max(num, max);
            min = Math.min(num, min);
            res = Math.max(res, max);
        }

        return res;
    }

    private static int longestSubstringwithGivenK(int[] nums) {
        int k = 15;
        int sum = 0;
        int maxLen = 0;
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            if (sum == k) {
                maxLen = i + 1;
            }
            if (map.containsKey(sum - k)) {
                map.put(maxLen, i - map.get(sum - k));
            }

            map.putIfAbsent(sum, i);
        }
        return maxLen;
    }

    private static int slidingWindow1(int[] nums) {
        int n = nums.length;
        int maxSum = 0;
        int k = 3;
        int windowSum = 0;
        for (int i = 0; i < n; i++) {
            windowSum += nums[i];
        }

        maxSum = windowSum;
        for (int i = k; i < n; i++) {
            windowSum += nums[i] - nums[i - k];
            maxSum = Math.max(windowSum, maxSum);
        }
        return maxSum;
    }

    private static int[] slidingWindow2(int[] nums) {
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

    private static List<Integer> slidingWindow3(int[] nums) {
        List<Integer> li = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        int k = 4;
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

    private static void printArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = in.nextInt();
        }

        //71. prefix sum array
        int[] res1 = prefixSum(ar);
        printArray(res1);

        //72. equilbrium index
        int res2 = equilbriumIndex(ar);
        System.out.println(res2);

        //73. subarray sum =k (postive numbers); 1 2 3 7 5  12
        int[] res3 = subarraySum(ar);
        printArray(res3);

        //74. subrarray sum = k (negative numbers); 3 4 -7 1 3  7
        int[] res4 = subarraySumNegative(ar);
        printArray(res4);

        //75. maximum subarray sum (kadane's algorithm)
        int res5 = maximumSum(ar);
        System.out.println(res5);

        //76. longest substring with given sum.
        int res6 = longestSubstringwithGivenK(ar);
        System.out.println(res6);

        // 77. maximum product subarray
        int res7 = maximumProductSubarray(ar);
        System.out.println(res7);

        //78.sliding window : maximum sum subarray of size k
        int res8 = slidingWindow1(ar);
        System.out.println(res8);

        // arr = [12, -1, -7, 8, -15, 30, 16, 28], k = 3
        //79. sliding window : first negative number in every window of size k.
        int[] res9 = slidingWindow2(ar);
        printArray(res9);

        //80. sliding window : count distinct elements in every window of size k
        slidingWindow3(ar);

    }
}
