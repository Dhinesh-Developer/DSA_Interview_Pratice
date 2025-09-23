import java.util.*;

public class Medium1 {

    private static int[] findMinMax(int[] nums){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i] > max){
                max = nums[i];
            }
            if(nums[i] < min){
                min=  nums[i];
            }
        }
        return new int[]{min,max};
    }

    private static int[] findSecond(int[] nums){
        int largest = nums[0];
        int sLargest = -1;
        for(int i=0;i<nums.length;i++){
            if(nums[i] > largest){
                sLargest = largest;
                largest = nums[i];
            }else if(nums[i] > sLargest && nums[i]!=largest){
                sLargest = nums[i];
            }
        }
        
        int smallest = nums[0];
        int sSmallest = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i] < smallest){
                sSmallest = smallest;
                smallest=  nums[i];
            }else if(nums[i] < sSmallest && nums[i]!=smallest){
                sSmallest = nums[i];
            }
        }

        return new int[]{sSmallest,sLargest};
    }

    private static void reverseArray(int[] nums){
        int low =0,high = nums.length-1;
        while(low < high){
            int temp = nums[low];
            nums[low] = nums[high];
            nums[high] = temp;
            low++;
            high--;
        }
    }

    private static void findfrequecy(int[] nums){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i], 0)+1);
        }

        for(Map.Entry<Integer,Integer> x : map.entrySet()){
            System.out.print(x.getKey()+" freq: "+x.getValue()+" |");
        }
    }

    private static boolean check(int[] nums){
        for(int i=1;i<nums.length;i++){
            if(nums[i] > nums[i-1]){

            }else{
                return false;
            }
        }
        return true;
    }

    private static boolean linearSearch(int[] nums){
        int target = 3;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == target){
                return true;
            }
        }
        return false;
    }

    private static boolean binarySearch(int[] nums){
        int low = 0,high = nums.length-1;
        int target = 3;
        while(low <= high){
            int mid = (low+high)/2;
            if(nums[mid] == target){
                return true;
            }else if(nums[mid] > target){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return false;
    }

    private static int[] findOccurences(int[] nums){
        int target = 3;
        int first = -1,last = -1;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == target){
                if(first == -1)
                    first =i;
                 last = i;    
            }
           
            
        }

        return new int[]{first,last};
    } 

    private static int countOccurences(int[] nums){
        int target = 3;
        int cnt = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == target){
                cnt++;
            }
        }
        return cnt;
    }

    private static int findSquareRoot(int n){
        if(n<2) return n;
        int low=0,high=n,ans=0;
        while(low <= high){
            int mid = (low+high)/2;
            int square = mid * mid;
            if(square == n){
                return mid;
            }else if(square < n){
                ans = mid;
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return ans;
    }

    private static void printArray(int[] res){
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<n;i++){
            ar[i] = in.nextInt();
        }

        //51. find max and min in the array
        int[] res1 = findMinMax(ar);
        printArray(res1);

        //52. find the second largest and secont smallest
        int[] res2 = findSecond(ar);
        printArray(res2);

        //53. Reverse an array in place.
       /*  reverseArray(ar);
        printArray(ar); */

        //54. find the frequency of each element in the array
        findfrequecy(ar);

        //55.check if the array is sorted
        boolean res5 = check(ar);
        System.out.println("Is sorted: "+res5);

        //56. linear search in unsorted array
        boolean res6 = linearSearch(ar);
        System.out.println("linear search Is present: "+res6);

        //57.binary search in sorted array
        boolean res7 = binarySearch(ar);
        System.out.println("sorted array is present: "+res7);

        //58.find the first and last occurences of a element
        int[] res8 = findOccurences(ar);
        printArray(res8);

        //59. count occurences of a number
        int res9= countOccurences(ar);
        System.out.println("Occuerence: "+res9);

        //60. square root of a number using binary search
        int res10 = findSquareRoot(27);
        System.out.println("Square root of a number: "+res10);
    }
}
