package com.dk.Top100;

import java.util.Stack;

// 2. Valid Parentheses
/*
* Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
An input string is valid if:
Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.

Example 1:
Input: s = "()"
Output: true
Example 2:
Input: s = "()[]{}"
Output: true
Example 3:
Input: s = "(]"
Output: false
Example 4:
Input: s = "([])"
Output: true
Example 5:
Input: s = "([)]"

Output: false*/
public class T2 {
    private static boolean isValidParanthesis(String s){
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch =='{' || ch=='(' || ch=='['){
                st.push(ch);
            }
            else if(st.isEmpty() || (ch=='}' && st.pop()!='{') || (ch==')' && st.pop()!='(') || (ch==']' && st.pop()!='[')){
                return false;
            }
        }
        return (st.isEmpty());
    }

     public static void main(String[] args) {

         String s = "([])";
         boolean res = isValidParanthesis(s);
         System.out.println(res); // true
     }
}
