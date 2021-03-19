package com.junit;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class AirthematicTest {
	private int fNum;
	private int sNum;
	private int eNum;
	
	private Airthematic airthematic;
	
	static Logger log;
	static {
		 log = Logger.getRootLogger();
		 BasicConfigurator.configure();
	}
	public AirthematicTest(int fNum, int sNum, int eNum) {
		super();
		this.fNum = fNum;
		this.sNum = sNum;
		this.eNum = eNum;
	}
	
	
	



	@Before
	public void initialize() {
		airthematic = new Airthematic();
		
	}
	
	@Parameters 
	public static Collection input1() {
		return Arrays.asList(new Object[][]{
			{1,2,3},{11,22,33},{111,222,333},{10,9,19},{20,20,40},{100,21,121}
		});
	}
	
	
	@Test
	public void testAirthematicTest1() {
		log.info("sum of two num :"+eNum);
		assertEquals(eNum,airthematic.sum(fNum, sNum));
	}

	
	
}
