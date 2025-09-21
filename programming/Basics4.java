import java.util.*;

public class Basics4 {

    private static int findMaximum(int[] nums){
        int flag = -1;
        for(int i=0;i<nums.length;i++){
            if(nums[i] > flag){
                flag = nums[i];
            }
        }
        return flag;
    }

    private static int findMinimum(int[] nums){
        int flag = -1;
        for(int i=0;i<nums.length;i++){
            if(nums[i] < flag){
                flag = nums[i];
            }
        }
        return flag;
    }

    private static int findSum(int[] nums){
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
        }
        return sum;
    }

    private static int findAverage(int[] nums){
        int avg = -1;
        int sum = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            sum += nums[i];
        }
        return sum/n;
    }


    private static void reverse(int[] nums){
        System.out.print("Reverse an array: ");
        for(int i=nums.length-1;i>=0;i--){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }

    private static boolean isSorted(int[] nums){
        boolean flag = true;
        for(int i=1;i<nums.length;i++){
            if(nums[i] > nums[i-1]){

            }else{
                flag = false;
            }
        }
        return flag;
    }

    private static int secondLargest(int[] nums){
        int largest = nums[0],sLargest = -1;
        for(int i=0;i<nums.length;i++){
            if(nums[i] > largest){
                sLargest = largest;
                largest = nums[i];
            }else if(nums[i] > sLargest && nums[i]!=largest){
                sLargest = nums[i];
            }
        }
        return sLargest;
    }

    private static int[] count(int[] nums){
        System.out.print("odd and Even count: ");
        int oddCnt = 0, evenCnt = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] %2==0){
                evenCnt++;
            }else if(nums[i]%2==1){
                oddCnt++;
            }
        }
        return new int[]{oddCnt,evenCnt};
    }

    private static void findDuplicates(int[] nums){
        Set<Integer> set = new HashSet<>();
        System.out.print("Duplicate in the array: ");
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                System.out.print(nums[i]+" ");
            }else{
                set.add(nums[i]);
            }
        }
        System.out.println();
    }

    private static void rotateArrayBy1(int[] nums){
        int temp = nums[0];
        for(int i=1;i<nums.length;i++){
            nums[i-1] = nums[i];
        }
        nums[nums.length-1] = temp;

        System.out.print("left rotate array by 1: ");
        for(int x : nums){
            System.out.print(x+" ");
        }
        System.out.println();

        int temp1 = nums[nums.length-1];
        for(int i=nums.length-1;i>0;i--){
            nums[i] = nums[i-1];
        }
        nums[0] = temp1;
        System.out.print("Right rotate an array by 1: ");
        for(int x : nums){
            System.out.print(x+" ");
        }
    }

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = in.nextInt();
        }

        //31. Find maximum in the array
        int res1 =findMaximum(nums);
        System.out.println("Maximum: "+res1);

        //32. Find minimum in the array
        int res2 = findMinimum(nums);
        System.out.println("Minimum: "+res2);

        //33. Find the sum of all array element;
        int res3 = findSum(nums);
        System.out.println("Sum: "+res3);

        //34. Find average of array element
        int res4 = findAverage(nums);
        System.out.println("Average: "+res4);

        //35. reverse an array
        reverse(nums);

        //36. check if the array is sorted;
        boolean res6 = isSorted(nums);
        System.out.println("isSorted: "+res6);

        //37. Find second largest element in the array
        int res7 = secondLargest(nums);
        System.out.println("Second largest: "+res7);

        //38. count even and odd numbers in the array
        int[] res8 = count(nums);
        for(int x : res8){
            System.out.print(x+" ");
        }
        System.out.println();

        //39. Find duplicates in the array
        findDuplicates(nums);

        //40. rotate array by 1 (right or left);
        rotateArrayBy1(nums);

    }
}
