package com.study.algorithms.arrays;

import static org.junit.Assert.*;
import org.junit.Test;

public class FirstNonRepeatTest {

	@Test
	public void oddNumberDuplicate() {
		Character results = new FirstNonRepeat().firstNotRepeatingCharcacter("ccc");
		assertEquals("An odd number of repeating chars should not be mistaken" +
		"for a non-repeating character", "_", results.toString());
	}
	
	@Test
	public void singleNonDuplicate() {
		Character results = new FirstNonRepeat().firstNotRepeatingCharcacter("cahsads");
		assertEquals("Returns the first and only non-duplicate", "c", results.toString());
	}
	
	@Test
	public void firstOfTwoNonDups() {
		Character results = new FirstNonRepeat().firstNotRepeatingCharcacter("achbshadds");
		assertEquals("Returns the first of two non-duplicates", "c", results.toString());
	}

}
