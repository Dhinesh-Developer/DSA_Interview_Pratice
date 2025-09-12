package com.dk;
/*
*  Valid palindrome
* A phrase is a palindrome if, after converting all uppercase letters into
*  lowercase letters and removing all non-alphanumeric characters,
* it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.
* Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
* */
public class program32 {

    private static boolean isValid(String s){
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]","");
        int n = s.length();
        int l=0,r=n-1;
        while (l < r){
            if(s.charAt(l) == s.charAt(r)){
                l++;
                r--;
            }else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";
        boolean res = isValid(s);
        System.out.println(res); // true
    }
}
