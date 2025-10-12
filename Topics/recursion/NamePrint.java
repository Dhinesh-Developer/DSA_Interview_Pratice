package com.recursion;

public class NamePrint {
	public static void main(String[] args) {
		
		String name = "kumar";
		print(name,0);
	}
	static void print(String name,int cnt) {
		
		if(cnt == 5) {
			return;
		}
		System.out.println(name);
		print(name,cnt+1);
		
	}
}
