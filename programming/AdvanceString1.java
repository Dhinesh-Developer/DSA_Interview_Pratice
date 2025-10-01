import java.util.*;
public class AdvanceString1 {
    private static void countOccurences(String s){
        int n = s.length();
        Map<Character,Integer> map =  new HashMap<>();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        System.out.println(map);
    }

    private static void countWordsInTheString(String s){
        System.out.println(s.split("\\s+").length);
    }

    private static void findDuplicatesCharacter(String s){
        Set<Character> set = new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(set.contains(s.charAt(i))){
                System.out.print(s.charAt(i)+" ");
            }else{
                set.add(s.charAt(i));
            }
        }
        System.out.println();
    }

    private static void reverseEachWordsInAString(String s){
        String[] words = s.split("\\s+");
        String revString = "";
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String rev = "";
            for(int j=word.length()-1;j>=0;j--){
                rev = rev+word.charAt(j);
            }
            revString = revString+" ";
        }
        System.out.print(revString);
    }

    private static void findFirstNonRepeatingCharacterInAString(String s){
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }

        for(Map.Entry<Character,Integer> x : map.entrySet()){
            if(x.getValue() ==1){
                System.out.print(x.getKey());
                break;
            }
        }
    }

    private static void findLongestCommonPrefix(){
        String[] s = {"cat","cable","camera"};
        String lcp = s[0];
        for(int i=1;i<s.length;i++){
            String curWord = s[i];
            int j=0;
            while(j<curWord.length() && j<lcp.length() && curWord.charAt(j) == lcp.charAt(j)){
                j++;
            }
            lcp = curWord.substring(0,j);
        }
        System.out.println(lcp);
    }

    private static void removeAdajcent(){
        String s = "abbaca";
        Stack<Character> st = new Stack<>();
        StringBuilder res = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(!st.isEmpty() && st.peek() == s.charAt(i)){
                st.pop();
            }else{
                st.add(s.charAt(i));
            }
        }
        for(Character x : st){
            res.append(x);
        }
        System.out.println(res.toString());
    }


    private static void checkSubsequence(){
        String s = "ade";
        String t = "abcdefgh";
        if(s.length()==0) System.out.println(true);
        int i=0,j=0;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i) == t.charAt(j)){
                i++;
            }
            if(s.length()==i) System.out.println(true);
            j++;
        }
        //System.out.println(false);
    }

    private static void isPalindrome(String s){
        String dup = s;
        String rev = "";
        for(int i=s.length()-1;i>=0;i--){
            rev = rev+s.charAt(i);
        }
        System.out.println(dup.equals(rev));
    }

    private static void reverse(String s){
        String rev = "";
        for(int i=s.length()-1;i>=0;i--){
            rev = rev+s.charAt(i);
        }
        System.out.println(rev);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        //131. count occurences of each character in the String
      /*   countOccurences(s);

        //132.count the no.of words in the String.
        countWordsInTheString(s);

        // 133. find duplicate character in the String
        findDuplicatesCharacter(s);

        //134. java program to reverse each words in the String
        /* reverseEachWordsInAString(s); 

        //135. find first non repeating character in the String.
        findFirstNonRepeatingCharacterInAString(s);

        //136.find the longest common prefix 
        findLongestCommonPrefix();
 */
        //137.REmove ajacent duplicate from a String
        removeAdajcent();

        //138. check if the first string is an subsequence of second String
        checkSubsequence();

        //139.check if the String is palindrome
        isPalindrome("markram");

        //140. Reverse a String
        reverse("dhineshkumar");

    }
}
