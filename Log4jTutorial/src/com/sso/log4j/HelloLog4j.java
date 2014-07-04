package com.sso.log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class HelloLog4j {

	static final Logger logger = Logger.getLogger(HelloLog4j.class);

	public static void main(String[] args) {
		PropertyConfigurator.configure("log4j.properties");
		logger.debug("debug");
		logger.info("info");
		logger.warn("warn");
		logger.error("error");
		logger.fatal("fatal");
	}
}
