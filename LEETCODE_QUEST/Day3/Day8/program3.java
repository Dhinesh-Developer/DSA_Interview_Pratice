package LEETCODE_QUEST.Day8;
/*
Q3. Repeated String Match
Given two strings a and b, return the minimum number of times you should repeat string a so that string b is a substring of it. If it is impossible for b​​​​​​ to be a substring of a after repeating it, return -1.

Notice: string "abc" repeated 0 times is "", repeated 1 time is "abc" and repeated 2 times is "abcabc".



Example 1:

Input: a = "abcd", b = "cdabcdab"
Output: 3
Explanation: We return 3 because by repeating a three times "abcdabcdabcd", b is a substring of it.
Example 2:

Input: a = "a", b = "aa"
Output: 2


Constraints:

1 <= a.length, b.length <= 104
a and b consist of lowercase English letters.
* */
public class program3 {
    class Solution {
        public int repeatedStringMatch(String a, String b) {
            StringBuilder sb = new StringBuilder();
            int cnt= 0;
            while(sb.length() < b.length()){
                sb.append(a);
                cnt++;
            }
            if(sb.indexOf(b) != -1){
                return cnt;
            }
            //one more repetation needed
            sb.append(a);
            if(sb.indexOf(b) != -1){
                return cnt+1;
            }
            return -1;
        }
    }
}
