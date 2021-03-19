package com.junit;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class SuiteTest1 {
	@Test
	public void testFirstFeature1() {
		Assert.assertTrue(true);
	}
	
	@Test
	public void testFirstFeature2() {
		assertEquals(7,Calculation.findMax(new int[]{1,4,6,8}));
	}
	@Ignore
	@Test
	public void testFirstFeature3() {
		SuiteTest1 ob1 = new SuiteTest1();
		UserDAO ob2 = new UserDAO();
		///ob2 = ob1.save(ob2);
		
		assertNotNull(ob2.save(ob1));
	}
}
