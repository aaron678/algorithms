package com.study.algorithms.fibonacci;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
	
	public int fib_iterative (int n){
		int a=0, b=1;
		for (int i=0; i<n; i++){
			int temp= a;
			a=b;
			b=temp+b;
		}
		return a;
	}
	
	public int fib_iterative_with_memoization (int n){
		int result  = 0;
		Map<Integer, Integer> storage = new HashMap<>();
		if (storage.containsKey(n)){
		result = storage.get(n);
		}
		else {
			result = fib_iterative(n);
			storage.put(n, result);
		}
		return result;
	}

public int fib_tail_recursive (int n, int a, int b){
	if (n==0) return a;
	return fib_tail_recursive (n-1,b,a+b);
}

public int fib_linear_recursive (int n){
	if (n<=1) return n;
	return fib_linear_recursive (n-1) + fib_linear_recursive (n-2);
}

}
