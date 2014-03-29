package com.study.algorithms.primes;

public class PrimeCheck {
	
	//You only need to check for divisors up until the square root of n.
	// time complexity O(log n)
	boolean primeCheck(int n){
		int lastIndex = 0;
		for (int i=2; i*i<=n; ++i){
			if (n%i == 0){
				System.out.println("square root of n: "+ Math.sqrt(n));
				System.out.println("Last int tested: "+ i);
				return false;
			}
			lastIndex = i;
		}
		
		System.out.println("square root of n: "+ Math.sqrt(n));
		System.out.println("Last int tested: "+ lastIndex);
		return true;
	}
	
	public static void main (String[] args){
		System.out.println(new PrimeCheck().primeCheck(6));
		System.out.println(new PrimeCheck().primeCheck(13));
		System.out.println(new PrimeCheck().primeCheck(373));
	}

}
