package com.junit;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameters;

public class CalculationClass {
	private int[] arr;
	private int r;
	private Calculation calculation = new Calculation();

	static Logger log;
	static {
		 log = Logger.getRootLogger();
		 BasicConfigurator.configure();
	}
	
	
	public CalculationClass(int[] arr, int r) {
		this.arr = arr;
		this.r = r;
	}
	
//	@Before
//	public void initialize() {
//		
//	}
//	
	
	@Parameters 
	public static Collection input() {
		return Arrays.asList(new Object[][]{
			{56,new int[]{1,23,45,56}},{11,new int[]{1,23,45,56}},{111,new int[]{1,23,45,56}}
		});
	}
	
	
	
	@Test
	public void testAirthematicTest() {
		log.info("max of array:"+r);
		assertEquals(r,calculation.findMax(arr));
	}
	
	
}
