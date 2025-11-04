package GFG.Day14;
/*
Print Pattern
Difficulty: EasyAccuracy: 56.39%Submissions: 103K+Points: 2Average Time: 15m
Given a number n, print a sequence of numbers starting from n. Each next number in the sequence is n - 5, and this continues recursively until the number becomes less than or equal to 0. After that, print the sequence in reverse order, adding 5 each time, until it reaches back to the original number n.
Note: You must not use loops.

Examples:

Input: n = -16
Output: [-16]
Explanation: Since -16 is less than zero so it will remain same.
Input: n = 10
Output: [10, 5, 0, 5, 10]
Explanation: The value decreases until it is greater or equal to 0. After that it increases and stops when it becomes 10 again.
Constraints:
-105 ≤ n ≤ 105
* */
import java.util.ArrayList;

public class program4 {
    class Solution {
        public ArrayList<Integer> pattern(int n) {
            // code here
            ArrayList<Integer> res = new ArrayList<>();
            solve(n,res,n);
            return res;
        }

        public void solve(int cur,ArrayList<Integer> res,int org){
            res.add(cur);
            if(cur <= 0) return;
            solve(cur-5,res,org);
            res.add(cur);
        }
    }
}
