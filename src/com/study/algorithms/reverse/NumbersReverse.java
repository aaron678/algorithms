package com.study.algorithms.reverse;

//Reverse the order of digits in an integer without using a string or array.
public class NumbersReverse {
	
	public int reverseInt(int digits){
		int  reversedDigits = 0;
		while (digits != 0){
			//Modulo on integers extracts the last digit
			int lastDigit = digits % 10;

			//Move the reversed digits one space to the left.
			//Multiplication by 10 will append a zero to the original digits
			reversedDigits = reversedDigits * 10;

			//Take the last digit and put it at the end of the reversed number.
			reversedDigits += lastDigit;

			//Integer division removes the rightmost digit from the input
			digits = digits / 10;
		}
		return reversedDigits;
	}
		
	
	
	public static void main (String[] args){
		int result = new NumbersReverse().reverseInt(12345);
		System.out.println(result);
		
	}


}
