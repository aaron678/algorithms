/* Passing in a prime number, this method returns the next prime,
 * serving as an iterator over the collection of primes. 
 * Does not do a prime check on the input parameter.
 */

package com.study.algorithms.primeiterator;

public class PrimeGenerator{

	/* All primes above 3 have the form 6n+1 or 6n-1. You only need to check those and not every odd number.
	 * This is the same as incrementing by 2 and then by 4. I wanted to keep the relationship to math apparent
	 * in the code which is why I didn't do that.
	 */
	public int getNextPrime(int lastPrime){
		if (lastPrime == 0) // 0 and 1 are not a primes, but are used as the initial value for this method,
			// returning the first prime, 2.
			return 2;
		if (lastPrime == 2)
			return 3;
		if (lastPrime == 3)
			return 5;

		int seedNum = 0;
		if (((lastPrime-1) % 6) == 0){
			seedNum = ((lastPrime-1) / 6);
		}
		if (((lastPrime+1) % 6) == 0){
			seedNum = ((lastPrime+1) / 6);
		}

		for (int i=seedNum; i<Integer.MAX_VALUE; ++i){
			int numToTest = 6*i-1;
			if (((numToTest)>lastPrime) && primeCheck(numToTest) ){
				return (numToTest);
			}
			numToTest = 6*i+1;
			if (((numToTest)>lastPrime) && primeCheck(numToTest)){
				return (numToTest);
			}
		}
		return 0;  //should never reach this
	}

	//You only need to check for divisors until the square root of n.
	private	boolean primeCheck(int n){
		if (n == 0) return false;
		if (n == 1) return false;
		for (int i=2; i*i<=n; ++i){
			if (n%i == 0){
				return false;
			}
		}
		return true;
	}
}
