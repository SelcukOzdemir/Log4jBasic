package com.sso.log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class HelloLog4jXML {

	static final Logger logger = Logger.getLogger(HelloLog4jXML.class);

	public static void main(String[] args) {
		DOMConfigurator.configure("log4j.xml");
		logger.debug("debug");
		logger.info("info");
		logger.warn("warn");
		logger.error("error");
		logger.fatal("fatal");
	}
}
