package com.junit;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class JunitAnnotationsExample {
	private ArrayList<String> list;
	static Logger log =  Logger.getRootLogger();
	static {
		BasicConfigurator.configure();
	}
	
	@BeforeClass
	public static void m1() {
		log.info("Using @BeforeClass , executed before all test cases ");
	}
	
	@Before
	public void m2() {
		log.info("Using @Before annotations ,executed before each test cases ");
	}
	
	@AfterClass
	public static void m3() {
		log.info("Using @AfterClass ,executed after all test cases");	
	}
	
	@After
	public void m4() {
		 list.clear();			
		 log.info("Using @After ,executed after each test cases");	
	}
	
	@Test
	public void m5() {
		list.add("test");					
        assertFalse(list.isEmpty());			
        assertEquals(1, list.size());	
	}
	
	@Ignore
	public void m6() {
		log.info("Using @Ignore , this execution is ignored");
	}
	
	@Test(timeout = 10)
	public void m7() {
		log.info("Using @Test(timeout),it can be used to enforce timeout in JUnit4 test case");
	}
	
	@Test(expected = NoSuchMethodException.class)
	public void m8() {
		log.info("Using @Test(expected) ,it will check for specified exception during its execution");	
	}
	
	
}
