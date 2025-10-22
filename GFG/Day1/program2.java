package GFG.Day1;
/*
Perfect Numbers
Difficulty: EasyAccuracy: 17.21%Submissions: 226K+Points: 2
Given a number n, check if the number is perfect or not.
 A number is said to be perfect if sum of all its factors excluding the number itself is equal to the number.

Examples:
Input: n = 6
Output: true
Explanation: Factors of 6 are 1, 2, 3 and 6. Excluding 6 their sum is 6 which is equal to n itself. So, it's a Perfect Number.
Input: n = 10
Output: false
Explanation: Factors of 10 are 1, 2, 5 and 10. Excluding 10 their sum is 8 which is not equal to n itself. So, it's not a Perfect Number.
* */

public class program2 {
    class Solution {
        static boolean isPerfect(int n) {
            // code here
            int res = 0;
            int sum = 0;
            for(int i=1;i<n;i++){
                if(n%i==0){
                    sum += i;
                }
            }

            return sum == n;
        }
    };
}
