package com.junit;

import static org.junit.Assert.*;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class TestLogic {
	static Logger log = Logger.getRootLogger();
	static {
		BasicConfigurator.configure();
	}
	
	
	@Test
	public void testFindMax() {
		log.info("test");
		assertEquals(7,Calculation.findMax(new int[]{1,4,6,8}));
		assertEquals(0,Calculation.findMax(new int[]{-12,-1,-3,-4,-2}));  
	}
	
	public static void main(String[] args) { 
		log.info("main");
		Result result = JUnitCore.runClasses(TestLogic.class);
		log.info(result.wasSuccessful());
		
	}
}
