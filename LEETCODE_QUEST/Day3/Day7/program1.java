package LEETCODE_QUEST.Day7;
/*
Q1. Detect Capital
We define the usage of capitals in a word to be right when one of the following cases holds:

All letters in this word are capitals, like "USA".
All letters in this word are not capitals, like "leetcode".
Only the first letter in this word is capital, like "Google".
Given a string word, return true if the usage of capitals in it is right.

Example 1:

Input: word = "USA"
Output: true
Example 2:

Input: word = "FlaG"
Output: false
* */
public class program1 {
    class Solution {
        public boolean detectCapitalUse(String word) {
            if(word.equals(word.toUpperCase())) return true;
            if(word.equals(word.toLowerCase())) return true;

            String first = word.substring(0,1);
            String rest = word.substring(1);

            if(first.equals(first.toUpperCase()) && rest.equals(rest.toLowerCase())){
                return true;
            }

            return false;
        }
    }
}
