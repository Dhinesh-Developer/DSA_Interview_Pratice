package Day9;

public class program10 {
    public static void main(String[] args) {

        // square root of a number using binary search
        System.out.println(findSquareRoot(27));
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
}
