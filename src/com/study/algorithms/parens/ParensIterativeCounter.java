package com.study.algorithms.parens;

public class ParensIterativeCounter {
	// use logic and recursion (not a counter) to implement the pareneses
	// matching problem

	public boolean testParens(String s) {
		int counter = 0;
		char[] anArray = s.toCharArray();
		for (char c : anArray) {

			if ("(".equals(String.valueOf(c))) {
				++counter;
			} else if (')' == c) {
				--counter;

			}
			if (counter < 0)
				return false;

		}

			return (counter == 0);

	}

	public static void main(String[] args) {

		System.out.println(")(");
		System.out.println(new ParensIterativeCounter().testParens(")("));

		System.out.println("()");
		System.out.println(new ParensIterativeCounter().testParens("()"));

		System.out.println("(())");
		System.out.println(new ParensIterativeCounter().testParens("(())"));

		System.out.println("((()))");
		System.out.println(new ParensIterativeCounter().testParens("((()))"));

		System.out.println("(()())");
		System.out.println(new ParensIterativeCounter().testParens("(()())"));

		System.out.println("(()");
		System.out.println(new ParensIterativeCounter().testParens("(()"));

		System.out.println("(");
		System.out.println(new ParensIterativeCounter().testParens("("));

		System.out.println(")");
		System.out.println(new ParensIterativeCounter().testParens(")"));
		//
		// System.out.println("((())())");
		// System.out.println(new
		// ParensRecursiveStack().testParens("((())())"));

	}

}
