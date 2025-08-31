package com.dk;
// Best Time to buy and sell - I

/*
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.*/
public class program5 {
	
	private static int findMaxProfit(int[] prices) {
		int buy = prices[0];
		int maxi = 0;
		int n = prices.length;
		for(int i=1;i<n;i++) {
			if(prices[i] < buy) {
				buy = prices[i];
			}
			if(prices[i]-buy > maxi) {
				maxi = prices[i]-buy;
			}
		}
		return maxi;
	}
	public static void main(String[] args) {
			
		int[] prices = {7,1,5,3,6,4};
		int[] prices1 = {7,6,4,3,1}; // another test case
		int res = findMaxProfit(prices);
		System.out.println("Max Profit: "+res);
		
	}
}
