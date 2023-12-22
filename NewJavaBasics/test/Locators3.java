import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\rajes\\\\Desktop\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		// Traverse through sibling
		String button = driver.findElement(By.xpath("//div/button[1]/following-sibling::button[1]")).getText();
		System.out.println(button);
		Thread.sleep(2000);
		// Traverse from child to parent
		System.out.println(driver.findElement(By.xpath("//div/button[1]/parent::div/parent::header/a[2]")).getText());
	}

}
