import java.util.*;

public class String3 {

    private static String longestPalindromicSubstring(String s){
        if(s.length()<1 || s==null) return "";
        int start=0,end=0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s,i,1);
            int len2 = expandAroundCenter(s,i,i+1);
            int len = Math.max(len1,len2);

            if(len> end-start){
                start = i-(len-1)/2;
                end = i+len/2;
            }
        }
        return s.substring(start,end+1);
    }

    private static int expandAroundCenter(String s,int left,int right){
        while(left>=0 && right<s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return right-left+1;
    }

    private static int longestPalindromicSubsequence(String s){
        return helper(s,0,s.length()-1);
    }
    private static int helper(String s,int i,int j){
        if(i>j) return 0;
        if(i==j) return 1;
        if(s.charAt(i) == s.charAt(j)){
            return 2+helper(s, i+1, j-1);
        }else{
            return Math.max(helper(s,i+1,j),helper(s,i,j-1));
        }
    }

    private static int countPlaindromicSubstring(String s){
        int n = s.length();
        int cnt = 0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(isPalindrome(s,i,j)){
                    cnt++;
                }
            }
        }
        return cnt;
    }

    private static boolean isPalindrome(String s,int start,int end){
        while(start < end){
            if(s.charAt(start) == s.charAt(end)){
                start++;
                end--;
            }else{
                return false;
            }
        }
        return true;
    }

    private static int minInsertion(String s){
        return func(s,0,s.length()-1);
    }
    private static int func(String s,int i,int j){
        if(i>=j) return 0;
        if(s.charAt(i) == s.charAt(j)){
            return func(s,i+1,j-1);
        }else{
            return 1+Math.min(func(s, i+1, j),func(s, i, j-1));
        }
    }

    private static int longestCommonSubsequnce(String x,String y,int m,int n){
        if(m==0 || n==0) return 0;
        
        if(x.charAt(m-1) == y.charAt(n-1)){
            return 1+longestCommonSubsequnce(x, y, m-1, n-1);
        }else{
            return Math.max(longestCommonSubsequnce(x, y, m-1, n), longestCommonSubsequnce(x, y, m, n-1));
        }
    }

    private static int shortestCommonSupersqence(String x,String y,int m,int n){
       
        if(m==0) return n;
        if(n==0) return m;
        if(x.charAt(m-1) == y.charAt(n-1)){
            return 1+longestCommonSubsequnce(x, y, m-1, n-1);
        }else{
            return 1+Math.min(shortestCommonSupersqence(x, y, m-1, n), shortestCommonSupersqence(x, y, m, n-1));
        }
    }

    private static String longestRepeatedSubstring(String s){
        int n = s.length();
        String longest = "";
        for (int i = 0; i < n; i++) {
            for (int j = i+1; i <=n ; j++) {
                String sub = s.substring(i,j);
                if(s.indexOf(sub,i+1) != -1 && sub.length()>longest.length()){
                    longest = sub;
                }
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        //141. longest palindromic substring
       /*  String res1 = longestPalindromicSubstring(s);
        System.out.println(res1); */

        //142. longest palindromic subsequence  bbbab  4
        int res2 = longestPalindromicSubsequence(s);
        System.out.println(res2);


        //143. count palindromic substring
        int res3 = countPlaindromicSubstring("aaa");
        System.out.println(res3);

        //144.minimum insertion to make palindrome
        int res4 = minInsertion("mbadm");
        System.out.println(res4);

        //145.minimum deletion to make string plaindrome -or- same logic like above 144 problem
        int res5 = minInsertion("mbadm");
        System.out.println(res5);

        //146. longest common subsequence
        String s1 = "abcde";
        String s2 = "abc";
        int res6 = longestCommonSubsequnce(s1,s2,s1.length(),s2.length());
        System.out.println(res6);

        //147. shortest common supersequence // same as above logic
        String X = "abac";
        String  Y = "cab";
        
        /* int res7 = shortestCommonSupersqence(X, Y,X.length(), Y.length());
        System.out.println(res7); */

        //148. longest repeated substring
        System.out.println(longestRepeatedSubstring("banana")); 

        
    }
}
