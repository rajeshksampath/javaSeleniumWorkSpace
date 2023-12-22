import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserSteup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajes\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		/// String is an object that represents sequence of characters.
		
		String s = "Need courage to adapt a change";
		String [] s1= s.split(" ");
		System.out.println(s1[0]);
		System.out.println(s1[1]);
		System.out.println(s1[2]);
		System.out.println(s1[3]);
		
		//Print string in char by char
		
		for ( int i=0; i <s.length();i++)
		{ System.out.print(s.charAt(i));
		
		}
		System.out.println();
		// Print String in reverse order.
		
		for ( int j=s.length()-1; j >=0 ;j--)
		{ System.out.print(s.charAt(j));
		}
		
		Thread.sleep(30);
		driver.close(); // Closed the browser invoked 1st by selenium code.
	}

}
