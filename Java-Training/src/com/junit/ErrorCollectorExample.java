package com.junit;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

public class ErrorCollectorExample {
	@Rule
	public ErrorCollector collector = new ErrorCollector();
	
	static Logger log = Logger.getRootLogger();
	static {
		BasicConfigurator.configure();
	}
	
	@Test
	public void example() {
		collector.addError(new Throwable("Error 1"));
		collector.addError(new Throwable("Error 2"));
		
		log.info("Hello");					
        try {			
            Assert.assertTrue("A " == "B");					
        } catch (Throwable t) {					
            collector.addError(t);					
        }		
        log.info("World!!!!");
	}
}
