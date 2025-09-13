package com.dk.strings;

// check whether the given string is palindrome or not

public class str2 {

    private static boolean checkPalindrome(String s){
       int left = 0;
       int right = s.length()-1;
       while(left < right){
           if(s.charAt(left) == s.charAt(right)){
               left++;
               right--;
           }else{
               return false;
           }
       }
       return true;
    }

    public static void main(String[] args) {

        String s = "markram";
        boolean res = checkPalindrome(s);
        System.out.println(res); // true
    }
}
