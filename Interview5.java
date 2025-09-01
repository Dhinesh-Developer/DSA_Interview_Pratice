package com.Interview;
//Program to Convert Hexadecimal Number to Binary
/*
Given a Hexadecimal number as an input, the task is to convert that number to a Binary number.
 * */
public class Interview5 {
	
	private static String convertor(String s) {
		
		int decimalValue = Integer.parseInt(s,16);
		String binaryValue = Integer.toBinaryString(decimalValue);
		return binaryValue;
	}
	public static void main(String[] args) {
		
		String s = "1AC5";
		String res = convertor(s);
		System.out.println(res); // 1101011000101
	}
}
