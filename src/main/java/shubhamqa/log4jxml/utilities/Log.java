package shubhamqa.log4jxml.utilities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log {

	/*
	 * This Java File Contains Log Template
	 */

	private static final Logger Log = LogManager.getLogger(Log.class);

	public static void startTestCase(String startTestMsg) {

		Log.info("---------------------------------" + startTestMsg
				+ "Test Started-------------------------------------");
	}

	public static void endTestCase(String endTestMsg) {

		Log.info("---------------------------------" + endTestMsg
				+ "Test Completed-------------------------------------");
	}

	public static void info(String message) {

		Log.info(message);

	}

	public static void warn(String message) {

		Log.warn(message);

	}

	public static void error(String message) {

		Log.error(message);

	}

	public static void fatal(String message) {

		Log.fatal(message);

	}

	public static void debug(String message) {

		Log.debug(message);

	}

}
