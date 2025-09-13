package com.dk.strings;
 // count the number of words in a String.
public class str4 {

    private static int countWords(String s){

        return s.split(" ").length;
    }

    public static void main(String[] args) {

        String s = "java program in a String";
        int cnt = countWords(s);
        System.out.println(cnt); // 5
    }
}
