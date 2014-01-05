/* 
   I actually got this question in a programming interview.
   
   Converts the individual chars of a string to their numerical representation so that
a => 1; b => 2 etc... The algorithm is trivial but the real point of this task is
to select the correct data structure. The heart of the method is a function which
converts from a char to an int. You could use an array containing the alphabet to do that 
conversion, but you would have to iterate through the array. You could use a hashmap, 
so that you don't have to iterate. In either case you need an initialization method 
which hardcodes the alphabet and associated numerical values and loads them into the 
data structure.
 
   The best solution is a string which represents the alphabet and use indexOf() to get the 
associated numerical encoding. There is no heavy initialization method and you don't
need to iterate through the data structure. I also used a stringbuffer instead of a string
because the result gets modified over successive iterations inside the for loop.
*/

package com.study.algorithms.encode;

public class CharEncode {
	String alpha = "abcdefghijklmnopqrstuvwxyz";
	
	int  convertToInt(char c){
		return alpha.indexOf(c);
	}
	
	String encode(String s){
		int sLength = s.length();
		StringBuffer result = new StringBuffer((sLength*2)-1);
		
		for (int i = 0; i < sLength; ++i) {
			int encodedChar = convertToInt(s.charAt(i));
			if (i == (s.length() - 1))
				result.append(encodedChar);
			else
				result.append(encodedChar).append(" ");
		}
		return result.toString();
	}

	public static void main (String args[]){
		System.out.println("encode xyz: " + new CharEncode().encode("xyz"));
	}
}
