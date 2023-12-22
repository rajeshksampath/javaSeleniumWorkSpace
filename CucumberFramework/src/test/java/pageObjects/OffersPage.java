package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OffersPage {
	public WebDriver driver;

	public OffersPage(WebDriver driver) {
		this.driver = driver;
	}

	private By search = By.cssSelector("input[type='search']");
	private By productName = By.cssSelector("h4.product-name");
	private By offerpageProduct = By.cssSelector("tr td:nth-child(1)");

	public void searchItem(String name) {
		driver.findElement(search).sendKeys(name);
	}
	
	public String getProductName()
	{
		return driver.findElement(offerpageProduct).getText();
	}

}
