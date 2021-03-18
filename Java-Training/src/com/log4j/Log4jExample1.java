package com.log4j;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Log4jExample1 {
	static Logger log = Logger.getLogger(Log4jExample1.class.getName());

	public static void main(String[] args) {
		int i = 10;
		BasicConfigurator.configure();
		log.debug("heee");
		log.info("info" + i);
		log.info("isfjdhf'");
	}
}
