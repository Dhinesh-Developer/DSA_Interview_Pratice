package com.dk.strings;

import java.util.Arrays;

// valid anagram
public class str10 {

    private static boolean isValidAnagram(String s,String t){
        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        return (Arrays.equals(s1,s2));
    }


    public static void main(String[] args) {

        String s = "car";
        String t = "rac";
        boolean res = isValidAnagram(s,t);
        System.out.println(res); // true
    }
}
