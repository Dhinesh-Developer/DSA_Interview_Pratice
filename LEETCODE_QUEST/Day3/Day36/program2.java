package LEETCODE_QUEST.Day36;

public class program2 {
    class Solution {
        public String longestCommonPrefix(String[] strs) {
            if(strs == null || strs.length == 0) return "";
            String lcp = strs[0];
            for(int i=0;i<strs.length;i++){
                String word = strs[i];
                int j = 0;
                while(j<word.length() && j<lcp.length() && word.charAt(j) == lcp.charAt(j)){
                    j++;
                }
                if(j == 0) return "";
                lcp = word.substring(0,j);
            }
            return lcp;
        }
    }
}
