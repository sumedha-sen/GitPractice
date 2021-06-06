package com.te.log4j;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

public class Log4JTest {
	
	public static void main(String[] args) throws IOException {
		
		BasicConfigurator.configure();
		
		Logger logger = Logger.getLogger(Log4JTest.class);
		logger.setLevel(Level.ALL);
		
		FileAppender fileAppender = new FileAppender(new PatternLayout(), "logs.log");
		logger.addAppender(fileAppender);
		logger.trace("tracing started");
		logger.fatal("fatal msg");
		logger.error("error msg");
		logger.warn("warn msg");
		logger.info("info msg");
		logger.debug("debug msg");
		logger.trace("tracing ended");
		
	}
}
