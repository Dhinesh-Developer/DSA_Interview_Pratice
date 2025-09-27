
import java.util.*;

public class Medium5 {

    private static int majorityElement1(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        int k = n / 2;
        for (Map.Entry<Integer, Integer> x : map.entrySet()) {
            if (x.getValue() > k) {
                return x.getKey();
            }
        }
        return -1;
    }

    private static int majorityElement2(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int k = n / 3;
        for (Map.Entry<Integer, Integer> x : map.entrySet()) {
            if (x.getValue() > k) {
                return x.getKey();
            }
        }
        return -1;
    }

    private static void twoSumClosedToZero(int[] nums) {
        int n = nums.length;
        int left = 0, right = n - 1;
        int minSum = Integer.MAX_VALUE;
        int num1 = 0, num2 = 0;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (Math.abs(sum) < Math.abs(minSum)) {
                minSum = sum;
                num1 = nums[left];
                num2 = nums[right];
            }
            if (sum < 0) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println("Two numbers with sum closest to zero: " + num1 + " and " + num2);
        System.out.println("Closest Sum: " + (num1 + num2));
    }

    private static int longestSubarrayLength(int[] nums) {
        int n = nums.length;
        int count0 = 0, count1 = 0, count2 = 0;
        Map<String, Integer> map = new HashMap<>();
        int maxLen = 0;
        map.put("0#0", -1);
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                count0++; 
            }else if (nums[i] == 1) {
                count1++; 
            }else {
                count2++;
            }

            int diff1 = count1 - count0;
            int diff2 = count2 - count1;

            String key = diff1 + "#" + diff2;
            if (map.containsKey(key)) {
                maxLen = Math.max(maxLen, i - map.get(key));
            } else {
                map.put(key, i);
            }
        }
        return maxLen;
    }

    private static int longestSubarrayCount(int[] nums) {
        int n = nums.length;
        Map<String, Integer> map = new HashMap<>();
        int cnt0 = 0, cnt1 = 0, cnt2 = 0;
        int res = 0;
        map.put("0#0", -1);
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                cnt0++; 
            }else if (nums[i] == 1) {
                cnt1++; 
            }else if (nums[i] == 2) {
                cnt2++;
            }

            int diff1 = cnt1 - cnt0;
            int diff2 = cnt2 - cnt1;

            String key = diff1 + "#" + diff2;
            if (map.containsKey(key)) {
                res += map.get(key);
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }
        return res;
    }

    private static int countPairs(int[] nums) {
        int n = nums.length;
        int cnt = 0;
        int k = 5;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int target = nums[i] ^ k;
            if (map.containsKey(target)) {
                cnt += map.get(target);
            }

            map.put(i, map.getOrDefault(nums[i], 0) + 1);
        }
        return cnt;
    }

    private static void missingAndRepeatingElement(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        int missing = -1, repeating = -1;
        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for (Map.Entry<Integer, Integer> x : map.entrySet()) {
            if (x.getValue() > 1) {
                repeating = x.getKey();
            }
        }

        int sum = n * (n + 1) / 2;
        int cnt = 0;
        for (int x : nums) {
            cnt += x;
        }

        missing = (sum - cnt)+1;

        System.out.println("Missing: " + missing + " Repeating: " + repeating);
    }

    private static int longestSubarrayWithAllDistinctElement(int[] nums){
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        int len = 0;
        int left = 0;
        for(int i=0;i<n;i++){
            if(set.contains(nums[i])){
                set.remove(nums[left]);
                left++;
            }
            set.add(nums[i]);
            len = Math.max(len, i-left+1);
        }
        return len;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {s
            nums[i] = in.nextInt();
        }

        //91. Majority Element (>n/2 times)  7    2 2 1 1 1 2 2      2
        /* int res1 = majorityElement1(nums);
        System.out.println(res1); */



        //92. Elements appearing more than n/3 times  7      3 2 3 2 2 1 1      2  
        /* int res2 = majorityElement2(nums);
        System.out.println(res2); */


        //93. Two numbers with sum closed to zero   6    1 60 -10 70 -80 85    -10
        /* TwoSumClosedToZero(nums); */



        //94. longest subarray with equals 0's,1's,2's  10    0 1 0 2 1 0 1 2 0 1    6
        /* int res4 = longestSubarrayLength(nums);
        System.out.println(res4); */



        //95. count subarray with equals 0's,1's,2's 10    0 1 0 2 1 0 1 2 0 1    8
        /* int res5 = longestSubarrayCount(nums);
        System.out.println(res5); */



        //96. count pairs with given XOR  6    5 4 10 15 7 6   2
        /* int res6 = countPairs(nums);
        System.out.println(res6); */


        //97. Find missing and repeating element
       /*  missingAndRepeatingElement(nums); */

        //98. longest subarray with all distinct element  8   1 2 3 1 2 3 4 5   5
        int res8 = longestSubarrayWithAllDistinctElement(nums);
        System.out.println(res8);

    }
}
