import java.util.*;
public class String2 {

    private static int lengthOfLongestSubstringKDistinct(String s){
        int k = 2;
        int n = s.length();
        Map<Character,Integer> map  =new HashMap<>();
        int left=0,maxLen=0;
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
            while(map.size() > k){
                char leftChar = s.charAt(i);
                map.put(leftChar, map.get(leftChar)-1);
                if(map.get(leftChar) == 0){
                    map.remove(leftChar);
                }
                left++;
            }
            maxLen = Math.max(maxLen, i-left+1);
        }
        return maxLen;
    }

    private static String minWindow(String s){
        String t = "ABC";
        if(s.length() != t.length()) return "";

        int[] need = new int[128];
        for(char c : s.toCharArray()){
            need[c]++;
        }

        int left=0,right=0;
        int required = t.length();
        int minLen = Integer.MAX_VALUE;
        int start = 0;

        while(right < s.length()){
            char ch = s.charAt(right);
            if(need[ch] > 0) required--;
            need[ch]--;
            right++;

            while(required == 0){
                if(right-left < minLen){
                    minLen = right-left;
                    start = left;
                }

                char leftChar = s.charAt(left);
                need[leftChar]++;
                if(need[leftChar] > 0) required++;
                left++;
            }

        }
        return minLen == Integer.MAX_VALUE?"":s.substring(start,start+minLen);

    }


    public static  List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            char[] arr = word.toCharArray();
            Arrays.sort(arr);  
            String key = new String(arr);

            map.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
        }

        return new ArrayList<>(map.values());
    }

    private static void naivePatternMatch(){
        String s = "AABAACAADAABAABA";
        String t = "AABA";

        int n = s.length();
        int m = t.length();

        for(int i=0;i<= n-m;i++){
            int j;
            for(j=0;j<m;j++){
                if(s.charAt(i+j) != t.charAt(j)){
                    break;
                }
            }
            if(j==m){
                System.out.println("Pattern found at the index: "+i);
            }
        }

    }

    private static int[] computeLps(String s){
        int m = s.length();
        int[] lps = new int[m];
        int len=0;
        int i=1;
        while(i<m){
            if(s.charAt(i) == s.charAt(len)){
                len++;
                lps[i] = len;
                i++;
            }else{
                if(len!=0){
                    len = lps[len-1];

                }else{
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }

    private static void kmpAlgorithm(){
        String s = "AABAACAADAABAABA";
        String t = "AABA";

        int n = s.length();
        int m = t.length();
        int[] lps = computeLps(s);
        int i=0,j=0;
        while(i<n){
            if(s.charAt(i) == t.charAt(j)){
                i++;
                j++;
            }
            if(j==m){
                System.out.println("pattern found at the index: "+i);
                j = lps[j-1];
            }else if(i<n && s.charAt(i)!= t.charAt(j)){
                if(j!=0){
                    j = lps[j-1];
                }else{
                    i++;
                }
            }
        }
    }

    private static void findOccurences(){
        String s = "cbaebabacd";
        String t = "abc";
        List<Integer> res = new ArrayList<>();
        int[] pcount = new int[26];
        int[] scount = new int[26];

        for(char x : t.toCharArray()){
            scount[x-'a']++;
        }

        int window = t.length();

        for(int i=0;i<s.length();i++){
            scount[s.charAt(i) -'a']++;
            if(i >= window){
                scount[s.charAt(i-window)-'a']--;
            }
            if(Arrays.equals(pcount,scount)){
                res.add(i-window+1);
            }
        }

        System.out.println(res);
    }


    private static boolean wildcartPatternMatching(){
        String s = "adceb";
        String t = "*a*b";

        int n = s.length();
        int m = t.length();
        boolean[][] dp = new boolean[n+1][m+1];
        dp[0][0] = true;

        for(int j=1;j<=m;j++){
            if(t.charAt(j-1) == '*'){
                dp[0][j] = dp[0][j-1];
            }
        }

        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                char sc = s.charAt(i-1),tc=t.charAt(j-1);

                if(tc=='?' || tc==sc){
                    dp[i][j] = dp[i-1][j-1];
                }else if(tc=='*'){
                    dp[i][j] = dp[i][j-1] || dp[i-1][j];
                }else{
                    dp[i][j] = false;
                }
            }
        }
        return dp[n][m];
    }

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        //121. longest substring with k distinct characters
       /*  int res1 = lengthOfLongestSubstringKDistinct(s);
        System.out.println(res1); */

        //122. smallest window substring containing all characters of another string
        /* String res2 = minWindow(s);
        System.out.println(res2); */

        //123. Group anagrams
        String[] words = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> res3 = groupAnagrams(words);
        System.out.println(res3);

        //124. Naive pattern search
        naivePatternMatch();

        // 125. KMP algorithm
        kmpAlgorithm();

        // 126.Find all anagram occureces in the String
        findOccurences();

        //127. wilcart pattern matching
        boolean res7 = wildcartPatternMatching();
        System.out.println(res7);
    }
}
