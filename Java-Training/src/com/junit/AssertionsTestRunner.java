package com.junit;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class AssertionsTestRunner {
	static Logger logger = Logger.getRootLogger();
	public static void main(String[] args) {
		BasicConfigurator.configure();
		Result result = JUnitCore.runClasses(TestAssertions.class);
		for (Failure failure : result.getFailures()) {
			logger.error(failure.toString());
		}
		logger.info(result.wasSuccessful());
	}
}
