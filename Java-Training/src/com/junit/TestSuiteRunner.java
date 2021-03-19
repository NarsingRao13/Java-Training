package com.junit;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestSuiteRunner {
	static Logger log = Logger.getRootLogger();
	
	public static void main(String[] args) {
		BasicConfigurator.configure();
		Result result = JUnitCore.runClasses(TestFeatureSuite.class);
		for(Failure failure : result.getFailures()) {
			log.error(failure.toString());
		}
	
		log.info(result.wasSuccessful());
	}
}
