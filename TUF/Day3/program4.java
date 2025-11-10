package TUF.Day3;
/*
Find square root of a number
Given a positive integer n.
 Find and return its square root. If n is not a perfect square
  then return the floor value of sqrt(n).


Examples:
Input: n = 36

Output: 6

Explanation: 6 is the square root of 36.

Input: n = 28

Output: 5

Explanation: The square root of 28 is approximately 5.292. So, the floor value will be 5.

Input: n=50

Output:
7
Constraints:
 0 <= n <= 231 - 1
* */
public class program4 {
    class Solution {
        public int floorSqrt(int n) {
            int low = 0;
            int high = n;
            int ans = 1;
            while( low<=high){
                int mid = low + (high - low) /2;
                long val = (long)mid * (long)mid;
                if( val <= n){
                    ans = mid;
                    low = mid+1;
                }else{
                    high = mid-1;
                }
            }

            return ans;
        }
    }
}
