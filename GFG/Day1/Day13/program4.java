package GFG.Day13;
/*
Print 1 To N Without Loop

You are given an integer n. You have  to print all numbers from 1 to n.
Note: You must use recursion only, and print all numbers from 1 to n in a single line, separated by spaces.

Examples:

Input: n = 10
Output: 1 2 3 4 5 6 7 8 9 10
Input: n = 5
Output: 1 2 3 4 5
Input: n = 1
Output: 1
Constraints:
1 ≤ n ≤ 103
* */
public class program4 {
    class Solution {
        public void printNos(int n) {
            f(1,n);

        }

        public void f(int val,int ind){
            if(val == ind){
                System.out.print(val);
                return;
            }

            System.out.print(val+" ");
            f(val+1,ind);
        }
    }

}
