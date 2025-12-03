package LEETCODE_QUEST.Day18;
/*
Q1. Shortest Palindrome
You are given a string s. You can convert s to a palindrome by adding characters in front of it.
Return the shortest palindrome you can find by performing this transformation.

Example 1:

Input: s = "aacecaaa"
Output: "aaacecaaa"
Example 2:

Input: s = "abcd"
Output: "dcbabcd"

Constraints:
0 <= s.length <= 5 * 104
s consists of lowercase English letters only.
* */
public class program2 {
    class Solution {
        public String shortestPalindrome(String s) {
            int j =0;
            for(int i=s.length()-1;i>=0;i--){
                if(s.charAt(i) == s.charAt(j)){
                    j++;
                }
            }

            if(j == s.length()) return s;
            String suffix = s.substring(j);
            return new StringBuffer(suffix).reverse().toString() + shortestPalindrome(s.substring(0, j)) + suffix;
        }
    }
}
