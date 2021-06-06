package com.technoelevate.javalogger;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

public class LoggerTest {

	final static Logger LOGGER = Logger.getLogger(LoggerTest.class.getName());

	public static void main(String[] args) {

		ConsoleHandler consoleHandler = new ConsoleHandler();
		consoleHandler.setLevel(Level.FINEST);

//		XMLFormatter xmlFormatter = new XMLFormatter();
		MyFormat format = new MyFormat();
		consoleHandler.setFormatter(format);

		LOGGER.addHandler(consoleHandler);
		LOGGER.setLevel(Level.FINEST);

		LOGGER.severe("severe msg");
		LOGGER.warning("Warning msg");
		LOGGER.info("Info msg");
		LOGGER.config("config msg");
		LOGGER.fine("fine msg");
		LOGGER.finer("finer msg");
		LOGGER.finest("finest msg");

	}
}
