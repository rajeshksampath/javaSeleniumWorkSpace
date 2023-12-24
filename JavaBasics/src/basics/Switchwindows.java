package basics;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switchwindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rajes\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");

		driver.findElement(By.cssSelector("div.example a")).click();

		Set<String> ids = driver.getWindowHandles();
		Iterator<String> its = ids.iterator();
		String parentid = its.next();
		String childid = its.next();
		driver.switchTo().window(childid);
		//System.out.println(driver.getTitle());
		System.out.println(driver.findElement(By.cssSelector("div.example h3")).getText());
		driver.switchTo().window(parentid);
		//System.out.println(driver.getTitle());
		System.out.println(driver.findElement(By.cssSelector("div.example h3")).getText());

	}

}
