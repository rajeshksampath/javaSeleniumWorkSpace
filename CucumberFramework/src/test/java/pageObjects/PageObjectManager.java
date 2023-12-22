package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	LandingPage landingpage;
	OffersPage offerspage;
	WebDriver driver;
	
	public PageObjectManager(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public LandingPage getLandingPage()
	{
		landingpage = new LandingPage(driver);
		return landingpage;
	}
	
	public OffersPage OffersPage()
	{
		offerspage = new OffersPage(driver);
		return offerspage;
	}

}
