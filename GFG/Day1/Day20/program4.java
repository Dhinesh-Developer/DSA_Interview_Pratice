package GFG.Day20;
/*
Longest Palindrome in a String
Difficulty: MediumAccuracy: 23.2%Submissions: 342K+Points: 4
Given a string s, your task is to find the longest palindromic substring within s.

A substring is a contiguous sequence of characters within a string, defined as s[i...j] where 0 ≤ i ≤ j < len(s).

A palindrome is a string that reads the same forward and backward. More formally, s is a palindrome if reverse(s) == s.

Note: If there are multiple palindromic substrings with the same length, return the first occurrence of the longest palindromic substring from left to right.

Examples :

Input: s = “forgeeksskeegfor”
Output: “geeksskeeg”
Explanation: There are several possible palindromic substrings like “kssk”, “ss”, “eeksskee” etc. But the substring “geeksskeeg” is the longest among all.
Input: s = “Geeks”
Output: “ee”
Explanation: "ee" is the longest palindromic substring of "Geeks".
Input: s = “abc”
Output: “a”
Explanation: "a", "b" and "c" are longest palindromic substrings of same length. So, the first occurrence is returned.
Constraints:
1 ≤ s.size() ≤ 103
s consist of only lowercase English letters.
* */
public class program4 {

    class Solution {
        static String longestPalindrome(String s) {
            // code here
            int n = s.length();
            int len,maxLen = 0;
            String ans = "";
            for(int i=0;i<n;i++){
                for(int j=i;j<n;j++){
                    if(isPalin(s,i,j)){
                        len = j-i+1;
                        maxLen = Math.max(maxLen,len);
                        if(maxLen == len && ans.length() != len){
                            ans = s.substring(i,j+1);
                        }
                    }
                }
            }
            return ans;
        }

        public static boolean isPalin(String s,int start,int end){
            while(start < end){
                if(s.charAt(start) != s.charAt(end)){
                    return false;
                }
                start++;
                end--;
            }
            return true;
        }
    }
}
