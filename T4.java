package com.dk.Top100;

public class T4 {

    private static boolean isPalindrome(String s){
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]","");
        int n = s.length();
        int l=0,r=n-1;
        while(l < r){
            if(s.charAt(l) ==s.charAt(r)){
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
        boolean res = isPalindrome(s);
        System.out.println(res); // true
    }
}
