package com.study.algorithms.strings.head;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class HeadTailTest {

	@Test
	public void test() {
		String s = "hello";
		char charResult  = new HeadTail().head(s);
		assertEquals('h', charResult);
		String strResult = new HeadTail().tail(s);
		assertEquals("Strings dont match","ello",strResult);
		
		int[] i = new int[]{1,2,3,4,5};
		int  intResult = new HeadTail().head(i);
		assertEquals(1, intResult);
		int[] intResult2 = new HeadTail().tail(i);
		assertArrayEquals("Arrays dont match", new int[]{2,3,4,5}, intResult2 );
	}

}
