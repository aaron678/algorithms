package com.study.algorithms.sorting;

import static org.junit.Assert.*;

import org.junit.Test;

public class BubbleSortTest {

	@Test
	public void test() {
		int[] aRay = {3,5,2,4}; //even length
		int[] aRay2 = {3,5,2,4,6}; //odd length
		
		int[] results = new BubbleSort().sort(aRay);
		assertArrayEquals(results, new int[]{2,3,4,5});
		int[] results2 = new BubbleSort().sort(aRay2);
		assertArrayEquals(results2, new int[]{2,3,4,5,6});
	}

}
