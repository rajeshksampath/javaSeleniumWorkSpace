package stepDefinitions;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import Utils.TestSetup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import pageObjects.OffersPage;
import pageObjects.PageObjectManager;

public class OfferPageStepDefinition {

	public String offerPageproductname;
	TestSetup setup;
	PageObjectManager pageobjectManager;

	public OfferPageStepDefinition(TestSetup setup) {

		this.setup = setup;
	}

	@Then("User searched for {string} in offers page")
	public void user_searched_for_same_short_name_in_offers_page(String shortName) throws InterruptedException {

		switcToOffersPage();
		
		OffersPage offersPage = new OffersPage(setup.driver);
		offersPage.searchItem(shortName);
		offerPageproductname = offersPage.getProductName();
		Thread.sleep(2000);

	}

	public void switcToOffersPage() throws InterruptedException {
		if (!(setup.driver.getCurrentUrl()
				.equalsIgnoreCase("https://rahulshettyacademy.com/seleniumPractise/#/offers"))) {
			//pageobjectManager = new PageObjectManager(setup.driver);
			LandingPage landingPage = setup.pageobjectManager.getLandingPage();
			landingPage.selectTopDealsPage();
			Set<String> tabs = setup.driver.getWindowHandles();
			Iterator<String> t1 = tabs.iterator();
			String parentwindow = t1.next();
			String childwindow = t1.next();
			setup.driver.switchTo().window(childwindow);
			Thread.sleep(2000);
		}
	}

	@Then("Validate product name in offers page matches with product name in landing page")
	public void Validate_product_name_in_offers_page_matches_with_product_name_in_landing_page() {

		Assert.assertEquals(setup.landingPageproductname, offerPageproductname);

	}

}
