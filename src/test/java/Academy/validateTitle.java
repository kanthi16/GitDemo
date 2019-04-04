package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//import org.testng.log4testng.Logger;

import junit.framework.Assert;
import pageObjects.landingPage;
import resources.Base;



public class validateTitle extends Base {

	
	public static org.apache.logging.log4j.Logger Log = LogManager.getLogger(Base.class.getName());

	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
		Log.info("Driver is initialized");
		driver.get(prop.getProperty("url"));
		Log.info("Navigated to Homepage");
		driver.manage().window().maximize();
	}

	@Test
	public void basePageNavigation() throws IOException {

		landingPage lp = new landingPage(driver);
		// lp.gettitle().getText();
		Assert.assertEquals(lp.gettitle().getText(), "Tutorials Library");
		Log.info("successfully validated text message");

	}

	@AfterTest
	public void teardown() {

		driver.close();

		driver = null;
	}
}