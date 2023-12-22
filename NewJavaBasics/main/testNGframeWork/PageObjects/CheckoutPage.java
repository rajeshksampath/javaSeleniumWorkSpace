package testNGframeWork.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import testNGframeWork.AbstractComponents.AbstractComponent;

public class CheckoutPage extends AbstractComponent {
	WebDriver driver;

	public CheckoutPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
@FindBy(css ="[placeholder='Select Country']")
WebElement Country;

@FindBy(css =".action__submit")
WebElement submit;

@FindBy(xpath = "(//button[contains(@class,'ta-item')])[2]")
WebElement selectcountry;

By results = By.cssSelector(".ta-results");

public void SelectCountry(String countryName) throws InterruptedException
{
	Actions a = new Actions(driver);
	a.sendKeys(Country, countryName).build().perform();
	waitForElementtoAppear(results);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,500)");
	Thread.sleep(3000);
	selectcountry.click();
	}
public ConfirmationPage SubmitOrder()
{
submit.click();
return new ConfirmationPage(driver);

}

}
