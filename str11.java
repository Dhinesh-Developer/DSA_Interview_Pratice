package com.dk.strings;

import java.util.Stack;

// remove all adajcent character in a String.
public class str11 {

    private static void removeAdajcent(String s){
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(!st.isEmpty() && st.peek() == s.charAt(i)){
                st.pop();
            }else{
                st.push(s.charAt(i));
            }
        }

        for(Character x : st){
            sb.append(x);
        }

        System.out.println(sb.toString());
    }

    public static void main(String[] args) {

        String s = "abbaca";
        removeAdajcent(s); // ca

    }
}
