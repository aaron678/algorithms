package com.study.algorithms.primeiterator;

import java.io.IOException;

public class PrimeGeneratorRunner {

	public static void main(String[] args) throws IOException {
		int[] primes = new int[]{2,3,5,7,11,13,17,19,23,29,31,37,3433,3559};
		PrimeGenerator generator = new PrimeGenerator();
		for (int prime: primes){
			System.out.println("The prime after " + prime + "is: " + generator.getNextPrime(prime));
		}
	}
}

