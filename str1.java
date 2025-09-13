package com.dk.strings;
import java.util.*;
import java.util.LinkedHashMap;

// java program to count all occurences of characters in a String
public class str1 {

    private static void countOccurences(String s){
        Map<Character,Integer> map = new LinkedHashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }

        System.out.println(map);
    }


    public static void main(String[] args) {

        String s = "programming";
        countOccurences(s); // {p=1, r=2, o=1, g=2, a=1, m=2, i=1, n=1}
    }
}
