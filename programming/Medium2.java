import java.util.*;
public class Medium2 {

    private static boolean searchIntRoatatedSortedArray(int[] nums){
        int target = 3;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == target){
                return true;
            }
        }
        return false;
    }

    private static int findPeakElement(int[] nums){
        for(int i=1;i<nums.length-1;i++){
            if(nums[i] > nums[i-1] && nums[i] > nums[i+1]){
                return nums[i];
            }       
        }
        return -1;
    }

    private static void bubbleSort(int[] nums){
        System.out.print("Bubble sort: ");
        int n = nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i] > nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }

    private static void printArray(int[] nums){
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }

    private static void insertionSort(int[] nums){
        int n = nums.length;
        for(int i=0;i<=n-1;i++){
            int j=i;
            while(j>0&& nums[j-1] >= nums[j]){
                int temp = nums[j-1];
                nums[j-1] = nums[j];
                nums[j] = temp;
                j--;
            }
        }
    }

    private static void sort012(int[] nums){
        int low =0 ,mid=0,high = nums.length-1;
        while(mid <= high){
            if(nums[mid] == 0){
               int temp = nums[low];
               nums[low++] =nums[mid];
               nums[mid++] = temp;
            }else if(nums[mid] == 1){
                mid++;
            }else{
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high--] = temp;
            }
        }
    }


    private static void selectionSort(int[] nums){
        int n = nums.length;
        for(int i=0;i<=n-2;i++){
            int mini = i;
            for(int j=0;j<=n-1;j++){
                if(nums[j] < nums[mini]){
                    mini = j;
                }
            }
            int temp = nums[mini];
            nums[mini] = nums[i];
            nums[i] = temp;
        }
    }


    private static void findKthLargest(int[] nums){
        int k = 3;
        Arrays.sort(nums);
        System.out.println(nums[nums.length-k]);
    }

    private static void findKthSmallest(int[] nums){
        int k = 3;
        Arrays.sort(nums);
        System.out.println(nums[k-1]);
    }

    private static void sortElementByFrequenct(int[] nums){
        int n = nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i], 0)+1);
        }

        List<Integer> li = new ArrayList<>();
        for(int x : nums){
            li.add(x);
        }

        Collections.sort(li,(a,b)->{
            int freq = map.get(b)-map.get(a);
            if(freq==0){
                return a-b;
            }
            return freq;
        });

        for(int x : li){
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

        //61. search in a rotated sorted array
        boolean res1 = searchIntRoatatedSortedArray(nums);
        System.out.println("Is Present: "+res1);

        //62. Find peak element
        int res2 = findPeakElement(nums);
        System.out.println("Peak Element: "+res2);

        //63. bubble sort
        //bubbleSort(nums);
        printArray(nums);

        //64. insertion sort
       // insertionSort(nums);
        printArray(nums);

        //65. selection sort
       // selectionSort(nums);
        printArray(nums);

        //66. sort 0's 1's 2's using dutch national flag algorithm
        sort012(nums);

        //67. find kth largest/ smallest element
        findKthLargest(nums);
        findKthSmallest(nums);

        // 68. sort Element by frequency
        sortElementByFrequenct(nums);
    }

}
