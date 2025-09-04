package com.Interview;

// Check palindrome
public class Interview19 {
	
	private static boolean isPalindrome(int n) {
		
		int dup = n;
		int rev = 0;
		while(n > 0) {
			int last = n%10;
			rev = rev*10+last;
			n = n/10;
		}
		
		return dup==rev;
	}
	
	public static void main(String[] args) {
		
		int n1 = 555; // true test case 1
		int n2 = 123; // false test case 2
		boolean res = isPalindrome(n1);
		System.out.println(res); 

	}
}
