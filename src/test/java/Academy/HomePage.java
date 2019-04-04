package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import pageObjects.landingPage;
import resources.Base;

public class HomePage extends Base {
	static {
        System.setProperty("log4j.configurationFile", "./src/main/java/resources/log4j2.xml");
    }
	
	public static org.apache.logging.log4j.Logger Log =LogManager.getLogger(Base.class.getName());

	@BeforeTest
	public void initialize() throws IOException {
		
		driver = initializeDriver();
		Log.info("Driver is initialized");
		driver.get(prop.getProperty("url"));
		Log.info("Navigated to Homepage");
	}

	@Test
	public void basePageNavigation() throws IOException {
		// WebDriver driver = initializeDriver();
		String url = prop.getProperty("url");
		System.out.println("Url to get = " + url);
		driver.get(url);
		driver.manage().window().maximize();

		landingPage lp = new landingPage(driver);
		lp.getclick().click();
		Log.info("successfully clicked on testing tab");
		lp.getclick1().click();
		Log.info("successfully clicked on Web tab");
		lp.getclick2().sendKeys("log4j");
		Log.info("Text");
		lp.getclick3().click();
		Log.info("successfully clicked on search tab");
	}

	@AfterTest
	public void teardown() {

		driver.close();
		driver = null;

	}

}
