package LEETCODE_QUEST.Day36;
import java.util.*;
import java.util.HashSet;

public class program1 {

    class Solution {
        public String longestWord(String[] words) {
            Arrays.sort(words);

            Set<String> built = new HashSet<>();
            built.add("");

            String ans = "";

            for (String word : words) {
                String prefix = word.substring(0, word.length() - 1);

                if (built.contains(prefix)) {
                    built.add(word);

                    if (word.length() > ans.length()) {
                        ans = word;
                    }
                }
            }
            return ans;
        }
    }

}
