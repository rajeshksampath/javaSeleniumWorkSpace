package Utils;

import org.openqa.selenium.WebDriver;

import pageObjects.PageObjectManager;

public class TestSetup {
	public WebDriver driver;
	public String landingPageproductname;
	public PageObjectManager pageobjectManager;
	
	public TestSetup()
	{
		pageobjectManager = new PageObjectManager(driver);
	}

}
