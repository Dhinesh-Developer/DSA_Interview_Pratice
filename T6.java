package com.dk.Top100;

import java.util.Arrays;

// valid anagram.   
//Given two strings s and t, return true if t is an anagram of s, and false otherwise.
public class T6 {

    private static boolean isAnagram(String s,String t){
        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(s2);

        return Arrays.equals(s1,s2);
    }

    public static void main(String[] args) {
       String s = "anagram";
       String t = "nagaram";
       boolean res = isAnagram(s,t);
       System.out.println(res); // true

    }
}
