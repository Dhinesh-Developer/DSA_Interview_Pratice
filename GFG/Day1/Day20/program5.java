package GFG.Day20;

import java.util.HashMap;
import java.util.Map;
/*
Count the characters
Difficulty: BasicAccuracy: 27.88%Submissions: 42K+Points: 1
Given a string S. Count the characters that have ‘N’ number of occurrences. If a character appears consecutively it is counted as 1 occurrence.

Example 1:

Input:
S = "abc", N = 1
Output: 3
Explanation: 'a', 'b' and 'c' all have
1 occurrence.

â€‹Example 2:

Input:
S = "geeksforgeeks", N = 2
Output: 4
Explanation: 'g', 'e', 'k' and 's' have
2 occurrences.

Your Task:
You don't need to read input or print anything. Your task is to complete the function getCount() which takes the string S and an integer N as inputs and returns the count of the characters that have exactly N occurrences in the string. Note that the consecutive occurrences of a character have to be counted as 1.


Expected Time Complexity: O(|S|).
Expected Auxiliary Space: O(1).


Constraints:
1<=|S|<=105
1<=N<=103
* */
public class program5 {
    // User function Template for Java

    class Sol {
        int getCount(String s, int N) {
            // your code here
            Map<Character,Integer> map  =new HashMap<>();
            for(int i=0;i<s.length();i++){
                char ch = s.charAt(i);
                map.put(ch,map.getOrDefault(ch,0)+1);
            }

            int cnt =0;
            for(Map.Entry<Character,Integer> x : map.entrySet()){
                if(x.getValue() >= N){
                    cnt++;
                }
            }

            return cnt;
        }
    }
}
