package basics;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Point;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver.Window;

public class MultipleWindows {           //Do not change the class name
    
    //Use these declarations to store respective values
    static String parentWinHandle;
    static String childWinHandle;
    static WebDriver driver;
	
	
	public WebDriver createDriver()      //Do not change the method signature
	{
	    /* Replace this comment by the code statement to create driver, assign it to 'static' variable and return the driver */
	   driver = DriverSetup.getWebDriver();
	   return driver;
	    /* Use the URL, 'http://webapps.tekstac.com/FormRegistration/indexemi.html' */
	}
	 
    public String  getParentWindow() throws Exception {        //Do not change the method signature
        // Get  Parent Window Handle as string and return it
    	parentWinHandle = driver.getWindowHandle();
    	System.out.println(parentWinHandle);
    	return parentWinHandle;
    }
    
    public String  getChildWindow() throws Exception {         //Do not change the method signature
        // Click the href link. Find the child window's handle and return it.
    	driver.findElement(By.cssSelector("a[href*='EMICalculator.html']")).click();
    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
    	//Set<String> ids= driver.getWindowHandles();
    	System.out.println("driver of childwinhandle "+driver);
    	/*childWinHandle = driver.getWindowHandles().toArray()[1].toString();
    	 driver.switchTo().window(childWinHandle);
    	//Iterator<String>its = ids.iterator();
    	//its.next();
    	//childWinHandle = its.next();
    	System.out.println(childWinHandle);
    	return childWinHandle;*/
    	
    	for (String str1 : driver.getWindowHandles()) {
    		  //If window handle is not main window handle then close it 
    		  if(!str1.equals(parentWinHandle)){
    		  driver.switchTo().window(str1);
    		  childWinHandle = str1;
    		  // Close child windows
    		   }
    		} 
    	System.out.println(childWinHandle);
    	return childWinHandle;
    		//switch back to main window
    		//driver.switchTo().window(mainWindowHandle);
    	
        //Hint: WAIT for child page to load and find the child window handle. 
    }
    
    public WebDriver  getBackParent(String parentWinHandle) throws Exception {        //Do not change the method signature
       //Switch back to parent window and return its webdriver
    	driver.switchTo().window(parentWinHandle);
    	System.out.println(parentWinHandle);
    	System.out.println("driver of parentwindow "+driver);
    	return driver;
    }
    public String  getChildWindowTitle() throws Exception {
        //Get Child Window's title and return it
    	//System.out.println(childWinHandle);
    	//driver.switchTo().window(childWinHandle);
    	String getChildWindowTitle = driver.getTitle();
    	//String getparentWindowTitle = driver.switchTo().window(parentWinHandle).getTitle();
    	//System.out.println("Parent window title "+getparentWindowTitle);
    	//String child = driver.switchTo().window(childWinHandle);
    	
    	/*childWindow = Driver.getWindowHandles().toArray()[1].toString();

    	 Driver.switchTo().window(childWindow);

    	 System.out.println("Title of child window is : "+ Driver.getTitle());*/
    	
    	//String getChildWindowTitle= driver.getTitle();
    	System.out.println(getChildWindowTitle);
    	return getChildWindowTitle;
    }
    
    public void minimizeWindow() throws Exception{       //Do not change the method signature
       //Minimize the current window
    	driver.manage().window().setPosition(new Point(-2000, 0));
    }
    
    public void maximizeWindow() throws Exception{       //Do not change the method signature
        //Maximize the current window. Use BUILT-IN method.
    	driver.manage().window().maximize();
    }
    
    public void resizeWindow() {             //Do not change the method signature
         //Resize the current window to width=1200, height=800
    	int width = 1200;
    	int height = 800;
    	Dimension dimension = new Dimension(width, height);
    	driver.manage().window().setSize(dimension);
    }
    
    public static void main(String[] args) throws Exception {
	    MultipleWindows win=new MultipleWindows();
	    win.createDriver();
	    win.getParentWindow();
	    win.getChildWindow();
	    
	    //win.getBackParent(parentWinHandle);
	    win.getChildWindowTitle();
	    win.getBackParent(parentWinHandle);
	    win.minimizeWindow();
	    win.maximizeWindow();
	    win.resizeWindow();
	    win.maximizeWindow();
	    
	    
	   //Implement code here
	}
}
