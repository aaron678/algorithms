package com.study.algorithms.fibonacci;

public class FibRunner {


	public static void main(String[] args) {
		Fibonacci f = new Fibonacci();
		
		System.out.println("Fibonacci using iteration");
		for (int i=0;i<5; i++)
			System.out.println( f.fib_iterative(i));

		System.out.println("Fibonacci using iteration and memoization (caching)");
		for (int i=0;i<5; i++)
			System.out.println( f.fib_iterative_with_memoization(i));

		System.out.println("Fibonacci using linear recursion");
		for (int i=0;i<5; i++)
			System.out.println( f.fib_linear_recursive(i));

		System.out.println("Fibonacci using tail recursion");
		for (int i=0;i<10; i++)
			System.out.println( f.fib_tail_recursive(i,0,1));


	}

}
