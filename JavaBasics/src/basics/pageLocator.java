package basics;
//Add required imports
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageLocator    //DO NOT Change the class Name
{
	//private WebDriver driver;
	public WebDriver createDriver()  //DO NOT change the method signature
	{
	   //Invoke getWebDriver method from DriverSetup and return it
	   
	   WebDriver driver=DriverSetup.getWebDriver();
	   return driver;
	}
	
	public WebElement getPageLocator(WebDriver driver)  //DO NOT change the method signature
	{
	   /*Replace this comment by the code statement to get the WebElement of 'Lastname'*/
	   /*Find the element by id */
	   //createDriver();
	   WebElement Lastname = driver.findElement(By.id("lastname"));
	    return Lastname;
	}
	public String getName(WebElement element)  //DO NOT change the method signature
	{
	    //Get the attribute value from the element and return it
        //WebElement Lastname=getPageLocator();
	    String lname=element.getAttribute("placeholder");
	    return lname;
	}
	
	public static void main(String[] args){
	    PageLocator pl=new PageLocator();
	    WebDriver driver =pl.createDriver();
	    WebElement element=pl.getPageLocator(driver);
	    String name=pl.getName(element);
	    System.out.println("The name is "+name);
	    //Add required code
	}

}

