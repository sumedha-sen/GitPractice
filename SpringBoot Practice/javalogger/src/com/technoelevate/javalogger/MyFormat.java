package com.technoelevate.javalogger;

import java.util.Date;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class MyFormat extends Formatter {

	@Override
	public String format(LogRecord record) {

		return record.getThreadID() + " :: " + record.getSourceClassName() + " :: " + record.getSourceMethodName()
				+ " :: " + record.getMessage()+ " :: " + new Date(record.getMillis()) + "\n";
	}

}
