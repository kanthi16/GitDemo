package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class landingPage {

	public WebDriver driver;

	By Testing = By.xpath("//*[@id=\"maximenuck243\"]/div[2]/ul/li[3]/span/span");

	By Web = By.xpath("//*[@id=\"maximenuck243\"]/div[2]/ul/li[5]/span/span");
By searchText=By.xpath("//*[@id=\"g-above\"]/div/div/div/div/div/div/div[1]/div[2]/div/form/input[1]");
By Search=By.xpath("//*[@id=\"g-above\"]/div/div/div/div/div/div/div[1]/div[2]/div/form/input[2]");
By Text=By.xpath("//*[@id=\"g-above\"]/div/div/div/div/div/div/h1");	



public landingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public WebElement getclick() {
		return driver.findElement(Testing);
	}

	public WebElement getclick1() {
		return driver.findElement(Web);
	}
	public WebElement getclick2() {
		return driver.findElement(searchText);
	
	}
	public WebElement getclick3() {
		return driver.findElement(Search);
	}
	public WebElement gettitle() {
		return driver.findElement(Text);
	}
	
}