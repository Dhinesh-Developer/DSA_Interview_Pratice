package com.dk.strings;

import java.util.*;

// find the length of the longest substring without repeating characters.
public class str9 {

    private static int findLength(String s){
        int maxCnt = 0;
        int i=0,j=0;
        int n = s.length();
        Set<Character> set = new TreeSet<>();
        while(i < n && j<n){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                j++;
                maxCnt = Math.max(maxCnt,j-i);
            }else{
                set.remove(s.charAt(i));
                i++;
            }
        }
        return maxCnt;
    }

    public static void main(String[] args) {

        String s = "abcabcb";
        int res = findLength(s);
        System.out.println(res); // 3
    }
}
