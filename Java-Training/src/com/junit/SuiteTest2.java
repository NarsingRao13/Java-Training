package com.junit;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

@Ignore
public class SuiteTest2 {
	@Test
	public void testSecondFeature() {
		Assert.assertTrue(true);
	}

	@Test(expected = ArithmeticException.class)
	public void testArithmeticException() {
		int c = 10 / 0;
	}

	@Test
	public void testDeleteUser() {
		fail("Not yet implemented");
	}
	
	@Test(timeout = 500)
	public void testTimeout()
	{
		while(true) {
			
		}
	}
}
