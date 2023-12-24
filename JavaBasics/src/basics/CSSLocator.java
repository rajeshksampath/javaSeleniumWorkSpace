package basics;
//Add required imports
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

public class CSSLocator     //DO NOT change the class name
{
    
	public WebDriver createDriver()  //DO NOT change the method signature
	{
	   //Implement code to create Driver from DriverSetup and return it
	   WebDriver driver = DriverSetup.getWebDriver();
	   return driver;
	}
	
	public WebElement getCSSLocator(WebDriver driver)  //DO NOT change the method signature
	{
	   /*Replace this comment by the code statement to get the Web element of username*/
	   /*Find and return the element */ 
	   WebElement Element = driver.findElement(By.cssSelector("#username"));
	   return Element;
       
	}
	
	public String getName(WebElement element)  //DO NOT change the method signature
	{
	    //Get the attribute value from the element and return it
	    String value = element.getAttribute("placeholder");
	    return value;
	}
	
    public static void main(String[] args){
	    CSSLocator pl=new CSSLocator();
	    //Add required code
	    WebDriver driver = pl.createDriver();
	    WebElement Element=pl.getCSSLocator(driver);
	    String fname=pl.getName(Element);
	    
	}
}

