package basics;

//Add required imports
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AbsoluteXpathLocator  //DO NOT Change the class Name
{
	public WebDriver createDriver()
	{
	   //Implement code to create Driver from DriverSetup and return it
	   WebDriver driver = DriverSetup.getWebDriver();
	   return driver;
	}
	public WebElement getAbsoluteXpathLocator(WebDriver driver)//DO NOT change the method signature
	{
	   /*Replace this comment by the code statement to get the Web element of logo */
	   /*Find and return the element */ 
	   
	  WebElement getAbsolute = driver.findElement(By.xpath("/html/body/form/div[1]/img"));
	  return getAbsolute;
     
	}
	public String getName(WebElement element)    //DO NOT change the method signature
	{
	    //Get the attribute value from the element and return it
	    String logo = element.getAttribute("src");
	    return logo;
	}

  public static void main(String[] args){
	    AbsoluteXpathLocator pl=new AbsoluteXpathLocator();
	    WebDriver driver =pl.createDriver();
	    //pl.getAbsoluteXpathLocator(driver);
	    WebElement element = pl.getAbsoluteXpathLocator(driver);
	    String logoatt = pl.getName(element);
	    System.out.println(logoatt);
	    //Add required code    
	}

}

