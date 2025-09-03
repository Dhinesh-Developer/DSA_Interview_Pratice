package com.Interview;

// Program to find Prime Numbers Between given Interval
public class Interview9 {
	
	private static boolean isPrime(int n) {
		if(n==0 || n==1) return false;
		
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	
	private static int[] findPrime(int m,int n) {
		
		int[] temp = new int[n-m+1];
		int index = 0;
		
		for(int i=m;i<=n;i++) {
			if(isPrime(i)) {
				temp[index++] = i;
			}
		}
		
		int[] res = new int[index];
		int x = 0;
		for(int i=0;i<index;i++) {
			res[x++] = temp[i];
		}
		return res;
	}
	public static void main(String[] args) {
		
		int m=10,n=20;
		
		int[] res = findPrime(m,n);
		
		for(int x : res) {
			System.out.print(x+" "); // 11 13 17 19 
		}
	}
}
