package GFG.Day11;
/*
Sieve of Eratosthenes
Difficulty: MediumAccuracy: 47.43%Submissions: 72K+Points: 4
Given a positive integer n, calculate and return all prime numbers less than or equal to n using the Sieve of Eratosthenes algorithm.
A prime number is a natural number greater than 1 that has no positive divisors other than 1 and itself.

Examples:

Input: n = 10
Output: [2, 3, 5, 7]
Explanation: Prime numbers less than equal to 10 are 2, 3, 5 and 7.
Input: n = 35
Output: [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31]
Explanation: Prime numbers less than equal to 35 are 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 and 31.
Constraints:
1 ≤ n ≤ 104
* */
public class program2 {
    class Solution {

        private boolean isPrime(int n){
            int cnt = 0;
            for(int i=1;i<=n;i++){
                if(n%i == 0){
                    cnt++;
                }
            }
            if(cnt == 2){
                return true;
            }else{
                return false;
            }
        }
        public int[] sieve(int n) {

            // Approach 1 : Brute force -> Time limit exceed.
            // ArrayList<Integer> li = new ArrayList<>();
            // for(int i=1;i<=n;i++){
            //     if(isPrime(i)){
            //         li.add(i);
            //     }
            // }

            // int[] res = new int[li.size()];
            // int ind = 0;
            // for(int x : li){
            //     res[ind++] = x;
            // }
            // return res;

            // Approach 2 : Sieve of Eratosthenes
            int[] prime = new int[n+1];
            for(int i=2;i<=n;i++){
                prime[i] = 1;
            }
            for(int i=2;i*i<=n;i++){
                if(prime[i] == 1){
                    for(int j=i*i;j<=n;j+=i){
                        prime[j] = 0;
                    }
                }
            }
            int cnt = 0;
            for(int i=2;i<=n;i++){
                if(prime[i] == 1){
                    cnt++;
                }
            }
            int[] res = new int[cnt];
            int ind =0;
            for(int i=2;i<=n;i++){
                if(prime[i] == 1){
                    res[ind++] = i;
                }
            }
            return res;



        }
    }
}
