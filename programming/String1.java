
import java.util.*;

public class String1 {

    private static String reverse(String s) {
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }
        return rev;
    }

    private static String reverseWords(String s) {
        String[] st = s.split("\\s+");
        int len = st.length;
        String rev = "";
        for (int i = len - 1; i >= 0; i--) {
            rev += st[i] + " ";
        }
        return rev;
    }

    private static boolean isPalindrome(String s) {
        String dup = s;
        String t = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            t = t + s.charAt(i);
        }
        return dup.equals(t);

    }

    private static boolean isAnagram() {
        String s = "listen";
        String t = "silent";
        int[] cnt = new int[26];

        if (s.length() != t.length()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            cnt[s.charAt(i) - 'a']++;
            cnt[t.charAt(i) - 'a']--;
        }

        for (int x : cnt) {
            if (x != 0) {
                return false;
            }
        }
        return true;

    }

    private static char firstNonRepeatingCharacter(String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (Map.Entry<Character, Integer> x : map.entrySet()) {
            if (x.getValue() == 1) {
                return x.getKey();
            }
        }
        return ' ';
    }

    private static void count(String s) {
        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        int spaces = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 0 && ch <= 9) {
                digits++;
            } else if (ch == ' ') {
                spaces++;
            } else if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else {
                consonants++;
            }
        }

        System.out.println("vowels: "+vowels);
        System.out.println("consonants: "+consonants);
        System.out.println("digits: "+digits);
        System.out.println("spaces: "+spaces);
    }


    private static void maximumFrequency(){
        String str = "successes";
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++){
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i), 0)+1);
        }

        for(Map.Entry<Character,Integer> x : map.entrySet()){
            if(x.getValue() >= str.length()/2){
                System.out.println(x.getKey());
            }
        }
    }


    private static String removeDuplicates(String s){
        Set<Character> set = new HashSet<>();
        for(int i=0;i<s.length();i++){
            set.add(s.charAt(i));
        }

        String t = "";
        for(Character x : set){
            t = t+x;
        }

        return t;
    }


    private static boolean isRotated(){
        String s1 = "abcd";
        String s2 = "cdab";
        if(s1.length() != s2.length()) return false;
        
        String temp = s1+s1;
        return temp.contains(s2);

    }


    private static int longestSubString(String s){
        Set<Character> set = new HashSet<>();
        int left = 0,maxLen = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(set.contains(ch)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(ch);
            maxLen = Math.max(maxLen, i-left+1);
        }
        return maxLen;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        //111. Reverse a String
        String res1 = reverse(s);
        System.out.println(res1);

        ///112. Reverse words in a String.
        String res2 = reverseWords(s);
        System.out.println(res2);

        //113. check if the String is palindrome
        boolean res3 = isPalindrome(s);
        System.out.println(res3);

        //114.check if two Strings are anagram
        boolean res4 = isAnagram();
        System.out.println(res4);

        // 115. Find first non repeating character
        char res5 = firstNonRepeatingCharacter(s);
        System.out.println(res5);

        //116. count vowels,consonants,digits,spaces
        count(s);

        // 117. character with maximum frequency
        maximumFrequency();

        // 118. Remove duplicates from a String
        String res8 = removeDuplicates( s);
        System.out.println(res8);

        // 119.check if tow Strings are rotation of each other
        boolean res9 = isRotated();
        System.out.println(res9);

        // 120. longest substring without repeating character
        int res10 = longestSubString("abcabcbb");
        System.out.println(res10);
    }
}
