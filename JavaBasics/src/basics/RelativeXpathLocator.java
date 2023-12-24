package basics;



//Add required imports
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class RelativeXpathLocator    //DO NOT Change the class Name
{
	public WebDriver createDriver()    //DO NOT change the method signature
	{
	   //Implement code to create Driver from DriverSetup and return it
	   WebDriver driver = DriverSetup.getWebDriver();
	   return driver;
	}
	public WebElement getRelativeXpathLocator(WebDriver driver)//DO NOT change the method signature
	{
	   /*Replace this comment by the code statement to get the Web element */
	   /*Find and return the element */
	   WebElement getRelative = driver.findElement(By.xpath("//tbody/tr[2]/td[3]"));
	   return getRelative;
     
	}
	public String getName(WebElement element)//DO NOT change the method signature
	{
	    //Get the attribute value from the element and return it
	    String name = element.getText();
	    return name;
	}

  public static void main(String[] args){
	    RelativeXpathLocator pl=new RelativeXpathLocator();
	    WebDriver driver=pl.createDriver();
	    WebElement element=pl.getRelativeXpathLocator(driver);
	    String name1=pl.getName(element);
	    System.out.println(name1);
	    //Add required code
	    
	}
}

