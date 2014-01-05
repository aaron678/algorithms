package com.study.algorithms.parens;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.List;

public class ParensIterativeStack {
	//use logic and recursion (not a counter) to implement the pareneses matching problem



	private boolean matchingParen(ArrayDeque ad) {
		if ("(".equals(ad.peekFirst()))
			return true;
		else
			return false;
	}
	
	public boolean testParens (String s){
		ArrayDeque<String> ad = new ArrayDeque<String>();
		char[] anArray = s.toCharArray();
		for (char c : anArray) {

			if ("(".equals(String.valueOf(c))) {
				ad.addFirst(String.valueOf(c));
				continue;
			}
			if (")".equals(String.valueOf(c))) {
				if (matchingParen(ad))
					ad.removeFirst();
				else
					return false;
				continue;
			}

		}
		
		//Checks if there is a remaining open paren.
		if (ad.size() == 0)
		return true;
		else return false;

	}


	public static void main (String[] args){


		System.out.println(")(");
		System.out.println(new ParensIterativeStack().testParens(")("));
		
		System.out.println("()");
		System.out.println(new ParensIterativeStack().testParens("()"));
		
		System.out.println("(())");
		System.out.println(new ParensIterativeStack().testParens("(())"));
		
		System.out.println("((()))");
		System.out.println(new ParensIterativeStack().testParens("((()))"));
		
		System.out.println("(()())");
		System.out.println(new ParensIterativeStack().testParens("(()())"));
		
		
		System.out.println("(()");
		System.out.println(new ParensIterativeStack().testParens("(()"));
		
		System.out.println("(");
		System.out.println(new ParensIterativeStack().testParens("("));
		
		System.out.println(")");
		System.out.println(new ParensIterativeStack().testParens(")"));
//		
//		System.out.println("((())())");
//		System.out.println(new ParensRecursiveStack().testParens("((())())"));

		
	}

}
