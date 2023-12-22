package testNGframeWork.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testNGframeWork.AbstractComponents.AbstractComponent;

public class LandingPage extends AbstractComponent {

	WebDriver driver; // Still knowledge will not be passed until object is created for this in stand
						// alone test.
	// Constructor to provide knowledge of driver from standalonetest.java

	public LandingPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// WebElement userEmail = driver.findElement(By.id("userEmail"));
	// driver.findElement = @FindBy => Page factory conversion
	// Page factory to reduce syntax of creating webelements
	@FindBy(id = "userEmail") // This does not have knowledge of driver so add Pagefactory step in constructor
								// for initializing.
	WebElement userEmail;

	@FindBy(id = "userPassword")
	WebElement PasswordEle;

	@FindBy(id = "login")
	WebElement login;
	
	@FindBy(css="[class*='flyInOut']")
	WebElement errorMessage;

	public ProductCatalog loginapplication(String email, String password) {
		userEmail.sendKeys(email);
		PasswordEle.sendKeys(password);
		login.click();
		ProductCatalog productcatalog = new ProductCatalog(driver);
		return productcatalog;
	}
	
	public String geterrorMessage()
	{
		waitForWebElementtoAppear(errorMessage);
		return errorMessage.getText();
	}
	public void goTo() {
		driver.get("https://rahulshettyacademy.com/client/");
	}
}
