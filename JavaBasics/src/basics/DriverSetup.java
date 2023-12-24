package basics;
/* IMPORTANT:- DriverSetup --getDriver()
-------------------------------------------------
PLEASE DO NOT MAKE ANY CHANGES OR MOFICATIONS IN THIS PROGRAM */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@SuppressWarnings("unused")
public class DriverSetup
{ 
    private static WebDriver driver;
    public static WebDriver getWebDriver()
	{
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajes\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    String baseUrl = "http://webapps.tekstac.com/FormRegistration/indexemi.html";
	    driver.get(baseUrl);
	    return driver;
	}
}

