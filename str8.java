package com.dk.strings;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

//longest common prefix among all the String
public class str8 {

    private static void commonPrefix(String[] s){
        String lcp = s[0];
        for(int i=0;i<s.length;i++){
            String word = s[i];
            int j = 0;
            while(j < word.length() && j< lcp.length() && word.charAt(j) == lcp.charAt(j)){
                j++;
            }
            lcp = word.substring(0,j);
        }
        System.out.println(lcp);
    }

    public static void main(String[] args) {

        String[] s = {"cat","cable","camera"};
        commonPrefix(s); // ca

    }
}
