package testNGframeWork.PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testNGframeWork.AbstractComponents.AbstractComponent;

public class ProductCatalog extends AbstractComponent {

	WebDriver driver; // Still knowledge will not be passed until object is created for this in stand
						// alone test.
	// Constructor to provide knowledge of driver from standalonetest.java

	public ProductCatalog(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	// WebElement userEmail = driver.findElement(By.id("userEmail"));

// Page factory to reduce syntax of creating webelements
@FindBy(css = ".mb-3")
List<WebElement> products;
	
	@FindBy(css = ".ng-animating")
	WebElement spinner;
	
	By productsBy = By.cssSelector(".mb-3");
	By addToCart = By.cssSelector(".card-body button:last-of-type");
	By toastMessage = By.cssSelector("#toast-container");

	public List<WebElement> getmeProductList() {
		waitForElementtoAppear(productsBy);
		return products;
	}
	
	public WebElement getProductbyName(String productname)
	{
		WebElement prod = getmeProductList().stream().filter(product-> product.findElement(By.cssSelector("b")).getText().equalsIgnoreCase(productname)).findFirst().orElse(null);
		return prod;
			
		}
		
	public void addProductToCart(String productname) throws InterruptedException
	{
		WebElement prod = getProductbyName(productname);
		prod.findElement(addToCart).click();
		waitForElementtoAppear(toastMessage);
		waitForElementtodisappear(spinner);
		
	}

}
