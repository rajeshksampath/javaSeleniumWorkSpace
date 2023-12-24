package basics;

import org.openqa.selenium.WebDriver;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class NameLocator {      //DO NOT change the class name
 
    public static String baseUrl; //Assign 'http://webapps.tekstac.com/Handling_Regular_Expression/' for baseUrl
    public static WebDriver driver;
	
	public WebDriver createDriver()
	{
	    //Create driver. Assign it to static variable 'driver' and return it
	    WebDriver driver = DriverSetup.getWebDriver();
	    return driver;
	}
	
	public void navigate(WebDriver driver){
	     //Navigate to the baseUrl
	     baseUrl="http://webapps.tekstac.com/Handling_Regular_Expression/";
	     driver.get(baseUrl);
	}
	
   	public void setFormValues(WebDriver driver)
	{
	    //set the value for 'Shipment for user' and submit form
	    driver.findElement(By.id("userId")).sendKeys("Shamili");
	    driver.findElement(By.id("track")).click();
	}

    public WebElement getNameResultElement(WebDriver driver) {
        //Find the element of 'Shamili' and return it
    	WebElement getName = driver.findElement(By.xpath("//*[@id='result']/table/tbody/tr[1]/td[2]"));
    	return getName;
        
    }
    public WebElement getShipmentResultElement(WebDriver driver) {
         //Find the element of 'SHIP1236' and return it
    	WebElement shipment = driver.findElement(By.id("shipment"));
    	return shipment;
    }
    public WebElement getEmailResultElement(WebDriver driver) {
        
        //Find the element of 'shamili93@gamil.com' and return it
    	WebElement email = driver.findElement(By.id("e- mail"));
    	return email;
    }
    
    
    public boolean validateEmail(String eMailID) {
       //Validate email using regex. 
    	
           //Pattern p = Pattern.compile("^[A-Za-z].*?@gmail\\.com$");
    		Pattern p = Pattern.compile("^\\b[A-Z0-9a-z-]+@[a-z]+\\.[a-z]{2,4}\\b$");
    		Matcher m = p.matcher(eMailID);
    		//System.out.println(m);
            boolean emailVal=m.matches();
            //System.out.println(emailVal);
            return emailVal;
            
       
    }
    public boolean validateShipmentId(String shipmentId) {
        //Validate shipmentId using regex
    	  //Pattern p = Pattern.compile("^[A-Za-z].*?@gmail\\.com$");
    		Pattern p = Pattern.compile("^[A-Z0-9]{8}$");
    		Matcher m = p.matcher(shipmentId);
    		//System.out.println(m);
    		boolean id=m.matches();
    		//System.out.println(id);
            return id;
       
        
    }    
        
        
       
  
    public static void main(String[] args)
	{
	    NameLocator reg=new NameLocator();
	    WebDriver driver = reg.createDriver();
	    reg.navigate(driver);
	    reg.setFormValues(driver);
	    WebElement element = reg.getShipmentResultElement(driver);
	    String shipmentId = element.getText();
	    reg.validateShipmentId(shipmentId);
	    WebElement email = reg.getEmailResultElement(driver);
	    String eMailID = email.getText();
	    reg.validateEmail(eMailID);
	    
	    
	     //Add required code here
	}

  
}

