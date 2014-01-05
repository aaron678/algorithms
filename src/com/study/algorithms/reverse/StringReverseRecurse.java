package com.study.algorithms.reverse;

public class StringReverseRecurse {
	
	String reverse(String s){
		if (s.length() == 1)
			return s;
	
		return reverse(s.substring(1))+ s.charAt(0);
	}
	 public  static void main (String args[]){
		 System.out.println("abcd "+ new StringReverseRecurse().reverse("abcd"));
		 System.out.println("abcde "+ new StringReverseRecurse().reverse("abcde"));
	
}
}
