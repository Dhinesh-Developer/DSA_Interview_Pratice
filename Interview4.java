package com.Interview;

/*Find minimum number of currency notes and values that sum to given amount.
 * 
 * Given an amount, find the minimum number of notes of
 *  different denominations that sum up to the given amount. 
 *  Starting from the highest denomination note, try to accommodate as many notes as possible for a given amount. We may assume that we have infinite
 *  supply of notes of values {2000, 500, 200, 100, 50, 20, 10, 5, 1} 
 * 
 * */

public class Interview4 {
	
	private static void currencyConvertor(int[] currencyNotes,int amount) {
		
		int[] notes = new int[9];
		
		for(int i=0;i<9;i++) {
			if(amount >= currencyNotes[i]) {
				notes[i] = amount / currencyNotes[i];
				amount = amount % currencyNotes[i];
			}
		}
		
		for(int i=0;i<9;i++) {
			if(notes[i] != 0) {
				System.out.println(currencyNotes[i]+" : "+notes[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		
		int[] currencyNotes = {2000, 500, 200, 100, 50, 20, 10, 5, 1};
		int amount = 800; // ---or -- 868
		
		currencyConvertor(currencyNotes,amount);
	}
}
