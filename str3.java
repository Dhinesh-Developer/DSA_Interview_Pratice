package com.dk.strings;

// reverse an array.

public class str3 {

    private static String reverse(String s){
        String t = "";
        for(int i=s.length()-1;i>=0;i--){
            t = t+s.charAt(i);
        }
        return t;
    }

    public static void main(String[] args) {

        String s = "kumar";
        String res = reverse(s);
        System.out.println(res); // ramuk
    }
}
