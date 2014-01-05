package com.study.algorithms.parens;

import java.util.ArrayList;
import java.util.Collections;

public class ParensRecursive {
	//use logic and recursion (not a counter) to implement the pareneses matching problem
int currIndex= 0;
int oldIndex= 0;

public boolean testParens (String s){
	return testParens(false,0, s);
}
	
	public boolean testParens (boolean firstParenFlag, int currIndex, String s){
		char[] anArray = s.toCharArray();
		for (int i = currIndex; i < anArray.length;++i){

			if ((')' == anArray[i]) && !firstParenFlag)
				return false;
			if ("(".equals(String.valueOf(anArray[i])) && !firstParenFlag){
				firstParenFlag = true;
				continue;
			}
			if ("(".equals(String.valueOf(anArray[i])) && firstParenFlag){
				 this.testParens(firstParenFlag, i, s.substring(i));
					if (this.currIndex != this.oldIndex){
						this.oldIndex = this.currIndex;
						i = this.currIndex;
						
					}
					continue;
			}
			if (")".equals(String.valueOf(anArray[i])) && firstParenFlag){
				firstParenFlag=false;
				this.currIndex = i+currIndex;
				return true;
			}

		}
		//all recursive calls have been returned and the string has been processed.
		if (firstParenFlag)
			return false;
		return true;
	}


	public static void main (String[] args){


		System.out.println(")(");
		System.out.println(new ParensRecursive().testParens(")("));
		
		System.out.println("()");
		System.out.println(new ParensRecursive().testParens("()"));
		
		System.out.println("(())");
		System.out.println(new ParensRecursive().testParens("(())"));
		
		System.out.println("((()))");
		System.out.println(new ParensRecursive().testParens("((()))"));
		
		System.out.println("(()())");
		System.out.println(new ParensRecursive().testParens("(()())"));
		
		
		System.out.println("(()");
		System.out.println(new ParensRecursive().testParens("(()"));
		
		System.out.println("(");
		System.out.println(new ParensRecursive().testParens("("));
		
		System.out.println(")");
		System.out.println(new ParensRecursive().testParens(")"));
		
		System.out.println("((())())");
		System.out.println(new ParensRecursive().testParens("((())())"));

		
	}

}
