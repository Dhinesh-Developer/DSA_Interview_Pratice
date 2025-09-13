package com.dk.strings;

// java program to reverse each word in a String
public class str6 {

    private static void reverseEachWord(String s){
        String[] words = s.split(" ");
        String revString = "";
        for(int i=0;i<words.length;i++){
            String word = words[i];
            String j = "";
            for(int k=word.length()-1;k>=0;k--){
                j = j+word.charAt(k);
            }
            revString = revString+j+" ";
        }
        System.out.println(revString);
    }

    public static void main(String[] args) {

        String s = "welcome to java programming dsa problem";
        reverseEachWord(s); // emoclew ot avaj gnimmargorp asd melborp

    }
}
