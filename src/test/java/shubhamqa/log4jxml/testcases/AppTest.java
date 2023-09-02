package shubhamqa.log4jxml.testcases;

import java.io.IOException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import shubhamqa.log4jxml.baseclass.BaseClass;
import shubhamqa.log4jxml.utilities.Log;



public class AppTest extends BaseClass {


	@BeforeMethod
	public void launch() {

		launchApp();

	}

	@AfterMethod
	public void teardown() {

		driver.quit();
	}

	@Test
	public void print_logs() throws InterruptedException , IOException{
		Log.info("This is INFO Log");
		Log.warn("This is Warn Log");
		Log.fatal("This is Fatal Log");
		Log.error("This is Error Log");
		Log.debug("This is Debug Log");
	}
}
