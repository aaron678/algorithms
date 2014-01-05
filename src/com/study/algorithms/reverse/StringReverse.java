package com.study.algorithms.reverse;

public class StringReverse {
	
	String reverse(String s){
		//make the pointers go in closer each time until the separation is one or less
		StringBuffer sb= new StringBuffer(s);
		int i =0;
		while ((sb.length()-1-2*i)>= 1){
		char charL = sb.charAt(i);
		sb.setCharAt(0, sb.charAt(sb.length()-1-i));
		sb.setCharAt(sb.length()-1-i, charL);
		++i;
		}
		return sb.toString();
	}
	 public  static void main (String args[]){
		 System.out.println("abcd "+ new StringReverse().reverse("abcd"));
		 System.out.println("abcde "+ new StringReverse().reverse("abcde"));
	
}
}
