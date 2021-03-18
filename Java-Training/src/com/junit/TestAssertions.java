package com.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAssertions {
	@Test
	public void testAssertions() {
		String str1 = new String ("edu");
		String str2 = new String ("edu");
		String str3 = null;
		String str4 = "edu";
		String str5 = "edu";
		int val1 = 5;
		int val2 = 6;
		String[] expectedArray = {"one", "two", "three"};
		String[] resultArray = {"one", "two", "three"};
		
		assertEquals(str1,str2);
		assertTrue(val1 < val2);
		assertFalse(val1 > val2);
		assertNotNull(str5);
		assertSame(str4, str5);
		assertNotSame(str5, str3);
		assertArrayEquals(expectedArray,resultArray);
	}
}
