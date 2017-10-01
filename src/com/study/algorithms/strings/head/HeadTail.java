package com.study.algorithms.strings.head;

import java.lang.reflect.Array;
import java.util.Arrays;

public class HeadTail {
	
	char head(String s){
		return (char)s.substring(0,1).toCharArray()[0];
	}
	
	int head2(int[] i){
		return Arrays.copyOfRange(i, 0, 1)[0];
	}
	
	String tail(String s){
		return s.substring(1,s.length());
	}
	
	int[] tail2(int[] i){
		return Arrays.copyOfRange(i, 1, i.length);
	}
	
	public static void main(String[] args) {
		String s = "hello";
		System.out.println(new HeadTail().head(s));
		System.out.println(new HeadTail().tail(s));

		int[] i = new int[]{1,2,3,4,5};
		System.out.println(i.toString());
		System.out.println(new HeadTail().head2(i));
		System.out.println(Arrays.toString(new HeadTail().tail2(i)));
		
		
	}

}
