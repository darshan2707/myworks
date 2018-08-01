package com.testingone.utility;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class TestLogger {
	static Logger logger = Logger.getLogger(TestLogger.class);
	
	public static void main(String[] args) {
	BasicConfigurator.configure();
	Logger log = Logger.getLogger(TestLogger.class);
	 log.info("this is log message");
	}
	
	public static void  logInfo(String str){
		
		///cucumberafw/log4j.properties
		 
	 
	        String log4jConfigFile = System.getProperty("user.dir")
	                +  "/log4j.properties";
	        PropertyConfigurator.configure(log4jConfigFile);
	        logger.debug("this is a debug log message");
	        logger.info("this is a information log message");
	        logger.warn("this is a warning log message");
	    }
		
	
}
