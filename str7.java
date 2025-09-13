package com.dk.strings;

import java.util.*;

// java program to find the first non repeating character in a String
public class str7 {

    private static void findFirst(String s){
        Map<Character,Integer> map = new LinkedHashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(Map.Entry<Character,Integer> x : map.entrySet()){
            if(x.getValue() == 1){
                System.out.println(x.getKey());
                break;
            }
        }
    }

    public static void main(String[] args) {

        String s = "java";
        findFirst(s); // j

    }
}
