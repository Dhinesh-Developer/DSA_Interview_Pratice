package LEETCODE_QUEST.Day42;

import java.util.Arrays;
/*
Q2. Interleaving String

Given strings s1, s2, and s3, find whether s3 is formed by an interleaving of s1 and s2.

An interleaving of two strings s and t is a configuration where s and t are divided into n and m substrings respectively,
 such that:

s = s1 + s2 + ... + sn
t = t1 + t2 + ... + tm
|n - m| <= 1
The interleaving is s1 + t1 + s2 + t2 + s3 + t3 + ... or t1 + s1 + t2 + s2 + t3 + s3 + ...
Note: a + b is the concatenation of strings a and b.



Example 1:


Input: s1 = "aabcc", s2 = "dbbca", s3 = "aadbbcbcac"
Output: true
Explanation: One way to obtain s3 is:
Split s1 into s1 = "aa" + "bc" + "c", and s2 into s2 = "dbbc" + "a".
Interleaving the two splits, we get "aa" + "dbbc" + "bc" + "a" + "c" = "aadbbcbcac".
Since s3 can be obtained by interleaving s1 and s2, we return true.
Example 2:

Input: s1 = "aabcc", s2 = "dbbca", s3 = "aadbbbaccc"
Output: false
Explanation: Notice how it is impossible to interleave s2 with any other string to obtain s3.
Example 3:

Input: s1 = "", s2 = "", s3 = ""
Output: true


Constraints:

0 <= s1.length, s2.length <= 100
0 <= s3.length <= 200
s1, s2, and s3 consist of lowercase English letters.


Follow up: Could you solve it using only O(s2.length) additional memory space?
* */
public class program2 {
    class Solution {
        int[][] dp;
        public boolean isInterleave(String s1, String s2, String s3) {
            if (s1.length() + s2.length() < s3.length() ||
                    s1.length() + s2.length() > s3.length()) return false;

            dp = new int[s1.length()+1][s2.length()+1];
            boolean op1 = helper(s1, s2, s3, 0, 0, true);
            for (int[] row : dp) Arrays.fill(row, 0);
            boolean op2 = helper(s1, s2, s3, 0, 0, false);

            return op1 || op2;
        }

        private boolean helper(String s1, String s2, String s3, int i, int j, boolean isFirst) {
            if (i == s1.length() && j == s2.length()) {
                return true;
            }

            if (dp[i][j] != 0) {
                return dp[i][j] == 1 ? false : true;
            }

            int k = isFirst ? i : j;
            int z = isFirst ? j : i;
            int n = isFirst ? s1.length() : s2.length();
            String s = isFirst ? s1 : s2;

            for (int x = k; x < n; x++) {
                String subS = s.substring(k, x+1);
                if (!s3.substring(k+z, z+x+1).equals(subS)) break;

                if (helper(s1, s2, s3, isFirst ? (x+1) : i, isFirst ? j : (x+1), !isFirst)) {
                    dp[i][j] = 2;
                    return true;
                } dp[i][j] = 1;
            }

            return false;
        }
    }
}
