
import java.util.*;

public class Medium4 {

    private static boolean TwoSum(int[] nums) {
        int left = 0;
        int target = 9;
        int right = nums.length - 1;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                return true;
            } else if (sum > target) {
                right--;
            } else {
                left++;
            }
        }
        return false;
    }

    private static List<List<Integer>> TripletWithGivenSum(int[] nums) {
        List<List<Integer>> li = new ArrayList<>();
        int n = nums.length;
        int target = 15;
        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && nums[i] == nums[i + 1]) {
                i++;
            }
            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == target) {
                    li.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j + 1]) {
                        j++;
                    }
                    while (j < k && nums[k] == nums[k - 1]) {
                        k--;
                    }
                } else if (sum > target) {
                    k--;
                } else {
                    j++;
                }

            }
        }
        return li;
    }

    private static void moveAllZerosToEnd(int[] nums) {
        int n = nums.length;
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[j++] = nums[i];
            }
        }
        while (j < nums.length) {
            nums[j++] = 0;
        }

    }

    private static int removeDuplicates(int[] nums) {
        int n = nums.length;
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }
        }
        return j + 1;
    }

    private static int rainWater(int[] nums) {
        int n = nums.length;
        int left = 0, right = nums.length - 1;
        int leftMax = 0, rightMax = 0;
        int water = 0;
        while (left < right) {
            if (nums[left] < nums[right]) {
                if (nums[left] >= leftMax) {
                    leftMax = nums[left];
                } else {
                    water += leftMax - nums[left];
                }
                left++;
            } else {
                if (nums[right] >= rightMax) {
                    if (nums[right] >= rightMax) {
                        rightMax = nums[right];
                    } else {
                        water += rightMax - nums[right];
                    }
                }
                right--;
            }
        }
        return water;
    }

    private static int containerWithMostWater(int[] nums) {
        int n = nums.length;
        int left = 0, right = nums.length - 1;
        int maxArea = 0;
        while (left < right) {
            int width = right - left;
            int height = Math.min(nums[left], nums[right]);
            int area = width * height;
            maxArea = Math.max(area, maxArea);

            if (nums[left] < nums[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }

    private static int minimumSwaps(int[] nums){
        int n = nums.length;
        int good = 0;
        int k = 3;
        for(int x : nums){
            if(x <= k) good++;
        }

        if(good ==0 || good == n) return 0;

        int bad =0;
        for(int i=0;i<good;i++){
            if(nums[i] > k) bad++;
        }

        int ans = bad;
        for(int i=0,j=good;j<n;i++,j++){
            if(nums[i] > k) bad--;
            if(nums[j] > k) bad++;
            ans = Math.min(ans,bad);
        }
        return ans;

    }

    private static int maximumOnes(int[] nums){
        int n = nums.length;
        int left=0,zeros=0,maxLen=0;
        for(int i=0;i<n;i++){
            if(nums[i] == 0) zeros++;
            while(zeros > 1){
                if(nums[left] == 0) zeros--;
                left++;
            }
            maxLen = Math.max(maxLen, i-left+1);
        }
        return maxLen;
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

        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }
        //81.pair with given sum in sorted array
        /*boolean res1  = TwoSum(nums);
        System.out.println(res1); */

        //82. Triplet with given sum
        /* List<List<Integer>> res2 = TripletWithGivenSum(nums);
        System.out.println(res2); */
        //83. move all zeros to end
        /* moveAllZerosToEnd(nums);
        printArray(nums); */
        //84. Remove duplicates from an sorted array
        /*  int res4 = removeDuplicates(nums);
        printArray(nums,res4);
         */
        //85. Trapping rain water
        /* int res5 = rainWater(nums);
        System.out.println(res5); */


        //86. container with most water
        /* int res6 = containerWithMostWater(nums);
        System.out.println(res6); */

        //87.minimum swaps to bring elements <=k together
        /* int res7 = minimumSwaps(nums);
        System.out.println(res7); */

        //88. maximum consecutive ones with one zero flip
        int res8 = maximumOnes(nums);
        System.out.println(res8);
    }
}
